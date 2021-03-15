package lesson16.items;

import lesson16.interfaces.IBarkable;

public class Dog extends Animals implements IBarkable {
    String nickName;

    public Dog(String kind, String subspecies, String nickName) {
        super(kind, subspecies);
        this.nickName = nickName;
    }

    public Dog() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    @Override
    public void bark() {
        System.out.println("Bark");
    }
}
