package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value){
        this.value = value;
    }
    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public int read() {
        // TODO Auto-generated method stub
        return value;
    }
    
}
