package homework14.item;

public class Manager extends Employee {
    int grade; //– позиционный уровень(в диапазоне от 1 - 4).

    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSAlary, int grade) {
        super(name, id, age, company, baseSAlary);
        if (grade > 0 && grade < 5)
            this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5)
            this.grade = grade;
        else
            System.out.println("Wrong enter");
    }
}
