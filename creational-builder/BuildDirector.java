public class BuildDirector {

    public void constructSportsCar(Builder builder) {
        System.out.println("Set Car Type ..");
        builder.setCarType(CarType.SPORTS_CAR);

        System.out.println("Set Seats ..");
        builder.setSeats(2);

        System.out.println("Set Engine ..");
        builder.setEngine(new Engine(3.0, 0));

        System.out.println("Set Transmission ..");
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        
        System.out.println("Set GPS Navigator  ..");
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        System.out.println("Set Car Type ..");
        builder.setCarType(CarType.CITY_CAR);

        System.out.println("Set Seats ..");
        builder.setSeats(2);

        System.out.println("Set Engine ..");
        builder.setEngine(new Engine(1.2, 0));

        System.out.println("Set Transmission ..");
        builder.setTransmission(Transmission.AUTOMATIC);

        System.out.println("Set GPS Navigator  ..");
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        System.out.println("Set Car Type ..");
        builder.setCarType(CarType.SUV);

        System.out.println("Set Seats ..");
        builder.setSeats(4);

        System.out.println("Set Engine ..");
        builder.setEngine(new Engine(2.5, 0));

        System.out.println("Set Transmission ..");
        builder.setTransmission(Transmission.MANUAL);

        System.out.println("Set GPS Navigator  ..");
        builder.setGPSNavigator(new GPSNavigator());
    }
}