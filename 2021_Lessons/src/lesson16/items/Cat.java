package lesson16.items;

import lesson16.interfaces.IMewable;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cat extends Animals implements IMewable {
    String name;

    public Cat(String kind, String subspecies, String name) {
        super(kind, subspecies);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void meow() {
        System.out.println("Meow");
    }
}
