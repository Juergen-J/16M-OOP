package lesson16;

public class StringBuilderIntr {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + "!";

        StringBuilder sb = new StringBuilder();
        System.out.println("sb length= " + sb.length() + " sb capacity= " + sb.capacity());
        sb = new StringBuilder(200);
        System.out.println("sb length= " + sb.length() + " sb capacity= " + sb.capacity());
        sb = new StringBuilder("Hello");
        System.out.println("sb length= " + sb.length() + " sb capacity= " + sb.capacity());
        sb.append("!");
        System.out.println("sb length= " + sb.length() + " sb capacity= " + sb.capacity());
        sb.reverse();
        String test = sb.toString();

        //================================================================================
        int maxIterations = 100000;
        long timeStamp = System.currentTimeMillis();
        concatUsingString(maxIterations);
        System.out.println("Time string:" + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        concatUsingStringBuilder(maxIterations);
        System.out.println("Time string builder:" + (System.currentTimeMillis() - timeStamp));

    }

    private static void concatUsingString(int maxIterations) {
        String str = new String();
        while (maxIterations > 0) {
            str += "a";
            maxIterations--;
        }
    }

    private static void concatUsingStringBuilder(int maxIterations) {
        StringBuilder sb = new StringBuilder();
        while (maxIterations > 0) {
            sb.append("a");
            maxIterations--;
        }
    }
}
