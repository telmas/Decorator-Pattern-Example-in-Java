public abstract class CarDecorator implements Car{

    protected Car tempCar;

    public CarDecorator(Car newCar){
        this.tempCar = newCar;
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription();
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice();
    }
}
