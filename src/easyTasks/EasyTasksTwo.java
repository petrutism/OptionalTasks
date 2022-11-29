package easyTasks;

/*      Parašykite programą kuri padėtu moksleiviui atlikti matematikos darbus. Jam reikia
        apskaičiuoti figūrų plotus. Visi plotai skaičiuojami atskiruose metoduose. Moksleivis įveda
        rodmenys naudodamas konsolę (Scanner sc = new Scanner(System.in)). Moksleivis gali
        pasirinkti kokios figūros plotą skaičiuos. Po to sistema paprašo įvesti matmenys reikalingus tos
        figūros ploto skaičiavimui.
        a. Apskaičiuotu stačiojo trikampio plotą. Formulė rezultatas = (a*b)/2;
        b. Stačiakampio plotas, formulė rezultatas =a*b.
        c. Kvadrato plotas, rezultatas = a^2
        d. Apskritimo plotas, Formulė rezultatas = pi*(a^2). Pi = 3.1415*/

public class EasyTasksTwo {
    public static void main(String[] args) {
        double a, b;
        EasyTasksTwo easyTasksTwo = new EasyTasksTwo();
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        int menu = easyTasksTwo.readMenu();
        while (menu < 5) {
            switch (menu) {
                case 1 -> {
                    System.out.println("Skaiciuosime staciojo trikampio plota");
                    System.out.println("Reikalinga pirma krastine");
                    a = optionalUtilities.enterNumber();
                    System.out.println("Reikalinga antra krastine");
                    b = optionalUtilities.enterNumber();
                    System.out.println("Staciojo trikampio plotas yra " + easyTasksTwo.straightTriangle(a, b));
                }
                case 2 -> {
                    System.out.println("Skaiciuosime staciakampio plota");
                    System.out.println("Reikalinga pirma krastine");
                    a = optionalUtilities.enterNumber();
                    System.out.println("Reikalinga antra krastine");
                    b = optionalUtilities.enterNumber();
                    System.out.println("Staciakampio plotas yra " + easyTasksTwo.rectangle(a, b));
                }
                case 3 -> {
                    System.out.println("Skaiciuosime kvadrato plota");
                    System.out.println("Reikalinga krastine");
                    a = optionalUtilities.enterNumber();
                    System.out.println("Kvadrato plotas yra " + easyTasksTwo.square(a));
                }
                case 4 -> {
                    System.out.println("Skaiciuosime apskritimo plota");
                    System.out.println("Reikalingas spindulys");
                    a = optionalUtilities.enterNumber();
                    System.out.println("Apskritimo plotas yra " + easyTasksTwo.round(a));
                }
            }
            menu = 5;
        }

        System.out.println("PABAIGA");
    }

    private int readMenu() {
        System.out.println("1 -> Staciojo trikampio plotas");
        System.out.println("2 -> Staciakampio plotas");
        System.out.println("3 -> Kvadrato plotas");
        System.out.println("4 -> Apskritimo plotas");
        System.out.println("Bet koks kitas pasirinkimas -> Pabaiga");
        System.out.print("PASIRINKITE: ");
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        String line = optionalUtilities.readData();
        if (!optionalUtilities.isNumeric(line)) {
            return 5;
        }
        int a = Integer.parseInt(line);
        if ((a > 0) && (a < 5)) {
            return a;
        }
        return 5;
    }

    //straight triangle
    private double straightTriangle(double a, double b) {
        return a * b / 2;
    }

    //rectangle
    private double rectangle(double a, double b) {
        return a * b;
    }

    //square
    private double square(double a) {
        return Math.pow(a, 2);
    }

    //round
    private double round(double a) {
        return 3.1415 * (Math.pow(a, 2));
    }

}


