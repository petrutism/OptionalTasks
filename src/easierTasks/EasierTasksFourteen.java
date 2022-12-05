package easierTasks;

public class EasierTasksFourteen {
    public static void main(String[] args) {
        String text = "rytas geras abas labas gaidys karve";
        String searcFor = "labas";
        EasierTasksFourteen ifThereIsWord = new EasierTasksFourteen();
        if (ifThereIsWord.isLabas(text, searcFor)) {
            System.out.println("Frazeje yra zodis " + searcFor);
        } else {
            System.out.println("Frazeje nera zodzio " + searcFor);
        }
        System.out.println(text.indexOf(searcFor));
    }

    private boolean isLabas(String labas, String goal) {
        return labas.indexOf(goal) >= 0;
    }
}
