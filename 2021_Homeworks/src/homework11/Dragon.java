package homework11;

public class Dragon extends Pet {


    public Dragon(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void move() {
        System.out.println("I can fly");
    }

    @Override
    void eat() {
        System.out.println("I eat ");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n and I am Dragon" +
                "\n r-r-r-r-r"
                ;
    }
}
