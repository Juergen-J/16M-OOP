package homework09;

public class Dog extends Animal {
    private int legsNumber;
    private boolean canGuard;

    public Dog() {

    }

    public Dog(String firstName, String breed, int age, boolean live, double price, int legsNumber, boolean canGuard) {
        super(firstName, breed, age, live, price);
        this.legsNumber = legsNumber;
        this.canGuard = canGuard;
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
        System.out.println("GAV");

    }
}
