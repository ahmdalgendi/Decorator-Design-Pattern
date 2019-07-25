package Beverage_cont;

public class Mocha extends BeverageDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 2 + this.beverage.cost();
    }

    @Override
    public String getDescription() {

        return this.beverage.getDescription() + " ,Mocha";
    }
}
