package ex13;

import java.util.Locale;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        
        int numero = 100;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        leia.close();
    }
}