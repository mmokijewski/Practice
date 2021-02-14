package training;

/*
    This class returns max multiple of given divisor which is lower or equals bound.
 */

public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        int value = 1;
        for (int i = 1; value <= (bound - divisor); i++)
            value = divisor * i;
        System.out.println(value);
        return value;

    }

    public static void main(String[] args) {
        maxMultiple(5,27);
    }
}