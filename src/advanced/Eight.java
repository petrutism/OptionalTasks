package advanced;

import java.util.Scanner;

/*Write a Java program to concatenate a given string with itself of a given number of times.
Sample Output:
Original string: PHP
After repeating 7 times: PHPPHPPHPPHPPHPPHPPHP*/
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String line = sc.nextLine();
        System.out.print("how many times it must repeat in new string? ");
        int times = sc.nextInt();
        StringBuilder newstring = new StringBuilder();

        for (int i= 0; i<times;i++){
            newstring.append(line);
        }
        System.out.print("New string is: " + newstring);
    }
}
