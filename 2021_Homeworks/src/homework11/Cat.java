package homework11;

public class Cat extends Pet {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void move() {
        System.out.println("I can run");
    }

    @Override
    void eat() {
        System.out.println("I eat ");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n and I am Cat" +
                "\n may"
                ;
    }
}
