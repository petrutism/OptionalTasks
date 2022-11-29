package easyTasks;

import java.util.Random;

public class EasyTasksSeven {
    public static void main(String[] args) {
        EasyTasksSeven easyTasksSeven = new EasyTasksSeven();
        Random random = new Random();
        //choose level of hardness
        int level = easyTasksSeven.level();

        //generate random number and doing tasks or go to end
        if (level != 0) {
            int val = random.nextInt(level);
            easyTasksSeven.guess(val);
        }

        System.out.println("PABAIGA");
    }
    private int level() {
        int level = 0;
        OptionalUtilities optionalUtilities = new OptionalUtilities();

        String menu = """
                Zaidimas High-Low
                Pasirinkus lygi, kompiuteris sugalvos skaiciu nuo 1 iki pasirinkto:
                1 - skaiciai iki 10
                2 - skaiciai iki 100
                3 - skaiciai iki 10000
                Bet koks kitas pasirinkimas - pabaiga\040
                """;
        System.out.println(menu);

        String input = optionalUtilities.readData();
        if (optionalUtilities.isNumeric(input)) {
            switch (input) {
                case "1" -> level = 10;
                case "2" -> level = 100;
                case "3" -> level = 1000;
            }
        }

        return level;
    }

    private void guess(int val) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        int numberOfTryings = 1;
        double number ;
        System.out.println("Spekite kompiuterio sugalvota skaiciu: ");
        System.out.println(numberOfTryings + " bandymas:");
        number = optionalUtilities.enterNumber();

        while (number != val) {
            while (number < val) {
                System.out.println("Kompiuterio sugalvotas skaicius yra didesnis");
                System.out.println("Dar karta spekite kompiuterio sugalvota skaiciu: ");
                numberOfTryings++;
                System.out.println(numberOfTryings + " bandymas:");
                number = optionalUtilities.enterNumber();
            }
            while (number > val) {
                System.out.println("Kompiuterio sugalvotas skaicius yra mazesnis");
                System.out.println("Dar karta spekite kompiuterio sugalvota skaiciu: ");
                numberOfTryings++;
                System.out.println(numberOfTryings + " bandymas:");
                number = optionalUtilities.enterNumber();
            }
        }
        System.out.println("ATSPEJOTE!!!! Kompiuterio sugalvotas skaicius yra " + (int)number);
    }

}

