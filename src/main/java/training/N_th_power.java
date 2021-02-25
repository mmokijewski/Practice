package training;

public class N_th_power {
    public static int nthPower(int[] array, int n) {

        if (n <= array.length-1)
            return (int) Math.pow(array[n],n);
        else
            return -1;
    }
}
