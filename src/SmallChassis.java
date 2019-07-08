public class SmallChassis extends CarDecorator {

    public SmallChassis(Car newCar) {
        super(newCar);
        System.out.println("Adding Small Chassis.");
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", with Small Chassis";
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice() + 4000.0;
    }
}
