public class Swan {
    String gender;
    String name;
    int age;
    String color;

    public void intro() {
        System.out.println("Hi, I am " + name);
    }

    public void swenInit() {
        gender = "m";
        age = 2;
        color = "black";
    }

    public void timInit() {
        gender = "m";
        age = 4;
        color = "white";
    }

    public void tinaInit() {
        gender = "w";
        age = 3;
        color = "white";
    }
}

class InitSwan {
    public static void main(String[] args) {
        Swan swen = new Swan();
        Swan tim = new Swan();
        Swan tina = new Swan();

        swen.name = "Swen";
        swen.swenInit();
        swen.intro();
        tim.name = "Tim";
        tim.timInit();
        tim.intro();
        tina.name = "Tana";
        tina.tinaInit();
        tina.intro();

    }
}