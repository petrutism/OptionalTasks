package easierTasks.taskTwenty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class ReadFile {

    ReadFile() {
        Scanner sc = new Scanner(System.in);
        BufferedReader readFile = null;
        String fileSource ;
        String fileName = """
                Nurodykite pilna kelia iki failo.
                Faile vienoje eiluteje per tarpeli turi buti irasytas
                asmens vardas, asmens pavarde ir asmens amzius.
                """;

        System.out.println(fileName);
        fileSource = sc.nextLine();

        try {
            String[] readed;
            String strCurrentLine;

            readFile = new BufferedReader(new FileReader(fileSource));

            while ((strCurrentLine = readFile.readLine()) != null) {

                readed = strCurrentLine.split(" ");

                Person person = new Person(readed[0], readed[1], readed[2]);

                Person.persons = Arrays.copyOf(Person.persons, Person.persons.length + 1);
                Person.persons[Person.persons.length - 1] = person;
            }
            readFile.close();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (readFile != null)
                    readFile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
