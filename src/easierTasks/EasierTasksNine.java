package easierTasks;

/*
Parašyti programą funkcijos f(x) reikšmei surasti
a. jei x teigiamas, tai f(x)=2x+8,
b. jei x neteigiamas, tai f(x)=21-7x
*/

public class EasierTasksNine {
    public static void main(String[] args) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        EasierTasksNine easierTasksNine = new EasierTasksNine();
        Double x = optionalUtilities.enterNumber();

        System.out.println("f(x) = " + easierTasksNine.function(x));
    }

    //teigiamas kai >0
    // neteigiamas kai 0 arba <
    private double function(double x) {
        if (x > 0) {
            return 2 * x + 8;
        } else if (x < 0) {
            return 21 - 7 * x;
        } else {
            System.out.println("x = 0");
            return 0;
        }
    }
}
