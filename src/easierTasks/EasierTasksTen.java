package easierTasks;

import java.util.Scanner;

public class EasierTasksTen {
    public static void main(String[] args) {
        EasierTasksTen easierTasksTen = new EasierTasksTen();
        String text = easierTasksTen.readText();

        if (text.equals("")) {
            System.out.println("Nieko neivesta");
        } else if (easierTasksTen.countOfA(text) == 0) {
            System.out.printf("Tekste '%s' 'a' raidziu nera%n", text);
        } else {
            System.out.printf("Tekste '%s' yra %s 'a' raides%n", text, easierTasksTen.countOfA(text));
        }

    }

    private String readText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite teksta: ");
        return scanner.nextLine();
    }

    private int countOfA(String text) {
        int countOfA = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                countOfA++;
            }
        }
        return countOfA;
    }
}
