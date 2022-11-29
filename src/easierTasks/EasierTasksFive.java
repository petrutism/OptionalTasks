package easierTasks;

public class EasierTasksFive {

    private final int count = 5;
    private String[] arr;

    public static void main(String[] args) {

        EasierTasksFive easierTasksFive = new EasierTasksFive();

        OptionalUtilities optionalUtilities = new OptionalUtilities();

        String[] area = new String[easierTasksFive.count];

        System.out.println("Iveskite " + easierTasksFive.count + " zodzius:");

        for (int i = 0; i < easierTasksFive.count; i++) {

            area[i] = optionalUtilities.readData();

        }

        easierTasksFive.arr = area;

        easierTasksFive.printArray();
    }

    private void printArray() {

        // Iterating over array using for loop

        for (int i = 0; i < count; i++) {

            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
    }

}

