package easierTasks;

/*Parašyti programą, kuri paprašytų įvesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
turi būti atvaizduojama įvestų skaičių suma. Skaičiavimas turi būti atliekamas kitame metode.
Papildykite programą kuri neleistų įvesti ne skaičius, jei vartotojas įveda ne skaičių programa
prašo pakartoti tol kol bus įvestas skaičius.*/

public class EasierTasksThree {
    public static void main(String[] args) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        EasierTasksThree easierTasksThree = new EasierTasksThree();
        double sum = 0;
        double a;

        a = optionalUtilities.enterNumber();

        while (a != 0){
            sum = easierTasksThree.sum(sum, a);
            a = optionalUtilities.enterNumber();
        }
        System.out.println("Suma " + sum);
    }
    private double sum (double a, double b){
        return a + b;
    }
}
