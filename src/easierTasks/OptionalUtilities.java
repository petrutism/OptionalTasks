package easierTasks;

import java.util.Scanner;

public class OptionalUtilities {
    //isNumeric
    boolean isNumeric(String line) {
        if (line == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(line);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    //readData
    String readData() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    //enter number
    double enterNumber() {
        System.out.print("Iveskite skaiciu: ");
        String skaiciusA = readData();

        while (!isNumeric(skaiciusA)) {
            System.out.print("Iveskite SKAICIU: ");
            skaiciusA = readData();
        }
        return Double.parseDouble(skaiciusA);
    }
}
