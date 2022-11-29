package easyTasks;

public class EasyTasksThree {
    public static void main(String[] args) {

        OptionalUtilities optionalUtilities = new OptionalUtilities();
        EasyTasksThree easyTasksThree = new EasyTasksThree();

        System.out.println("INFORMACIJA: jei reikia, dedame ne tašką, o kablelį, pvz.: 12,74");
        System.out.print("Reikalingas Jusu svoris, kilogramais. ");
        double weight = optionalUtilities.enterNumber();

        while (weight <= 0) {
            System.out.println("Svoris per mazas, iveskite teisinga: ");
            weight = optionalUtilities.enterNumber();
        }

        System.out.print("Reikalingas Jusu ugis, metrais. ");
        double height = optionalUtilities.enterNumber();

        while (height <= 0) {
            System.out.println("Ugis per mazas, iveskite teisinga");
            height = optionalUtilities.enterNumber();
        }

        System.out.println("Jusu KMI yra:" + easyTasksThree.bmi(weight, height));
        System.out.println("PABAIGA");
    }

    private double bmi(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
