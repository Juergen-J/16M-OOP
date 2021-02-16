package library;

public class CreateArrays {
    public static int[] createIntArray(int size, int maxElement) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int) (Math.random() * maxElement);
        }
        return output;
    }

    public static double[] createDoubleArray(int size, int maxElement) {
        double[] output = new double[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random() * maxElement;
        }
        return output;
    }
}
