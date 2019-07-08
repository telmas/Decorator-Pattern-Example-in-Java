public class BasicCar implements Car {

    public BasicCar(){
        System.out.println("Created Car.");
    }

    @Override
    public String getDescription() {
        return "You are buying a car";
    }

    @Override
    public double getPrice() {
        return 6000.0;
    }
}
