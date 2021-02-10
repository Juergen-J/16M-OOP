package homework3;

public class CommonMD {
    public static void main(String[] args) {
//        Find the highest common divider and Least common multiple
//        НОД — это наибольший общий делитель. Greatest common divisor
//        НОК — это наименьшее общее кратное. Least common multiple
//        Метод принимает два числа. И надо найти нод. Второй метод принимает два числа и находит НОК

        System.out.println(findGreatestCommonDivisor(1000, 10));//10
        System.out.println(findGreatestCommonDivisor(6, 9));//3
    }

    static int findGreatestCommonDivisor(int m, int n) {
        int result = 1;
        for (int i = m; i > 1; i--) {
            if (m % i == 0) {
                for (int j = n; j > 1; j--) {
                    if (n % j == 0 && j == i) {
                        return i;
                    }
                }
            }
        }
        return result;
    }
}





