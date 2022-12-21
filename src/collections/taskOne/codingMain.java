package collections.taskOne;

import java.util.Scanner;

public class codingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        workWithFile readFile = new workWithFile();
        System.out.println(readFile.readTextFromFile(sc));
        CodeTable codeTable = new CodeTable();
        System.out.println(codeTable.codeTable);
    }
}
