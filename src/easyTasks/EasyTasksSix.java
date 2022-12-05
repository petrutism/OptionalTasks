package easyTasks;

import java.util.Arrays;
import java.util.Collections;

public class EasyTasksSix {
    private Integer[] arr;
    private Integer[] temp;
    private int count;

    // to compute length of an array
    EasyTasksSix(int length) {
        arr = new Integer[length];
    }

    //main
    public static void main(String[] args) {
        EasyTasksSix easyTasksSix = new EasyTasksSix(1);

        easyTasksSix.doTheTasks();

    }

    private String menu() {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        String information = """
                a - teigiamu elementu masyve suma
                b - suma nuo 0 iki n-tojo elemento
                c - didziausias masyvo skaicius
                d - maziausias masyvo skaicius
                e - apverstas masyvas
                f - masyvo elementai nuo min iki max
                g - masyvo elementai nuo max iki min
                0 arba kitas simbolis - baigti darba
                 """;
        System.out.println(information);

        return optionalUtilities.readData();
    }

    private void doTheTasks() {
        OptionalUtilities optionalUtilities = new OptionalUtilities();

        inputElements();

        String menu = menu();
        while (!optionalUtilities.isNumeric(menu)) {
            switch (menu) {
                case "a" -> {
                    printSumOfPositives();
                    menu = menu();
                }
                case "b" -> {
                    printSumToN();
                    menu = menu();
                }
                case "c" -> {
                    maxElement();
                    menu = menu();
                }
                case "d" -> {
                    minElement();
                    menu = menu();
                }
                case "e" -> {
                    reverseArray();
                    menu = menu();
                }
                case "f" -> {
                    sortArrayMinToMax();
                    menu = menu();
                }
                case "g" -> {
                    sortArrayMaxToMin();
                    menu = menu();
                }
                default -> menu = "0";
            }
        }
        System.out.println("PABAIGA");
    }

    //to print array
    private void printArray() {

        // Iterating over array using for loop

        for (int i = 0; i < count; i++) {

            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //to print sum of positive elements in array
    private void printSumOfPositives() {
        // Iterating over array using for loop
        int positiveElementsSum = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i] > 0) {
                positiveElementsSum = positiveElementsSum + arr[i];
            }
        }

        System.out.println("Teigiamu masyvo elementu suma yra lygi " + positiveElementsSum);
        System.out.println();

    }

    //to print sum from index 0 to index n
    private void printSumToN() {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        int sumToN = 0;
        System.out.println("Iveskite elemento masyve numeri n, iki kurio skaiciuosime suma nuo pirmojo elemento: ");
        int n = (int) optionalUtilities.enterNumber();
        if (n > count) {
            n = count;
        }
        for (int i = 0; i < n; i++) {
            sumToN = sumToN + arr[i];
        }
        System.out.println("Elementu nuo 1 iki " + n + " suma yra lygi " + sumToN);

    }

    //to find and print bigest number in array
    private void maxElement() {

        int max = arr[0];

        for (int i = 0; i < count; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Didziausias skaicius masyve yra " + max);
    }

    //to find and print minimal element in array
    private void minElement() {

        int min = arr[0];

        for (int i = 0; i < count; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Maziausias skaicius masyve yra " + min);
    }

    //for input array elements
    // Adding elements more than size specified
    // to the array to illustrate dynamic nature
    // using the insert() method
    private void inputElements() {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        //EasyTasksSix numbers = new EasyTasksSix(1);
        int counter = 1;
        String information = """
                Ivedame masyvo narius sveikaisiais skaiciais po viena.
                Bet kokia raide - baigti ivedima.
                """;

        System.out.println(information);
        System.out.print("Iveskite " + counter + " masyvo elementa: ");
        String input = optionalUtilities.readData();
        while (optionalUtilities.isNumeric(input)) {
            insert(Integer.parseInt(input));
            counter++;
            System.out.print("Iveskite " + counter + " masyvo elementa: ");
            input = optionalUtilities.readData();
        }

        //eliminate zeros at the end
        Integer[] newArr = new Integer[count];
        System.arraycopy(arr, 0, newArr, 0, count);
        arr = newArr;

        System.out.print("Jusu ivestas masyvas: ");
        printArray();

    }

    //for insert new element
    private void insert(int element) {

        if (arr.length == count) {

            // Creating a new array double the size
            // of array declared above
            Integer[] newArr = new Integer[2 * count];

            // Iterating over new array using for loop
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }

            // Assigning new array to original array
            // created above
            arr = newArr;
        }

        arr[count++] = element;
    }

    //for reverse array
    private void reverseArray() {

        Integer[] newArr = new Integer[count];

        for (int i = 0; i < count; i++) {
            newArr[i] = arr[count - i - 1];
        }
        arrToTemp();
        arr = newArr;
        System.out.println("Apverstas masyvas: ");
        printArray();
        tempToArr();
    }

    //sort array min to max
    private void sortArrayMinToMax() {
        arrToTemp();
        Arrays.sort(arr);

        System.out.println("Surusiuotas didejimo tvarka masyvas: ");
        printArray();
        tempToArr();
    }

    //sort array min to max
    private void sortArrayMaxToMin() {
        arrToTemp();
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Surusiuotas mazejimo tvarka masyvas: ");
        printArray();
        tempToArr();
    }
    private void arrToTemp(){
        Integer[] temp = new Integer[count];
        System.arraycopy(arr, 0, temp, 0, count);
        this.temp = temp;
    }
    private void tempToArr(){

        if (count >= 0) System.arraycopy(temp, 0, arr, 0, count);
    }

}
