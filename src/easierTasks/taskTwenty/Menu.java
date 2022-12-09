package easierTasks.taskTwenty;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    PrintFromArray print = new PrintFromArray();
    String menutext = """ 
                        
            PASIRINKITE:
            a - Nuskaityti vartotojus is failo ir atspausdinti.
            b - Irasyti nauja vartotoja i faila.
            c - Parodyti vartotojus pagal prasoma varda.
            d - Parodyti vartotojus, kuriu vardas prasideda prasoma raide.
            e - Parodyti vartotojus, kuriu pavarde prasideda prasoma raide.
            f - Parodyti vartotojus, kuiu amzius yra didesnis, nei ivestas skaicius.
                        
            Bet koks kitas pasirinkimas - baigti darba.            
                    """;

    void menu() {

        boolean again = true;
        while (again) {
            System.out.print(menutext);
            String menu = sc.nextLine();
            switch (menu) {
                case "a" -> {
                    new ReadFile();
                    print.all();
                }
                case "b" -> new InputPerson();
                case "c" -> showByName();
                case "d" -> showByNameFirstLetter();
                case "e" -> showBySurnameFirstLetter();
                case "f" -> showByAge();
                default -> {
                    System.out.println("Baigiame darba");
                    again = false;
                }
            }
        }
    }

    private void showByName() {
        String name = "";
        while (!name.matches("[a-zA-Z]+")) {
            System.out.print("Iveskite norima varda: ");
            name = sc.nextLine();
        }
        print.byName(name);
    }
    private void showByNameFirstLetter() {
        String nameFirstChar = "";
        while (nameFirstChar.length() > 1 || !nameFirstChar.matches("[a-zA-Z]+")) {
            System.out.print("Iveskite norimo vardo pirmaja raide: ");
            nameFirstChar = sc.nextLine();
        }

        print.byNameFirstLetter(nameFirstChar.charAt(0));
    }
    private void showBySurnameFirstLetter() {
        String surNameFirstChar = "";
        while (surNameFirstChar.length() > 1 || !surNameFirstChar.matches("[a-zA-Z]+")) {
            System.out.print("Iveskite norimo vardo pirmaja raide: ");
            surNameFirstChar = sc.nextLine();
        }
        print.bySurnameFirstLetter(surNameFirstChar.charAt(0));
    }
    private void showByAge(){
        String age ="";
        while (!age.matches("[0-9]+")) {
            System.out.print("Iveskite amziu: ");
            age = sc.nextLine();
        }
        print.byAge(Integer.valueOf(age));
    }


}
