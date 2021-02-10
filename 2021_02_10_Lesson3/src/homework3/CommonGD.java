package homework3;

public class CommonGD {
    public static void main(String[] args) {
//        Find the highest common divider
//        НОД — это наибольший общий делитель. Greatest common divisor

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





