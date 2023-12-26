Вот пример Java-кода, который реализует все шаги, о которых вы упомянули:

```java
// Шаг 1: Создание родительского класса
class Vehicle {
    // Поля
    private String brand;
    private int year;

    // Конструктор
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Метод для отображения информации о марке и годе выпуска
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Шаг 2: Создание дочернего класса
class Car extends Vehicle {
    // Дополнительное поле
    private String model;

    // Конструктор для инициализации всех полей
    public Car(String brand, int year, String model) {
        // Вызываем конструктор родительского класса
        super(brand, year);
        this.model = model;
    }

    // Шаг 3: Переписывание метода toString() в дочернем классе
    @Override
    public String toString() {
        return "Brand: " + getBrand() + "\nModel: " + model + "\nYear: " + getYear();
    }

    // Шаг 5: Перегрузка метода displayInfo() в дочернем классе
    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + model);
        System.out.println("Year: " + getYear());
    }
}

// Пример использования классов
public class Main {
    public static void main(String[] args) {
        // Создаем объект Car
        Car myCar = new Car("Toyota", 2022, "Camry");

        // Шаг 4: Перегрузка метода displayInfo() в родительском классе
        myCar.displayInfo();

        // Шаг 3: Переписывание метода toString() в дочернем классе
        System.out.println(myCar.toString());
    }
}
```

Обратите внимание, что в приведенном коде используется наследование, переопределение методов (`toString()`, `displayInfo()`) и конструкторы для инициализации полей.