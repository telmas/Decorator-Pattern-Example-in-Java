public class ManualGearbox extends CarDecorator {

    public ManualGearbox(Car newCar) {
        super(newCar);
        System.out.println("Adding Manual gearbox.");
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", with Manual gearbox";
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice() + 1000.0;
    }
}
