package easierTasks.taskTwenty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class ReadFile {

    ReadFile() {

        BufferedReader readFile = null;

        try {
            String[] readed;
            String strCurrentLine;

            readFile = new BufferedReader(new FileReader("C:\\Users\\diggi\\OneDrive\\Dokumentai\\Mokslai_db\\Projektai\\OOP\\OptionalTasks\\Person.txt"));

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
