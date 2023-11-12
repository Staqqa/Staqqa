public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
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
        int kmPrLitre = 0;
        if (kmPrLitre >= 20) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 2340;
        } else {
            return 10470;
        }

    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }
}
