package easierTasks.taskTwenty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class Write {
    public void toFile() {
        Path p = Paths.get(ReadFile.fileSource);
        int a = Person.persons.length - 1;
        String line;
        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
            line = System.lineSeparator() + Person.persons[a].name + " " + Person.persons[a].surname + " " + Person.persons[a].age;
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
