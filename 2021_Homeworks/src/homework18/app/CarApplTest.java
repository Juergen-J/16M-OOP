package homework18.app;

import homework18.comparators.*;
import homework18.data.*;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;


public class CarApplTest {
    Car car1 = new Car(1980, "Carrera", "Red", 256.0, 25_000.0);
    Car car2 = new Car(1990, "Barrera", "Black", 116.0, 125_000.0);
    Car car3 = new Car(1986, "Marrera", "Blue", 156.0, 25_000.0);
    Car car4 = new Car(1982, "Parrera", "White", 800.0, 8_000.0);
    Car car5 = new Car(2021, "Vallera", "Yellow", 60.0, 2_000.0);
    Car car6 = new Car(1999, "Makarrera", "Green", 112.0, 10_000.0);
    Car car7 = new Car(1956, "01-Arrera", "Grey", 250.0, 825_000.0);
    Car car8 = new Car(1994, "Mozarrera", "Purple", 180.0, 25_000.0);
    Car car9 = new Car(2000, "Arrera", "Red", 700.0, 255_000.0);
    Car car10 = new Car(2010, "Irrera", "Pink", 400.0, 5_000.0);

    Car[] cars;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Start");
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
        System.out.println("End");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before each methods");
        cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After each methods");
    }

    @Test(timeout = 5000)//5s
    public void testComparable() {
        Arrays.sort(cars);
        Car[] ex = new Car[]{car7, car9, car2, car1, car10, car6, car3, car8, car4, car5};
        assertArrayEquals(ex, cars);

    }

    @Test
    public void testComparableByYear() {
        Arrays.sort(cars, new ComparatorByYear());
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }

    @Ignore
    @Test
    public void test2() {
        System.out.println("Test2");
    }
}