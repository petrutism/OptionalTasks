package spareTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTaskOne {
    String[] names = new String[10];
    public static void main(String[] args) {
        ArrayTaskOne arrayTaskOne = new ArrayTaskOne();
        arrayTaskOne.inputNames();
        arrayTaskOne.printNames();
    }
    private void inputNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 10 vardu, po kiekvieno paspauskite ENTER ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Iveskite " + (i + 1) + " varda: ");
            this.names[i] = scanner.nextLine();
        }
    }
    private void printNames() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.names[i].toUpperCase() + " - " + this.names[i].length() + " - " + i);
        }
    }
}
