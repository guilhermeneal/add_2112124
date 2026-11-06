public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
        super();
        numberOfDoors = 0;
    }

    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        numberOfDoors = 0;
    }

    public Car(int year, String brand, String model, double price, String color, int numberOfDoors) {
        super(year, brand, model, price, color);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", " + super.toString() +
                '}';
    }
}
