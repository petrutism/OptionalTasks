package easyTasks;

/*Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai. Jam sunku
pačiam tai padaryti todėl jis prašo Jūsų pagalbos. Parašykite metodą kuris patikrintų ar duotas
žodis yra polindromas (žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar
sakinys, pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”).
Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa
raidės.*/

import java.util.Scanner;

public class EasyTasksOne {

    public static void main(String[] args) {
        EasyTasksOne easytasksone = new EasyTasksOne();
        //source phrase
        System.out.println("Iveskite fraze, kuria tikrinsime, ar tai palindromas: ");
        Scanner scanner = new Scanner(System.in);
        easytasksone.isPalindrome(scanner.nextLine());
    }

    private void isPalindrome(String string) {
        int numberOfCheckCycles;
        int numberOfEquals = 0;
        int character = 0;
        string = string.replaceAll(" ", "").toUpperCase();

        if (string.length() % 2 == 1) {
            numberOfCheckCycles = (string.length() - 1) / 2;
        } else {
            numberOfCheckCycles = string.length() / 2;
        }

        int numberOfCheckedChars = numberOfCheckCycles;

        while (numberOfCheckCycles > 0) {

            if (string.charAt(character) == string.charAt(string.length() - character - 1)) {
                numberOfEquals++;
            }
            character++;
            numberOfCheckCycles--;
        }

        if (numberOfCheckedChars == numberOfEquals) {
            System.out.println("Ivesta fraze yra palindromas");
        } else {
            System.out.println("Ivesta fraze nera palindromas");
        }

    }
}
