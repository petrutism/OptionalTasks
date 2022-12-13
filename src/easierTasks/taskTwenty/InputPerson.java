package easierTasks.taskTwenty;

import java.util.Arrays;
import java.util.Scanner;

class InputPerson {

    InputPerson() {
        doRecord(name(), surname(), age());
    }
        Scanner sc = new Scanner(System.in);

    private String name() {
        String name = "";
        while (notOnlyLetters(name)) {
            System.out.print("Iveskite varda: ");
            name = sc.nextLine();
        }
        return name;
    }

    private String surname() {
        String surname = "";
        while (notOnlyLetters(surname)) {
            System.out.print("Iveskite pavarde: ");
            surname = sc.nextLine();
        }
        return surname;
    }

    private String age() {
        String age = "";
        while (!onlyNumbers(age)) {
            System.out.print("Iveskite amziu: ");
            age = sc.nextLine();
        }
        return age;
    }

    private void doRecord(String name, String surname, String age) {
        if (Person.persons.length == 0) {
            ReadFile.readFile();
        }

        for (int i = 0; i < Person.persons.length; i++) {
            if (Person.persons[i].name.equals(name) && Person.persons[i].surname.equals(surname) && Person.persons[i].age.equals(age)) {
                System.out.println("Toks asmuo jau yra. Nieko neirasyta.");
                return;
            }
        }
        Write write = new Write();
        Person person = new Person(name, surname, age);
        Person.persons = Arrays.copyOf(Person.persons, Person.persons.length + 1);
        Person.persons[Person.persons.length - 1] = person;
        write.toFile();
        System.out.println("Naujas asmuo irasytas i sarasa");
    }

    private boolean notOnlyLetters(String text) {
        return !text.matches("[a-zA-Z]+");

    }

    private boolean onlyNumbers(String text) {
        return text.matches("[0-9]+");
    }
}
