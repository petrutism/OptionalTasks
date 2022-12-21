package collections.taskOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class workWithFile {

   String readTextFromFile(Scanner sc){
        String fileSource = "";
        StringBuilder textFromFile = new StringBuilder();

        boolean fileExists = false;

        BufferedReader readFile;

        String fileIntro = """
                Nurodykite pilna kelia skaitomo iki failo.
                Faile vienoje ar keliose eilutese per tarpeli turi buti irasytas
                uzkoduotas laiskas.
                """;
        System.out.println(fileIntro);

        while (fileSource.equals("") || !fileExists) {
            fileSource = sc.nextLine();
            File f = new File(fileSource);
            fileExists = f.exists();

            if(!f.exists()){
                System.out.println("Toks failas neegzistuoja. Iveskite is naujo.");
            }
        }
        try {
            String strCurrentLine;

            readFile = new BufferedReader(new FileReader(fileSource));

            while ((strCurrentLine = readFile.readLine()) != null) {

                textFromFile.append(strCurrentLine).append(" ");

            }
            readFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
//         finally {
//
//            try {
//                if (readFile != null)
//                    readFile.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
        return textFromFile.toString();
    }
}
