package lesson8.inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniId;


    public Person() {
    }

    public Person(String firstName, String secondName, String uniId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniId = uniId;
    }

    void eats() {
        System.out.println("I eat");
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

    public String toString() {
        return "\n First name: " + firstName
                + "\n Second name: " + secondName +
                "\n Uni ID: " + uniId;
    }
}
