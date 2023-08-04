public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String id, Car reservedCar) {
        super(name, id, reservedCar);
    }

    public SubscribersPassengers(String name, String id, Car reservedCar, double trip_cost) {
        super(name, id, reservedCar, trip_cost);
        try {
            reserveTrip();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void reserveTrip() throws Exception{
        Car car = super.getReservedCar();
        if ( car.getMax_of_passenger() > 0) {
            super.setTrip_cost(( (car.getFixedRoute().getTrip_price()) - ( (car.getFixedRoute().getTrip_price()) * 0.3) ));
        }else if (car.getMax_of_passenger() == 0) {
            throw new Exception("no place for the passenger " + getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("** Subscriber Passenger "
        + "\npassenger name: " + getName()
                + "\npassenger id: " + getId()
                + "\ncar code: " + getReservedCar().getCode()
                + "\ntrip price: " + getTrip_cost()
                + "\n  the route starts from " + getReservedCar().getFixedRoute().getStart_address()
                + "\n  to " + getReservedCar().getFixedRoute().getDist_address()
                );
    }
}
