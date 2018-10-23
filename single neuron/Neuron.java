/*
od nowa
 */
package neuron;

/*
public class Neuron {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Neuron {

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

        int a, x1, x2, x3, x4, x5, x6, x7, x8;
//1 
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
//7

            if (Math.random() < 0.5) {
                x7 = 0;
            } else {
                x7 = 1;
            }
            stringBuilder6.append(x7);
            String finalString7 = stringBuilder6.toString();
//8

            if (Math.random() < 0.5) {
                x8 = 0;
            } else {
                x8 = 1;
            }
            stringBuilder7.append(x8);
            String finalString8 = stringBuilder7.toString();

//finito
            String[] linie = {finalString1, finalString2, finalString3, finalString4, finalString5, finalString6, finalString7, finalString8};
            FileWriter fw = null;

            try {
                fw = new FileWriter("plik.txt");
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
}
