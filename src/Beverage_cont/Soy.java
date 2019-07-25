package Beverage_cont;

public class Soy extends BeverageDecorator {
    Beverage beverage ;
    public  Soy(Beverage beverage){
        this.beverage =beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " ,Soy";
    }
}
