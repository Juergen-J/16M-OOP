package homework3;

public class CommonLM {
    //    Find the  Least common multiple
//        НОК — это наименьшее общее кратное. Least common multiple
//        Метод принимает два числа. И надо найти нод. Второй метод принимает два числа и находит НОК
    public static void main(String[] args) {
        System.out.println(findLeastCommonMultiple(3, 4));//12
        System.out.println(findLeastCommonMultiple(8, 15));//120
        System.out.println(findLeastCommonMultiple(66, 3));//66
        System.out.println(findLeastCommonMultiple(12, 20));//60
    }

    private static int findLeastCommonMultiple(int m, int n) {
        for (int i = 1; ; i++) {
            if (i % m == 0 && i % n == 0) {
                return i;
            }
        }
    }
}
