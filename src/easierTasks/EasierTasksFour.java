package easierTasks;

public class EasierTasksFour {
    private final int count = 5;
    private int[] arr;

    public static void main(String[] args) {
        int a;

        EasierTasksFour easierTasksFour = new EasierTasksFour();
        OptionalUtilities optionalUtilities = new OptionalUtilities();

        int[] area = new int[easierTasksFour.count];

        System.out.println("Iveskite " + easierTasksFour.count + " skaicius:");

        for (int i = 0; i < easierTasksFour.count; i++) {
            a = (int) optionalUtilities.enterNumber();
            area[i] = a;
        }
        easierTasksFour.arr = area;
        easierTasksFour.printArray();
    }

    private void printArray() {

        // Iterating over array using for loop

        for (int i = 0; i < count; i++) {

            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
