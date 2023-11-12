public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car C1 = new GasolineCar(" CN23001 ", "Skoda", "Fabia", 4, 15);
        Car C2 = new DieselCar("CN31001", "Ford ", "S-MAX", 5, 21, true);
        Car C3 = new ElectricCar("CN90110", "Audi ", "45 E-tron", 5, 77, 531);

        fleet.addFleetOfCars(C1);
        fleet.addFleetOfCars(C2);
        fleet.addFleetOfCars(C3);

        System.out.println(fleet.toString());
        System.out.println("registration fee for the fleet is" + fleet.getTotalRegistrationFeeForFleet());


    }
}