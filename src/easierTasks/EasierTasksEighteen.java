package easierTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EasierTasksEighteen {
    private String filename = "C:\\Users\\diggi\\OneDrive\\Dokumentai\\Mokslai_db\\Projektai\\OOP\\OptionalTasks\\testOne.txt";

    private String[] array;
    private int count;

    private EasierTasksEighteen() {
    }

    private EasierTasksEighteen(String filename) {
        this.filename = filename;
    }

    public static void main(String[] args) throws FileNotFoundException {
        EasierTasksEighteen newFileName = new EasierTasksEighteen("C:\\Users\\diggi\\OneDrive\\Dokumentai\\Mokslai_db\\Projektai\\OOP\\OptionalTasks\\test.txt");

        newFileName.readFile(newFileName.filename);
        newFileName.printArray();
    }

    private void readFile(String filename) throws FileNotFoundException {
        try {
            Path filepath = Paths.get(filename);
            count = (int) Files.lines(filepath).count();

        } catch (Exception e) {
            e.getStackTrace();
        }

        array = new String[count];

        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextLine();
        }

    }
    private void printArray(){
        for(int i=0; i<count; i++){
            System.out.println(array[i]);
        }
    }
}
