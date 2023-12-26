public class Car extends Vehicle {

    private  String model;

    public  Car(String brand, int year, String model){
        super(brand, year);
        this.model =model;
    }
    @Override
    public  String toString(){
      String mask = "марка: % модель: %s год выпуска: %d%n ";
      return String.format(mask,this.model,this.model,this.year);


    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.model);
    }
}
public class Main {
public static void main(String[] args) {
System.out.println("Hello world!");


    }

}
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

