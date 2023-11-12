import java.util.ArrayList;


public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addFleetOfCars(Car car) {
        fleet.add(car);

    }


    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Fleet of cars: \n  ");
        for (Car car : fleet) {
            builder.append(car.toString()).append("\n");
        }
        return builder.toString();
    }
}
