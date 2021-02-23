package homework09;

public class Cat extends Animal {
    private int legsNumber;
    private boolean catchingMice;

    public Cat() {

    }

    public Cat(String firstName, String breed, int age, boolean live, double price, int legsNumber, boolean catchingMice) {
        super(firstName, breed, age, live, price);
        this.legsNumber = legsNumber;
        this.catchingMice = catchingMice;
    }

    public Cat(String firstName, String breed, int age, boolean live, double price) {
        super(firstName, breed, age, live, price);
    }

    @Override
    void move() {
        super.move();
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("May");

    }
}
