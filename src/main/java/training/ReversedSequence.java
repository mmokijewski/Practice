package training;

// Class returns an array of integers from n to 1, where n is given and n > 0

public class ReversedSequence {

    public static int[] reverse(int n){

        if (n < 0) {
            System.out.println("Please input positive number");
            return null;
        }
        else {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = n - i;
            }
            return a;

        }
    }

    public static void main(String[] args) {
        reverse(9);
    }
}
