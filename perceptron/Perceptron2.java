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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author blech
 */
public class Perceptron2 {

    public static void main(String[] args)
            throws java.io.IOException {
        String input1 = "plikperceptron.txt";
        String input2 = "plikperceptron.cfg";

        BufferedReader br1 = new BufferedReader(new FileReader(input1));
        BufferedReader br2 = new BufferedReader(new FileReader(input2));

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();
        StringBuilder stringBuilder5 = new StringBuilder();

        String progistr = br1.readLine();
        String[] progitab = progistr.split(" ");
        int[] progi = new int[progitab.length];
        for (int i = 0; i < progitab.length; i++) {
            progi[i] = Integer.parseInt(progitab[i]);
             
             
        }
        System.out.println("progi"+progi[0]);

        int wejscia[][] = new int[6][80];
        for (int i = 0; i < 6; i++) {
            String linia = br1.readLine();
            for (int j = 0; j < 80; j++) {
                wejscia[i][j] = linia.charAt(j) - 48;
                //  System.out.println("wejscia "+wejscia[i][j])   
            }
        }
        //       System.out.println(Arrays.deepToString(wejscia));

        int wagi[][] = new int[5][6];
        for (int i = 0; i < 5; i++) {
            String linia = br2.readLine();
            String[] wagitab = linia.split(" ");
            for (int j = 0; j < 6; j++) {
                wagi[i][j] = Integer.parseInt(wagitab[j]);
                //System.out.println("wagi "+wagi[i][j]);          
            }
        }

        //     System.out.println(Arrays.deepToString(wagi));
        int wyjscie1, wyjscie2, wyjscie3, wyjscie4, wyjscie5, suma1, suma2, suma3, suma4, suma5, aktywacja1 = 0, aktywacja2 = 0, aktywacja3 = 0, aktywacja4 = 0, aktywacja5 = 0;

        for (int i = 0; i < 80; i++) {
            wyjscie1 = (wejscia[0][i] * wagi[0][0]) + (wejscia[1][i] * wagi[0][1]) + (wejscia[2][i] * wagi[0][2]) + (wejscia[3][i] * wagi[0][3]) + (wejscia[4][i] * wagi[0][4]) + (wejscia[5][i] * wagi[0][5]);
            suma1 = wyjscie1 - progi[0];
            wyjscie2 = (wejscia[0][i] * wagi[1][0]) + (wejscia[1][i] * wagi[1][1]) + (wejscia[2][i] * wagi[1][2]) + (wejscia[3][i] * wagi[1][3]) + (wejscia[4][i] * wagi[1][4]) + (wejscia[5][i] * wagi[1][5]);
            suma2 = wyjscie2 - progi[1];
            wyjscie3 = (wejscia[0][i] * wagi[2][0]) + (wejscia[1][i] * wagi[2][1]) + (wejscia[2][i] * wagi[2][2]) + (wejscia[3][i] * wagi[2][3]) + (wejscia[4][i] * wagi[2][4]) + (wejscia[5][i] * wagi[2][5]);
            suma3 = wyjscie3 - progi[2];
            wyjscie4 = (wejscia[0][i] * wagi[3][0]) + (wejscia[1][i] * wagi[3][1]) + (wejscia[2][i] * wagi[3][2]) + (wejscia[3][i] * wagi[3][3]) + (wejscia[4][i] * wagi[3][4]) + (wejscia[5][i] * wagi[3][5]);
            suma4 = wyjscie4 - progi[3];
            wyjscie5 = (wejscia[0][i] * wagi[4][0]) + (wejscia[1][i] * wagi[4][1]) + (wejscia[2][i] * wagi[4][2]) + (wejscia[3][i] * wagi[4][3]) + (wejscia[4][i] * wagi[4][4]) + (wejscia[5][i] * wagi[4][5]);
            suma5 = wyjscie5 - progi[4];
       //     System.out.println("wyjscie1: "+wyjscie1+" suma1: "+suma1+" wyjscie2: "+wyjscie2+" suma2 "+suma2+" wyjscie3: "+wyjscie3+ " suma3: "+suma3+" wyjscie4: "+wyjscie4+ " suma 4: " +suma4+" wyjscie5: "+wyjscie5+" suma5: "+suma5);

            if (suma1 >= 0) {
                aktywacja1 = 1;
            } else {
                aktywacja1 = 0;

            }

            if (suma2 >= 0) {
                aktywacja2 = 1;
            } else {
                aktywacja2 = 0;

            }

            if (suma3 >= 0) {
                aktywacja3 = 1;
            } else {
                aktywacja3 = 0;

            }

            if (suma4 >= 0) {
                aktywacja4 = 1;
            } else {
                aktywacja4 = 0;

            }

            if (suma5 >= 0) {
                aktywacja5 = 1;
            } else {
                aktywacja5 = 0;

            }
            System.out.println("aktywacje 1:"+aktywacja1+" 2: "+aktywacja2+" 3: "+aktywacja3+" 4: "+aktywacja4+" 5: "+aktywacja5);
            stringBuilder1.append(aktywacja1);

            String finalStringprog1 = stringBuilder1.toString();
            String stringaktywacja1[] = {finalStringprog1};
            stringBuilder2.append(aktywacja2);
            String finalStringprog2 = stringBuilder2.toString();
            String stringaktywacja2[] = {finalStringprog2};

            stringBuilder3.append(aktywacja3);
            String finalStringprog3 = stringBuilder3.toString();
            String stringaktywacja3[] = {finalStringprog3};

            stringBuilder4.append(aktywacja4);
            String finalStringprog4 = stringBuilder4.toString();
            String stringaktywacja4[] = {finalStringprog4};

            stringBuilder5.append(aktywacja5);
            String finalStringprog5 = stringBuilder5.toString();
            String stringaktywacja5[] = {finalStringprog5};
            FileWriter fw = null;

            try {
                fw = new FileWriter("plikperceptronwynik.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedWriter bw = new BufferedWriter(fw);
            try {
                for (int q = 0; q < stringaktywacja1.length; q++) {
                    bw.write(stringaktywacja1[q]);
                    bw.newLine();
                    bw.write(stringaktywacja2[q]);
                    bw.newLine();
                    bw.write(stringaktywacja3[q]);
                    bw.newLine();
                    bw.write(stringaktywacja4[q]);
                    bw.newLine();
                    bw.write(stringaktywacja5[q]);

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
/*
        int wyjscie[][] = new int[5][80];
        for (int i = 0; i < 80; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    wyjscie[k][i] = (wejscia[0][i] * wagi[j][0] + wejscia[1][i] * wagi[j][1] + wejscia[2][i] * wagi[j][2] + wejscia[3][i] * wagi[j][3] + wejscia[4][i] * wagi[j][4] + wejscia[5][i] * wagi[j][5]);
                    System.out.println(Arrays.deepToString(wyjscie));
                }
            }
        }
 */
