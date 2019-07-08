public class PetrolEngine extends CarDecorator {

    public PetrolEngine(Car newCar) {
        super(newCar);
        System.out.println("Adding Petrol engine.");
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", with Petrol engine";
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice() + 3000.0;
    }
}
