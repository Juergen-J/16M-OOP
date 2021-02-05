package homeworkSwans;

public class Swan {
    String gender;
    String name;
    int age;
    String color;

    public Swan() {

    }

    public Swan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Swan(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Swan(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Swan(String name, String gender, int age, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    static void printSwanArr(Swan[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Name: " + arr[i].name);
            System.out.println("Age - " + arr[i].age);
        }
        System.out.println("***************");
    }

}
