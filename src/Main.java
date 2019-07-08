public class Main {

    public static void main(String[] args) {

//        Car sportsCar = new BasicCar();
//        sportsCar = new ManualGearbox(sportsCar);
//        sportsCar = new PetrolEngine(sportsCar);
//        sportsCar = new RearwheelDrive(sportsCar);
//        sportsCar = new SmallChassis(sportsCar);
//        sportsCar = new Suspension(sportsCar);
//
//        Or

        Car sportsCar = new Suspension(new SmallChassis(new RearwheelDrive(new PetrolEngine(new ManualGearbox(new BasicCar())))));

        System.out.println("\nDescription: " + sportsCar.getDescription() + ".");
        System.out.println("Price: " + sportsCar.getPrice() + "$.");
    }
}
