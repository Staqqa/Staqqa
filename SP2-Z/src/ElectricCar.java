public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = batteryCapacity;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity();
    }

    private int batteryCapacity() {
        return 0;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    int getWhPrKm() {
        return batteryCapacity * 1000 / maxRange;
    }

    @Override
    public String GetMake() {
        return null;
    }

    @Override
    public String GetModel() {
        return null;
    }

    public int getRegistrationFee() {
        int fee = 0;
        int KmPrLitre = (int) Math.floor(100 / (getWhPrKm() / 91.25));
        int kmPrLitre = 0;
        if ((kmPrLitre >= 20 && (kmPrLitre <= 50))) {
            fee = 330;
        } else if ((kmPrLitre >= 15 && kmPrLitre <= 19)) {
            fee = 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            fee = 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            fee = 5500;
        } else {
            boolean b = kmPrLitre < 5;
        }
        {
            return getFee();
        }
    }

    private int getFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
