package easyTasks;

import java.util.Scanner;

public class EasyTasksFive {
    String firstNumber = "";
    String manipulation = "";
    String secondNumber = "";

    public static void main(String[] args) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        EasyTasksFive easyTasksFive = new EasyTasksFive();

        //enter task
        easyTasksFive.inputManipulation();

        //if entered data is numeric
        if (!optionalUtilities.isNumeric(easyTasksFive.firstNumber) || !optionalUtilities.isNumeric(easyTasksFive.secondNumber)) {
            System.out.println("Ivedete ne skaicius. Pakartokite. ");
            easyTasksFive.inputManipulation();
        }

        //assign values
        double first = Double.parseDouble(easyTasksFive.firstNumber);
        double second = Double.parseDouble(easyTasksFive.secondNumber);

        //do required task
        easyTasksFive.doTasks(easyTasksFive.manipulation, first, second);

    }

    private void inputManipulation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite norima atlikti veiksma, pvz: 5 + 3: ");

        String[] arrOfStr = sc.nextLine().split(" ");

        this.firstNumber = arrOfStr[0];
        this.manipulation = arrOfStr[1];
        this.secondNumber = arrOfStr[2];
    }

    private void doTasks(String task, double first, double second) {
        CalculatorForTaskFive calculator = new CalculatorForTaskFive();
        //do required task
        switch (task) {
            case "+" -> calculator.addition(first, second);
            case "-" -> calculator.subtraction(first, second);
            case "*" -> calculator.multiplication(first, second);
            case "/" -> calculator.division(first, second);
            case "^" -> calculator.power(first, second);
            default -> System.out.println("Kol kas negalime atlikti jusu ivesto veiksmo");
        }
    }

//    private void addition(double a, double b) {
//        System.out.printf("%s + %s = %s", a, b, a + b);
//    }
//
//    private void subtraction(double a, double b) {
//        System.out.printf("%s - %s = %s", a, b, a - b);
//    }
//
//    private void multiplication(double a, double b) {
//        System.out.printf("%s * %s = %s", a, b, a * b);
//    }
//
//    private void division(double a, double b) {
//        //if second number is zero in division
//        if (b == 0) {
//            System.out.println("Dalyba is nulio negalima.");
//        } else {
//            System.out.printf("%s / %s = %s", a, b, a / b);
//        }
//    }
//    private void power(double a, double b) {
//        System.out.printf("%s ^ %s = %s", a, b, Math.pow(a, b));
//    }

}
