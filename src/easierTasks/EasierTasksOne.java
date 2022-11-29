package easierTasks;

/*Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų ar šis
skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.*/

public class EasierTasksOne {
    public static void main(String[] args) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();

        int number = (int)optionalUtilities.enterNumber();

        if (number % 2 == 0) System.out.println("Ivestas skaicius yra lyginis");
        else System.out.println("Ivestas skaicius yra nelyginis");
    }
}
