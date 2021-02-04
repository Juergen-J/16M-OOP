package ConstructorAndThis;

public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article("Berlin", "Schoene Sachen");
        Article art2 = new Article("Potsdam", "Museums");
        System.out.println(art1.title);
        System.out.println(art2.announce);

        Article art3 = new Article(1, "Haupt", "I am good!");
        System.out.println(art3.title);

    }
}
