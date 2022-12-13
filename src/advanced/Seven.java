package advanced;

import java.util.Scanner;

/*Write a Java program to test if a given string contains only digits. Return true or false.
Sample Output:
First string:
131231231231231231231231231212312312
true
Second string:
13123123123Z1231231231231231212312312*/
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string to chek if it is only digits: ");
        System.out.println(sc.nextLine().matches("[0-9]+"));
    }
}
