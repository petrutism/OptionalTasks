package advanced;

import java.util.Scanner;

/*Write a Java program to read a string and return true if it ends with a specified string of length 2.
Sample Output:
The given strings is: string
The string containing ng at last: true
The given strings is: strign
The string containing ng at last: false*/
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String line = sc.nextLine();
        System.out.print("Input two letters string must end: ");
        String end = sc.nextLine();
        System.out.println("The given string is: " + line);
        System.out.print("The given string containing " + end + " at last: ");
        System.out.println(line.substring(line.length()-2).equals(end));
    }
}
