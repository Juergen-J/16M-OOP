package homework3;

public class Swan {
    String firstName;
    String color;
    int age;

    public Swan(String firstName, String color, int age) {
        this.firstName = firstName;
        this.color = color;
        this.age = age;

    }

    public void getInfo() {
        System.out.printf(" Name: %s \n  Age: %d \n Color: %s", firstName, age, color);
    }

    public void setName(String name) {
        this.firstName=name;
    }
}


