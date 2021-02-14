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
    public static String countExpression(double a){
        System.out.println("Please input only natural number");
        return ("Please input only natural number");
    }

    public static int countExpression(int a) {

        if (a < 0) {
            System.out.println("Please input only natural number");
            return 0;
        }

        else if ( a == 0 || a == 1 )
            return 1;
        else
        {
            int result = 1;
            for (int i = 2; i <= a; i = i + 2)
            {
                result *= i;
            }
            System.out.println(result);
            return result;
        }
    }


    public static void main(String[] args) {
        countExpression(9);
    }
}
