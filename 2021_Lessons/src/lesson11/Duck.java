package lesson11;

public class Duck extends Pet {

    void moves() {
        this.swims();
    }

    void swims() {
        System.out.println("Go");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    @Override
    public void eats() {
//        super.eats();
        System.out.println("I can eat!");
    }
}
