package homework09;

public class Animal {
    private String firstName;
    private String breed;
    private int age;
    private boolean live;
    private double price;

    public Animal() {
    }

    public Animal(String firstName, String breed, int age, boolean live, double price) {
        this.firstName = firstName;
        this.breed = breed;
        this.age = age;
        this.live = live;
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    void move() {
        System.out.println("I move");
    }

    void eat() {
        System.out.println("I eat");
    }

    void voice() {

    }
}
