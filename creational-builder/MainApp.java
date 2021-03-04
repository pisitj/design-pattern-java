public class MainApp {

    public static void main(String[] args) {
        BuildDirector director = new BuildDirector();

        Car1Builder builder1 = new Car1Builder();
        director.constructSportsCar(builder1);
        Car1 car1 = builder1.build();
        System.out.println("Car built:\n" + car1.print());

        Car2Builder builder2 = new Car2Builder();
        director.constructCityCar(builder2);
        Car2 car2 = builder2.build();
        System.out.println("Car built:\n" + car2.print());
    }

}