public class Motorcycle extends Vehicle {
    private int seats;

    public Motorcycle() {
        super();
        seats = 0;
    }

    public Motorcycle(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        seats = 0;
    }

    public Motorcycle(int year, String brand, String model, double price, String color, int seats) {
        super(year, brand, model, price, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "seats=" + seats +
                ", " + super.toString() +
                '}';
    }
}
