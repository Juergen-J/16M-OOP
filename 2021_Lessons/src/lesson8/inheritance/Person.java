package lesson8.inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniId;
    private int age;


    public Person() {
    }

    public Person(String firstName, String secondName, int age, String uniId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.uniId = uniId;
    }

    void eats() {
        System.out.println("I eat");
    }

    void walk() {
        System.out.println("I walk");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniId() {
        return uniId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "\n First name: " + firstName
                + "\n Second name: " + secondName +
                "\n Age:" + age +
                "\n Uni ID: " + uniId;
    }
}
