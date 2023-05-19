public class Container {
    private int amount;

    public Container(){
        this.amount = 0;
    }
    public int contains(){
        return amount;
    }
    public void add (int amount){
        if (amount <= 0){
            return;
        }
        if (amount + this.contains() <= 100){
            this.amount += amount;
        } else {
            this.amount = 100;
        }
    }
    public void remove (int amount){
        if (amount <= 0){
            return;
        }
        if (this.contains() - amount >= 0){
            this.amount -= amount;
        }else {
            this.amount = 0;
        }

    }
    @Override
    public String toString(){
        return this.contains() + "/100";
    }
}
