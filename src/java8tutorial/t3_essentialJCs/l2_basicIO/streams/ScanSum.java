package java8tutorial.t3_essentialJCs.l2_basicIO.streams;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ScanSum {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        double sum = 0;

        try {
            s = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
            s.useLocale(Locale.US);

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                	String next = s.next();
                	System.out.println("Skipping item " + next);
                }   
            }
        } finally {
            s.close();
        }

        System.out.println(sum);
    }
}
