package training;

/*
    Class gives product of all even numbers smaller or equal than given one (only for natural numbers).
    In case of 0 and 1 it returns 1.
    e.g.:
           #1 given number:   7
              result:         6*4*2 = 48
           #2 given number:   6
              result:         6*4*2 = 48
 */

public class ProductOfEvenNumbers {
    private static int countExpression(int a) {
        int result = 1;

        if ( a == 0 || a == 1 );

        else
        {
            for (int i = 2; i <= a; i = i + 2)
            {
                result *= i;
            }

        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        countExpression(9);
    }
}
