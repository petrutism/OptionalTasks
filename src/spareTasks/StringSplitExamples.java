package spareTasks;

public class StringSplitExamples {
    public static void main(String[] args) {
        String[] simbol = new String[3];
        String str = "10 + 5";
        String[] arrOfStr = str.split(" ");   // str.split("."); will give no output... need "[.]"

        int i = 0;
        for (String a : arrOfStr){
            simbol[i] = a;
            i++;
        }

        System.out.println(simbol[0]);
        System.out.println(simbol[1]);
        System.out.println(simbol[2]);
    }
}
