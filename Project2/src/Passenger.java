public abstract class Passenger {

    private String name;
    private String id;
    private Car reservedCar;
    private double trip_cost;

    public Passenger(String name, String id, Car reservedCar) {
        this.name = name;
        this.id = id;
        this.reservedCar = reservedCar;
    }

    public Passenger(String name, String id, Car reservedCar, double trip_cost) {
        this.name = name;
        this.id = id;
        this.reservedCar = reservedCar;
        this.trip_cost = trip_cost;
    }

    public abstract void reserveTrip() throws Exception;

    public void displayInfo(){
        System.out.println("Trip Information");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }
}
