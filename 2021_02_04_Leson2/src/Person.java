public class Person {
    String firstName;
    String lastName;
    int passID;
    String date;
    boolean marriage;
    int kids;
    String gender;


    public Person(int personID, String personFName, String lastNameIn, String dateIn, boolean marriageIn, String genderIn, int kidsIn) {
        passID = personID;
        firstName = personFName;
        lastName = lastNameIn;
        date = dateIn;
        marriage = marriageIn;
        gender = genderIn;
        kids = kidsIn;
    }

    public Person(String firstNameIn, int personID) {
        firstName = firstNameIn;
        passID = personID;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person student1 = new Person("Iwor", 123456);
        System.out.println(student1.firstName);
        Person student2 = new Person("John", 654321);
        System.out.println(student2.firstName);

        Person[] group = new Person[]{student1, student2};
        System.out.println(group[0].firstName);
    }

}
