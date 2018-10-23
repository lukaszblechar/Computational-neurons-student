/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percdwwarstwy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author blech
 */
public class PercDwWarstwy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random losowawaga = new Random();
        int[][] macierzwag = new int[5][3];
        System.out.println(macierzwag[0].length);
        for (int w = 0; w < macierzwag.length; w++) {
            for (int k = 0; k < macierzwag[w].length; k++) {
                macierzwag[w][k] = losowawaga.nextInt(10);
                System.out.print((macierzwag[w][k] + " "));
            }
        }
        String prog = ("14 " + "11 " + "18 ");
        FileWriter fw = null;

        try {
            fw = new FileWriter("plikperceptrondwie.cfg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
        bw.write(prog);
        bw.newLine();
        
        
            for (int w = 0; w < macierzwag.length; w++) {
                for (int k = 0; k < macierzwag[w].length; k++) {
                    bw.write(macierzwag[w][k] + " ");
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
