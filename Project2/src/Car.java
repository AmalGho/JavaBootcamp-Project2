public class Car {
    private String code;
    private Route fixedRoute;
    private int max_of_passenger;

    public Car() {
    }

    public Car(String code, Route fixedRoute, int max_of_passenger) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.max_of_passenger = max_of_passenger;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMax_of_passenger() {
        return max_of_passenger;
    }

    public void setMax_of_passenger(int max_of_passenger) {
        this.max_of_passenger = max_of_passenger;
    }
}
