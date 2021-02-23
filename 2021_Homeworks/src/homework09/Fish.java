package homework09;

public class Fish extends Animal {
    private double weight;

    public Fish() {

    }

    public Fish(String firstName, String breed, int age, boolean live, double price, double weight) {
        super(firstName, breed, age, live, price);
        this.weight = weight;
    }

    @Override
    void move() {
        super.move();
        System.out.println("Only in the water");
        ;
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Bul-bul");

    }
}
