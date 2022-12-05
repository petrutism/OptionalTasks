package easierTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasierTasksTwelveThirteen {
    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File ("C:\\Users\\diggi\\OneDrive\\Dokumentai\\Mokslai_db\\Projektai\\OOP\\OptionalTasks\\test.txt");
        Scanner scanner = new Scanner(textFile);

        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if(line.charAt(0) == 'A' || line.charAt(0) == 'a'){
                System.out.println(line);
            }

            lineNumber++;
        }
    }
}
