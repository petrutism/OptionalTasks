package advanced;

import java.util.Arrays;

/*Write a Java program to find first non repeating character in a string.
Sample Output:
The given string is: gibblegabbler
The first non repeated character in String is: i*/
public class Two {
    public static void main(String[] args) {

        String line = "gibblegabber";

        Boolean[] isRepeating = new Boolean[line.length()];

        Arrays.fill(isRepeating, false);

        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < line.length(); j++) {

                if (line.charAt(i) == line.charAt(j) && i != j) {
                    isRepeating[j] = true;
                }
            }
        }

        for (int i = 0; i < isRepeating.length; i++) {
            if (!isRepeating[i]) {
                System.out.println("First non repeating char in string " + line + " is: " + line.charAt(i));
                break;
            }
        }
    }
}
