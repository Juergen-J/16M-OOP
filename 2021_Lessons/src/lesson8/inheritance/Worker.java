package lesson8.inheritance;

public class Worker extends Person {
    public Worker() {
    }

    public Worker(String firstName, String secondName, String uniId) {
        super(firstName, secondName, uniId);
    }


    @Override
    void eats() {
//        super.eats();
        System.out.println("I am rich");
    }

    void works(){
        System.out.println("I work");
    }
}
