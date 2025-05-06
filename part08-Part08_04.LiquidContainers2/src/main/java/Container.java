public class Container {
    private int liquid;

    public Container(){
        this.liquid = 0;
    }

    public int contains(){
        return liquid;
    }

    public void add(int amount){
        if (liquid + amount > 100) {
            liquid = 100;
        } else {
            liquid += amount;
        }
    }

    // public void move(int amount, Container container1, Container container2) {
    //     int amountToTransfer = Math.min(container1.liquid, amount);
    //     container1.liquid -= amount;
    //     container2.liquid += amountToTransfer;

    //     if (container2.liquid > 100) {
    //         container2.liquid = 100;
    //     }
    // }

    public void remove(int amount){
        if (amount>liquid) {
            liquid = 0;
        } else {
            liquid -= amount;
        }
    }

    @Override 
    public String toString(){
        return this.liquid + "/100";
    }
}
