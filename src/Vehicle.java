public class Vehicle {

    protected String brand;

    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.printf("%s (%d)%n", this.brand, this.year);
    }


}

