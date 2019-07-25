package Beverage_cont;

public class TurkishCoffee extends  Beverage{
    public TurkishCoffee(){
        this.description = "Turkish Coffee";

    }

    @Override
    public double cost() {
        return 4;
    }
}
