public class Main {
    public static void main(String[] args) {
       Beverage beverage = new Espresso();
       beverage = new Mocha(beverage);
       beverage = new WhipCreame(beverage);
       System.out.println(beverage.getDescription());
       System.out.println(beverage.cost());
    
    }
}