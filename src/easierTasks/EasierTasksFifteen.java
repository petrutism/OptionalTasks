package easierTasks;

public class EasierTasksFifteen {
    public static void main(String[] args) {
        EasierTasksFifteen easierTasksFifteen = new EasierTasksFifteen();
        String text = "laba diena su vistiena ir karviena ir jautiena";
        int count = easierTasksFifteen.wordsCount(text);
        System.out.println("Tekste '" + text + "' yra " + count + " zodziai");
    }
    private int wordsCount (String text){
        String[] arrOfStr = text.split(" ");
        return arrOfStr.length;
    }
}
