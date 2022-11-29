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
        if (!optionalUtilities.isNumeric(easyTasksFive.firstNumber) || !optionalUtilities.isNumeric(easyTasksFive.secondNumber)){
            System.out.println("Ivedete ne skaicius. Pakartokite. ");
            easyTasksFive.inputManipulation();
        }

        //if second number is not zero in division
        if (easyTasksFive.manipulation.equals("/") && easyTasksFive.secondNumber.equals("0")) {
            System.out.println("Dalyba is nulio negalima. Pasirinkite is naujo.. ");
            easyTasksFive.inputManipulation();
        }

        //assign values
        double first = Double.parseDouble(easyTasksFive.firstNumber);
        double second = Double.parseDouble(easyTasksFive.secondNumber);

        //do required task
        switch (easyTasksFive.manipulation) {
        case "+" -> easyTasksFive.addition(first, second);
        case "-" -> easyTasksFive.subtraction(first, second);
        case "*" -> easyTasksFive.multiplication(first, second);
        case "/" -> easyTasksFive.division(first, second);
        case "^" -> easyTasksFive.power(first, second);
    }
    }
    private void inputManipulation (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite norima atlikti veiksma, pvz: 5 + 3: ");
        this.firstNumber= sc.next();
        this.manipulation = sc.next();
        this.secondNumber = sc.next();
    }
    private void addition (double a, double b){
        System.out.printf("%s + %s = %s", a, b, a + b);
    }
    private void subtraction (double a, double b){
        System.out.printf("%s - %s = %s", a, b, a - b);
    }
    private void multiplication (double a, double b){
        System.out.printf("%s * %s = %s", a, b, a * b);
    }
    private void division (double a, double b){
        System.out.printf("%s / %s = %s", a, b, a / b);
    }
    private void power (double a, double b){
        System.out.printf("%s ^ %s = %s", a, b, Math.pow(a, b));
    }

}
