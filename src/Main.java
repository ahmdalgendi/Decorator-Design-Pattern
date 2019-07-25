import Beverage_cont.Beverage;
import Beverage_cont.Espresso;
import Beverage_cont.Mocha;
import Beverage_cont.Soy;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        Beverage beverage1 = new Mocha(beverage);
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());



        Beverage beverage2 = new Soy(beverage1);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());


    }
}
