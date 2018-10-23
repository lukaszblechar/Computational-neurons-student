/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percdwwarstwy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author blech
 */
public class wizualizacja {

    public static void main(String[] args)
            throws java.io.IOException {
        String input1 = "plikperceptrondwuwynik.txt";
        BufferedReader br1 = new BufferedReader(new FileReader(input1));

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        int suma1, suma2, suma3 = 0;
        int wejscia[][] = new int[3][80];
        for (int i = 0; i < 3; i++) {
            String linia = br1.readLine();
            for (int j = 0; j < 80; j++) {
                wejscia[i][j] = linia.charAt(j) - 48;
                suma1 = wejscia[0][j] * 1;
                suma2 = wejscia[1][j] * 1;
                suma3 = wejscia[2][j] * 1;

                stringBuilder1.append(suma1);
                String finalStringprog1 = stringBuilder1.toString();
                String stringaktywacja1 = finalStringprog1;

                stringBuilder2.append(suma2);
                String finalStringprog2 = stringBuilder2.toString();
                String stringaktywacja2 = finalStringprog2;

                stringBuilder3.append(suma3);
                String finalStringprog3 = stringBuilder3.toString();
                String stringaktywacja3 = finalStringprog3;

                FileWriter fw = null;

                try {
                    fw = new FileWriter("plikperceptrondwuwynik2.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                BufferedWriter bw = new BufferedWriter(fw);
                try {
                    for (int q = 0; q < stringaktywacja1.length(); q++) {

                        if (stringaktywacja1.charAt(q) == '1') {
                            bw.write("|");
                        } else {
                            bw.write(" ");
                        }
for (int r = 0; r < stringaktywacja1.length(); r++) {

                        if (stringaktywacja2.charAt(r) == '1') {
                            bw.write("|");
                        } else {
                            bw.write(" ");
                        }

                    
                    bw.newLine();
                    
                    for (int s = 0; s < stringaktywacja1.length(); s++) {

                        if (stringaktywacja3.charAt(s) == '1') {
                            bw.write("|");
                        } else {
                            bw.write(" ");
                        }

                    }
                    bw.newLine();
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
        }
    }
}
