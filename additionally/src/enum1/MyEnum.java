package enum1;

public class MyEnum {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }

        System.out.println(Day.THURSDAY.ordinal());

        System.out.println(Color.RED.getCode());

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int action(int x, int y) {
            return x * y;
        }
    };

    public abstract int action(int x, int y);
}