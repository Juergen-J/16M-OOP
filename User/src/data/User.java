package data;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String nickName;
    private String passWort;
    private boolean status;

    public User() {

    }

    public User(String firstName, String lastName, int age, String nickName, String passWort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nickName = nickName;
        this.passWort = passWort;
        this.status = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWort() {
        return passWort;
    }

    public void setPassWort(String passWort) {
        this.passWort = passWort;
    }

    public String getStatus() {
        return status ? "Online" : "Offline";
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
