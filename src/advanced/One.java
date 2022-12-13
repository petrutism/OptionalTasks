package advanced;

/*Write a Java program to print after removing duplicates from a given string.
Sample Output:
The given string is: w3resource
After removing duplicates characters the new string is: w3resouc*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input new string to remove duplicates from: ");

        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder(line);

            for(int i = 0; i< sb.length() - 1; i++){
                for(int j = i + 1; j< sb.length();j++){

                    if(sb.charAt(i) == sb.charAt(j)){
                        sb.deleteCharAt(j);

                    }
                }
            }
        System.out.println(sb);
    }
}
