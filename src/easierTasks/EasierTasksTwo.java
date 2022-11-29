package easierTasks;

/*Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.*/

public class EasierTasksTwo {
    private int count = 0;
    private int[] arr;

    public static void main(String[] args) {

        EasierTasksTwo easierTasksTwo = new EasierTasksTwo();
        OptionalUtilities optionalUtilities = new OptionalUtilities();

        System.out.println("Kiek skaiciu ivedinesite?");

        easierTasksTwo.count = (int)optionalUtilities.enterNumber();

        int[] area = new int[easierTasksTwo.count];

        for (int i = 0; i < easierTasksTwo.count; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");

            area[i] = (int) optionalUtilities.enterNumber();
        }
        easierTasksTwo.arr = area;

        System.out.println("Ivedete skaicius:");
        easierTasksTwo.printArray();

        System.out.println("Is ju didesni uz 100 yra:");
        for (int i = 0; i < easierTasksTwo.count; i++) {
            if (easierTasksTwo.arr[i] > 100) {
                System.out.print(easierTasksTwo.arr[i] + " ");
            }
        }
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
