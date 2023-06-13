package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List <Sensor> sensors;
    private List<Integer> averages;
   
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }

    public void addSensor(Sensor thisadd){
        sensors.add(thisadd);
    }

    @Override
    public boolean isOn() {

        boolean isOn = false;

        for (Sensor s : sensors) {
            if (s.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }

        }
        return isOn;

    }

    @Override
    public void setOn() {

        for (Sensor s : sensors) {
            s.setOn();
        }

    }

    @Override
    public void setOff() {

        for (Sensor s : sensors) {
            s.setOff();
        }

    }

    @Override
    public int read() {
        int sum = 0;
        if (isOn() && !sensors.isEmpty()) {

            for (Sensor e : sensors) {

                sum += e.read();
            }

            int average = sum / sensors.size();

            averages.add(average);

            return average;

        } else {
            throw new IllegalArgumentException("error getting average of sensors");
        }

    }

    public List<Integer> readings() {

        return averages;

    }

}
