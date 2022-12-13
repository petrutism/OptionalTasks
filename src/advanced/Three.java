package advanced;

import java.util.Scanner;

/*Write a Java program to divide a string in n equal parts.
Sample Output:
The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:
abcde
fghij
klmno
pqrst
uvwxy*/
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string to divide to equal parts: ");
        StringBuilder line = new StringBuilder(sc.nextLine());

        System.out.print("How many parts it will be?: ");
        int parts = sc.nextInt();

        if (line.length() % parts != 0) {

            System.out.println("Cannot divide string to equal parts - parts will be not the same lenght.");

        } else {
            int partLenght = line.length() / parts;

            for (int i = 0; i < parts; i++) {
                System.out.println(line.substring(i * partLenght, i * partLenght + partLenght));
            }
        }
    }
}
