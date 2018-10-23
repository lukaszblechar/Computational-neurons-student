/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class koniec2 {

    public static void main(String[] args)
            throws java.io.IOException {
        String input1 = "plik.txt";
        String input2 = "plik1.txt";
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br1 = new BufferedReader(new FileReader(input1));
        BufferedReader br2 = new BufferedReader(new FileReader(input2));

        String sCurrentLine;
        String sCurrentLine1;

        int suma = 0;
        int sumaostateczna1 = 0;
        int wartoscprogu = 0;

        while ((sCurrentLine = br1.readLine()) != null) {
            //     for (int wagalicznik = 0; wagalicznik < 8; wagalicznik++) {
            for (int wejscielicznik = 0; wejscielicznik <80; wejscielicznik++) {
                System.out.println(wejscielicznik);
                for (int linialicznik = 0; linialicznik < 8; linialicznik++) {

                    String linia = Files.readAllLines(Paths.get("plik.txt")).get(linialicznik);
                    String wejscie = String.valueOf(linia.charAt(wejscielicznik));
                    int wartoscwejscia = Integer.parseInt(wejscie);
                    String liniawagi = Files.readAllLines(Paths.get("plik1.txt")).get(linialicznik);
                    int waga = Integer.parseInt(liniawagi);
                    String prog = Files.readAllLines(Paths.get("plik1.txt")).get(8);
                    String prog1 = String.valueOf(prog);
                    wartoscprogu = Integer.parseInt(prog1);

                    int iloczyn = (wartoscwejscia * waga);
                    suma += iloczyn;
                    System.out.println("wartosc wejscia " + wartoscwejscia + " waga " + waga + " suma" + suma);

                }
                int suma1=suma-wartoscprogu;
                System.out.println("suma po linijce " + suma1);
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
                    fw = new FileWriter("plik2.txt");
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
                suma1=0;
            }
        }
        System.out.println("");
    }
}
