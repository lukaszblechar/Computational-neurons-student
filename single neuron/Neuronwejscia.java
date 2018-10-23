/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author blech
 */
public class Neuronwejscia {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();
        StringBuilder stringBuilder5 = new StringBuilder();
        StringBuilder stringBuilder6 = new StringBuilder();
        StringBuilder stringBuilder7 = new StringBuilder();
        StringBuilder stringBuilder8 = new StringBuilder();

        int d = 11;
        int c;
        int prog = 20;
        int waga1, waga2, waga3, waga4, waga5, waga6, waga7, waga8;

        double wagad1 = Math.random() * 10;

        waga1 = (int) Math.round(wagad1);
        if (waga1 == 10) {
            waga1 = 9;
        }
        stringBuilder.append(waga1);
        String finalString1 = stringBuilder.toString();
        //2
        double wagad2 = Math.random() * 10;

        waga2 = (int) Math.round(wagad2);
        if (waga2 == 10) {
            waga2 = 9;
        }
        stringBuilder1.append(waga2);
        String finalString2 = stringBuilder1.toString();
        //3

        double wagad3 = Math.random() * 10;

        waga3 = (int) Math.round(wagad3);
        if (waga3 == 10) {
            waga3 = 9;
        }
        stringBuilder2.append(waga3);
        String finalString3 = stringBuilder2.toString();
        //4
        double wagad4 = Math.random() * 10;

        waga4 = (int) Math.round(wagad4);
        if (waga4 == 10) {
            waga4 = 9;
        }
        stringBuilder3.append(waga4);
        String finalString4 = stringBuilder3.toString();

        //5
        double wagad5 = Math.random() * 10;

        waga5 = (int) Math.round(wagad5);
        if (waga5 == 10) {
            waga5 = 9;
        }
        stringBuilder4.append(waga5);
        String finalString5 = stringBuilder4.toString();
        //6
        double wagad6 = Math.random() * 10;

        waga6 = (int) Math.round(wagad6);
        if (waga6 == 10) {
            waga6 = 9;
        }
        stringBuilder5.append(waga6);
        String finalString6 = stringBuilder5.toString();
        //7
        double wagad7 = Math.random() * 10;

        waga7 = (int) Math.round(wagad7);
        if (waga7 == 10) {
            waga7 = 9;
        }
        stringBuilder6.append(waga7);
        String finalString7 = stringBuilder6.toString();
        //8
        double wagad8 = Math.random() * 10;

        waga8 = (int) Math.round(wagad8);
        if (waga8 == 10) {
            waga8 = 9;
        }
        stringBuilder7.append(waga8);
        String finalString8 = stringBuilder7.toString();

        stringBuilder8.append(prog);
        String finalStringprog = stringBuilder8.toString();

        String[] linie = {finalString1, finalString2, finalString3, finalString4, finalString5, finalString6, finalString7, finalString8, finalStringprog};
        FileWriter fw = null;

        try {
            fw = new FileWriter("plik1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
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
