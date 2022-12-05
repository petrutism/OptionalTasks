package easierTasks;

/*
Parašyti metodą kuris patikrina ar per parametrus paduotame žodyje yra raidžių derinių “ab”.
Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0. Užuomina:
radus “a” raidę, tikrinti ar tai nėra paskutinė žodžio raidė, ir jeigu ne, tuomet tikrinti ar sekanti
raidė (i + 1) yra “b”.
*/

import java.util.Objects;
import java.util.Scanner;

public class EasierTasksEleven {
    public static void main(String[] args) {
        EasierTasksEleven easierTasksEleven = new EasierTasksEleven();
        String text = easierTasksEleven.readText();
        int lenght = text.length();


        if (easierTasksEleven.textIsEmpty(text)) {
            System.out.println("Nieko neivesta");
        } else {
            String thereIsAB = "Tekste '" + text + "' yra junginys 'ab'";
            String thereIsNoAB = "Tekste " + text + " nera junginio 'ab'";
            System.out.println(easierTasksEleven.isAB(text.toLowerCase(), lenght) ? thereIsAB : thereIsNoAB);
        }
    }

    private boolean textIsEmpty(String text) {
        return Objects.equals(text, "");
    }

    private boolean isAB(String text, int lenght) {

        //(i<lenght -2) to avoid index of char 'a' is last situation
        for (int i = 0; i < lenght - 2; i++) {
            if (text.charAt(i) == 'a' && text.charAt(i + 1) == 'b') {
                return true;
            }
        }
        return false;
    }

    private String readText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieskosime junginio 'ab', CASE bus ignoruojamas. Iveskite teksta: ");
        return scanner.nextLine();
    }
}