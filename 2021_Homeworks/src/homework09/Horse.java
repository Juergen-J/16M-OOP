package homework09;

public class Horse extends Animal {
    private int legsNumber;
    private boolean trainedToRide;

    public Horse() {
    }

    public Horse(String firstName, String breed, int age, boolean live, double price, int legsNumber, boolean trainedToRide) {
        super(firstName, breed, age, live, price);
        this.legsNumber = legsNumber;
        this.trainedToRide = trainedToRide;
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
        System.out.println("i-i-i-i-i");
    }
}
