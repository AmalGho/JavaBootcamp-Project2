public class Route {
    private String start_address;
    private String dist_address;
    private double trip_price;

    public Route() {
    }

    public Route(String start_address, String dist_address, double trip_price) {
        this.start_address = start_address;
        this.dist_address = dist_address;
        this.trip_price = trip_price;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getDist_address() {
        return dist_address;
    }

    public void setDist_address(String dist_address) {
        this.dist_address = dist_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }
}
