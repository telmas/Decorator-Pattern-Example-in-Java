public class RearwheelDrive extends CarDecorator {
    public RearwheelDrive(Car newCar) {
        super(newCar);
        System.out.println("Adding Rearwheel drive.");
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", with Rearwheel drive";
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice() + 2000.0;
    }
}
