public class PrimeNumber {
    public static void main(String[] args) {

        findAllPrimeNumber(1000);
    }

    public static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimenumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrimenumber(int x) {
//        int border= (int) Math.sqrt(x);
//        for (int i = 2; i <= border; i++) {
//            if (x % i == 0) {
//                return false;
//            }
////        }
        if (x%2==0||x%3==0){
            return false;
        }

        return true;
    }

}
