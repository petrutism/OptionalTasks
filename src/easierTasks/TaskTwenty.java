package easierTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskTwenty {
    Person [] person;
    public static void main(String[] args) {
        TaskTwenty taskTwenty = new TaskTwenty();
        taskTwenty.readFile();
        
        Person person = new Person();
        person.setName("Mindaugas");
        System.out.println(person.getName());
    }

    private void readFile() {
        BufferedReader readFile = null;

        try {
            String strCurrentLine;

            readFile = new BufferedReader(new FileReader("C:\\Users\\diggi\\OneDrive\\Dokumentai\\Mokslai_db\\Projektai\\OOP\\OptionalTasks\\Person.txt"));

            while ((strCurrentLine = readFile.readLine()) != null) {

                System.out.println(strCurrentLine);
            }

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

