package lesson26;

public class TestPlanet {
    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy("Galaxy");
        Planet p1 = new Planet("Planet1", 12345L, 111_000);
        Planet p2 = new Planet("Planet2", 3324345L, 11_000);
        Planet p3 = new Planet("Planet3", 2223545L, 201_000);
        Planet p4 = new Planet("Planet4", 123465L, 167_000);
        Planet p5 = new Planet("Planet5", 82345L, 999_000);
        Planet p6 = new Planet("Planet6", 62345L, 17_000);

        galaxy.addPlanet(p1);
        galaxy.addPlanet(p2);
        galaxy.addPlanet(p3);
        galaxy.addPlanet(p4);
        galaxy.addPlanet(p5);
        galaxy.addPlanet(p6);

        System.out.println(galaxy);
    }
}
