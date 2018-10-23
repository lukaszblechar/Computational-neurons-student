/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blech
 */
public class PerceptronWyjscie {

    public static void main(String[] args)
            throws java.io.IOException {
        String input1 = "plikperceptron.txt";

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br1 = new BufferedReader(new FileReader(input1));

        String sCurrentLine;
        int wartoscprogu = 0;
        int iloczyn = 0;
        int wartoscwejscia = 0;
        int suma = 0;
        int suma1 = 0;
        int waga = 0;

        while ((sCurrentLine = br1.readLine()) != null) {
//odczytaj prog z pliku
            String prog = Files.readAllLines(Paths.get("plikperceptron.txt")).get(0);
            String prog1 = String.valueOf(prog);
            wartoscprogu = Integer.parseInt(prog1);
            System.out.println("prog " + wartoscprogu);

//odczytaj wagi z pliku
            String linia = Files.readAllLines(Paths.get("plikperceptron.txt")).get(1);

            String[] strings = linia.replace("[", "").replace("]", ">").split(", ");
            List<String> stringList = new ArrayList<>();
            List<String[]> tempResult = new ArrayList<>();
            for (String str : strings) {
                if (str.endsWith(">")) {
                    str = str.substring(0, str.length() - 1);
                    if (str.endsWith(">")) {
                        str = str.substring(0, str.length() - 1);
                    }
                    stringList.add(str);
                    tempResult.add(stringList.toArray(new String[stringList.size()]));
                    stringList = new ArrayList<>();
                } else {
                    stringList.add(str);
                }
            }
            //to jest matryca wag do przeprowadzania operacji

            //           wyswietlanie matrycy wag
            /*
            for (int w = 0; w < originalArray.length; w++) {
                for (int k = 0; k < originalArray[w].length; k++) {

                    System.out.print((originalArray[w][k]) + " | ");
                }
                System.out.println();
             */
//odczytaj wartości wejść z pliku
            for (int linialicznik = 2; linialicznik < 8; linialicznik++) {
                String linijka = Files.readAllLines(Paths.get("plikperceptron.txt")).get(linialicznik);
                for (int wejscielicznik = 1; wejscielicznik < 80; wejscielicznik++) {
                    String wejscie = String.valueOf(linijka.charAt(wejscielicznik));
                    wartoscwejscia = Integer.parseInt(wejscie);
                    System.out.print(wartoscwejscia);

             //       String[][] originalArray = tempResult.toArray(new String[tempResult.size()][]);
                //    for (int q = 0; q < originalArray.length; q++) {
                   //     for (int x = 0; x < originalArray[q].length; x++) {

                        //    waga = Integer.parseInt(originalArray[x][q]);
                          //  System.out.print(waga);
                           // iloczyn = wartoscwejscia * waga;
                            //   System.out.println("iloczyn " + iloczyn);

                            //       System.out.println(" aktualna waga " + waga);
                            //       suma += iloczyn;
                            //      suma1 = suma - wartoscprogu;
                            //   System.out.println("suma z progiem " + suma1);
                        }
                    }
                }
            }
//mnozenie wartości z tabeli wag z wartościami wejść
/*
            int aktywacja;

            if (suma1 >= 0) {
                aktywacja = 1;
            } else {
                aktywacja = 0;

            }
            stringBuilder.append(aktywacja);

            String finalStringprog = stringBuilder.toString();
            String aktywacja1[] = {finalStringprog};

            FileWriter fw = null;

            try {
                fw = new FileWriter("plikperceptron2.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedWriter bw = new BufferedWriter(fw);
            try {
                for (int i = 0; i < aktywacja1.length; i++) {
                    bw.write(aktywacja1[i]);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            suma = 0;
            suma1 = 0;*/
        }
