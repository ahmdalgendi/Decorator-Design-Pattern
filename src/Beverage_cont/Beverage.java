package Beverage_cont;

public abstract class Beverage {
    String description = "Unkowen Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

