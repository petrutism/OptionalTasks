package easyTasks;

public class CalculatorForTaskFive {
    void addition(double a, double b) {
        System.out.printf("%s + %s = %s", a, b, a + b);
    }

    void subtraction(double a, double b) {
        System.out.printf("%s - %s = %s", a, b, a - b);
    }

    void multiplication(double a, double b) {
        System.out.printf("%s * %s = %s", a, b, a * b);
    }

    void division(double a, double b) {
        //if second number is zero in division
        if (b == 0) {
            System.out.println("Dalyba is nulio negalima.");
        } else {
            System.out.printf("%s / %s = %s", a, b, a / b);
        }
    }
    void power(double a, double b) {
        System.out.printf("%s ^ %s = %s", a, b, Math.pow(a, b));
    }
}
