package easierTasks;

//Parašyti programą dvimačio masyvo (matricos) teigiamų elementų kiekiui surasti.

public class EasierTasksSevenEight {
    public static void main(String[] args) {
        int[][] array = new int[][]{{4, 20, -5, -6, -7}, {-5, -8, -9, 0, 80}};
        int sumPositive = 0;
        int sumBiggerAsFive = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                if (array[j][i] > 0) {
                    sumPositive = sumPositive + array[j][i];
                }
                if (array[j][i] > 5){
                    sumBiggerAsFive = sumBiggerAsFive + array[j][i];
                }
            }
        }
        System.out.println("Teigiamu elementu suma yra lygi " + sumPositive);
        System.out.println("Didesniu uz 5 elementu suma yra lygi " + sumBiggerAsFive);
    }
}
