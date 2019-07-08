public class Suspension extends CarDecorator {

    public Suspension(Car newCar) {
        super(newCar);
        System.out.println("Adding Suspension.");
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", with good Suspension";
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice() + 1500.0;
    }
}
