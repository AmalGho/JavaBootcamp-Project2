import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("Riyadh", "aloula",300);
        Route r2 = new Route("jeddah", "riyadh", 400);

        Car c1 = new Car("123", r1, 12);
        Car c2 = new Car("456", r2, 0);

        SubscribersPassengers subscribersPassengers = new SubscribersPassengers("Amal", "11", c1);
        NonSubscribersPassengers nonSubscribersPassengers1 = new NonSubscribersPassengers("Nada","234", c1, true);
        NonSubscribersPassengers nonSubscribersPassengers2 = new NonSubscribersPassengers("Manal","234", c1, false);
        NonSubscribersPassengers nonSubscribersPassengers = new NonSubscribersPassengers("Mona","234", c2, false);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(subscribersPassengers);
        passengers.add(nonSubscribersPassengers);
        passengers.add(nonSubscribersPassengers1);
        passengers.add(nonSubscribersPassengers2);

        System.out.println();

        try {
            passengers.get(0).reserveTrip();
            passengers.get(0).displayInfo();
            System.out.println();
            passengers.get(2).reserveTrip();
            passengers.get(2).displayInfo();
            System.out.println();
            passengers.get(3).reserveTrip();
            passengers.get(3).displayInfo();
            System.out.println();
            passengers.get(1).reserveTrip();
            passengers.get(1).displayInfo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}