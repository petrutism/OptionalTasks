package advanced;
/*Write a Java program to read a string and return the string without the first two characters.
Keep the first character if it is 'g' and keep the second character if it is 'h'.
Sample Output:
The given strings is: goat
The new string is: gat
The given strings is: photo
The new string is: hoto
The given strings is: ghost
The new string is: ghost*/

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        StringBuilder line = new StringBuilder(sc.nextLine());

        if(line.charAt(0) != 'g'){
            line.deleteCharAt(0);
            System.out.println(line);
            return;
        }
        if(line.charAt(1) != 'h'){
            line.deleteCharAt(1);
            System.out.println(line);
            return;
        }
        System.out.println(line);
    }
}
