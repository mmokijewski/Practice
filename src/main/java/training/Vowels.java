package training;

/*
Class return the number (count) of vowels in the given string (only lower case letters)
 */

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y')
                    vowelsCount ++;
        return vowelsCount;
    }
    public static void main(String[] args) {
        getCount("lalau");
    }
}
