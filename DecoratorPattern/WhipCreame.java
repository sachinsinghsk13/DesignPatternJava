public class WhipCreame extends CondimentDecorator {
    protected Beverage beverage;

    WhipCreame(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip Creame";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.32;
    }

}