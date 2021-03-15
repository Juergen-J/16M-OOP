package lesson16.items;

import lesson16.interfaces.*;

public class Tuki extends Animals implements Ichirik, IBarkable {
    String color;
    String nick;

    public Tuki(String kind, String subspecies, String color, String nick) {
        super(kind, subspecies);
        this.color = color;
        this.nick = nick;
    }

    public Tuki() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Tuki{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", color='" + color + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public void chirik() {
        System.out.println("Chirik");
    }

    @Override
    public void bark() {
        System.out.println("Bark-Chirik");
    }
}
