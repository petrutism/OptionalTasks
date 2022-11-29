package easyTasks;

import static java.lang.Math.abs;

public class EasyTasksFour {
    public static void main(String[] args) {
        OptionalUtilities optionalUtilities = new OptionalUtilities();
        EasyTasksFour easyTasksFour = new EasyTasksFour();

        System.out.print("Kiek kilometru nuvaziavote? ");
        double distance = optionalUtilities.enterNumber();

        System.out.print("Kiek sunaudojote degalu? ");
        double fuel = optionalUtilities.enterNumber();

        easyTasksFour.average(distance, fuel);

    }

    private void average(double distance, double fuel) {
        //--------if distance 0---------

        if (distance == 0 && fuel == 0) {
            System.out.println("Nei vaziavote nei ka, sanaudos 0...");
            return;
        }
        if (distance == 0 && fuel < 0) {
            System.out.println("Niekur nevaziuota, kuras papildytas " + abs(fuel) + " l");
            return;
        }
        if (distance == 0 && fuel > 0) {
            System.out.println("Isdeginote kura stovedami vietoje " + fuel + " l ir tiek...");
            return;
        }

        //--------- if distance < 0 ---------
        if (distance < 0 && fuel == 0) {
            System.out.println("Stumti atbuline eiga neuzsivedus kuro nereikia. Sanaudos 0.");
            return;
        }

        if (distance < 0 && fuel < 0) {
            System.out.println("Stumta atbuline eiga " + abs(distance) + " km, kazkas dar papilde baka " + abs(fuel) + " l");
            return;
        }
        if (distance < 0 && fuel > 0) {
            System.out.println("Isdeginta kura vaziuodamas atbuline eiga vidutiniskai " + fuel * 100 / abs(distance) + " l 100 km ir tiek...");
            return;
        }


        //------if distance > 0------
        if (fuel == 0) {
            System.out.println("Automobilis varomas minties jega. Sanaudos 0.");
            return;
        }
        if (fuel < 0) {
            System.out.println("Vaziuojant kazkas dar papilde baka " + abs(fuel) + " l");
            return;
        }

        System.out.println("Vidutines kuro sanaudos yra " + fuel * 100 / distance + " l 100 km");

    }
}
