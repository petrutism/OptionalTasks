package advanced;

import java.util.Scanner;

/*Write a Java program to read two strings append them together and return the result.
If the strings are different lengths, remove characters from the beginning of longer string and make them equal length.
Sample Output:
The given strings is: Welcome and home
The new string is: comehome*/
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first string: ");
        StringBuilder first = new StringBuilder(sc.nextLine());
        System.out.print("Input second string: ");
        StringBuilder second = new StringBuilder(sc.nextLine());

        if (first.length() < second.length()) {

            second.delete(0, second.length() - first.length());
            System.out.println(first.append(second));

        } else if (second.length() < first.length()) {

            first.delete(0, first.length() - second.length());
            System.out.println(first.append(second));

        } else {
            System.out.println(first.append(second));
        }
    }
}
