package Beverage_cont;

public class Espresso extends  Beverage {
    public Espresso(){
        this.description = "Espresso";
    }
    @Override
    public double cost() {
        return 2;
    }

}
