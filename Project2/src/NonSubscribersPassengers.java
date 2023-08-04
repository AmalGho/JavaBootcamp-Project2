public class NonSubscribersPassengers extends Passenger {

    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String id, Car reservedCar, boolean discountCoupon) {
        super(name, id, reservedCar);
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribersPassengers(String name, String id, Car reservedCar, double trip_cost, boolean discountCoupon) {
        super(name, id, reservedCar, trip_cost);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveTrip() throws Exception{
        Car car = super.getReservedCar();
        if (car.getMax_of_passenger() > 0) {
            if (discountCoupon) {
                super.setTrip_cost(( (car.getFixedRoute().getTrip_price()) - ( (car.getFixedRoute().getTrip_price()) * 0.1) ));
            }else super.setTrip_cost(car.getFixedRoute().getTrip_price());

        }else if (car.getMax_of_passenger() == 0) {
            throw new Exception("no place for the passenger " + getName());
        }


    }

    public void displayInfo() {
        System.out.println("** non Subscriber Passenger "
                + "\npassenger name: " + getName()
                + "\npassenger id: " + getId()
                + "\ncar code: " + getReservedCar().getCode()
                + "\ntrip price: " + getTrip_cost()
                + "\n  the route starts from " + getReservedCar().getFixedRoute().getStart_address()
                + "\n  to " + getReservedCar().getFixedRoute().getDist_address()
        );
    }
}
