/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author lblechar
 */
public class Perceptron {

    /**
     * @param args the command line arguments
     */
    public static void kupa() {
        //wygeneruj wagi w tabeli 

        Random losowawaga = new Random();
        int[][] macierzwag = new int[5][6];
        System.out.println(macierzwag[0].length);
        for (int w = 0; w < macierzwag.length; w++) {
            for (int k = 0; k < macierzwag[w].length; k++) {
                macierzwag[w][k] = losowawaga.nextInt(10);
                System.out.print((macierzwag[w][k] + " "));
            }
        }
        System.out.println();
        //     String macierzwag1 = Arrays.deepToString(macierzwag);
        FileWriter fw = null;

        try {
            fw = new FileWriter("plikperceptron.cfg");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            for (int w = 0; w < macierzwag.length; w++) {
                for (int k = 0; k < macierzwag[w].length; k++) {
                    bw.write(macierzwag[w][k]+" ");
                }
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
    }

    public static void main(String[] args) {
        kupa();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();
        StringBuilder stringBuilder5 = new StringBuilder();
        StringBuilder stringBuilder6 = new StringBuilder();
        StringBuilder stringBuilder8 = new StringBuilder();
// wygeneruj wartosci wejsc (xsi)
        int a, x1, x2, x3, x4, x5, x6;

        for (a = 1; a < 81; a++) {

            if (Math.random() < 0.5) {
                x1 = 0;
            } else {
                x1 = 1;
            }
            stringBuilder.append(x1);
            String finalString1 = stringBuilder.toString();

//2
            if (Math.random() < 0.5) {
                x2 = 0;
            } else {
                x2 = 1;
            }
            stringBuilder1.append(x2);
            String finalString2 = stringBuilder1.toString();

//3
            if (Math.random() < 0.5) {
                x3 = 0;
            } else {
                x3 = 1;
            }
            stringBuilder2.append(x3);
            String finalString3 = stringBuilder2.toString();
//4

            if (Math.random() < 0.5) {
                x4 = 0;
            } else {
                x4 = 1;
            }
            stringBuilder3.append(x4);
            String finalString4 = stringBuilder3.toString();
//5

            if (Math.random() < 0.5) {
                x5 = 0;
            } else {
                x5 = 1;
            }
            stringBuilder4.append(x5);
            String finalString5 = stringBuilder4.toString();
//6

            if (Math.random() < 0.5) {
                x6 = 0;
            } else {
                x6 = 1;
            }
            stringBuilder5.append(x6);
            String finalString6 = stringBuilder5.toString();

            String[] linie = {finalString1, finalString2, finalString3, finalString4, finalString5, finalString6};

// prog
            String prog = ("14 " + "11 " + "18 " + "10 " + "13");

            FileWriter fw = null;

            try {
                fw = new FileWriter("plikperceptron.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedWriter bw = new BufferedWriter(fw);
            try {

                bw.write(prog);
                bw.newLine();

                for (int i = 0; i < linie.length; i++) {
                    bw.write(linie[i]);
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

        }
    }
}
