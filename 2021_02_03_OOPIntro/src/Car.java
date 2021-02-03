public class Car {
    int wheels = 4;
    int mileAge;
    String color;
    String carID;
    int doors;
    String brand;
    String label;
    boolean registratoin;

    public void move(int distance) {
        System.out.println("Go");
        mileAge += distance;
    }

    public void displayInfo() {
        System.out.println(brand);
        System.out.println(label);
        System.out.println("Wheels: " + wheels);
        System.out.println("Mile age: " + mileAge);
        System.out.println("Color: " + color);
        System.out.println("ID: " + carID);
        System.out.println("Doors: " + doors);
        System.out.println("Zulassung: " + (registratoin ? "yes" : "no"));
    }

}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car toyota = new Car();
        Car audi = new Car();
        audi.move(1200);
        audi.displayInfo();
    }
}
