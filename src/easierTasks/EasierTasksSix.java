package easierTasks;

/*Parašykite metodą kuris per parametrus paimtu du masyvus [1,2,3,4] ir [a,b,c,d] ir kaip
rezultatą grąžintu [1,a,2,b,3,c,4,d] kaip rezultatą.*/

public class EasierTasksSix {
    public static void main(String[] args) {
        int[] a = (new int[]{1, 2, 3, 4, 5});
        String[] b = (new String[]{"a", "b", "c", "d", "e"});

        EasierTasksSix easierTasksSix = new EasierTasksSix();

        String[] d = easierTasksSix.combinedArrays(a, b);

        for (int i = 0; i < 10; i++) {
            System.out.print(d[i] + " ");
        }

    }

    private String[] combinedArrays(int[] a, String[] b) {
        String[] c = new String[10];

        for (int i = 0; i < 5; i++) {
            c[i * 2] = String.valueOf(a[i]);
            c[i * 2 + 1] = b[i];
        }
        return c;
    }
}
