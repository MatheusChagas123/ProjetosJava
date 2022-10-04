package ex24;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro ");
        String x = sc.nextLine();

        String reverso = new StringBuffer(x).reverse().toString();

        System.out.println(reverso.toLowerCase().equals(x.toLowerCase()) ? "S" : "N");

        sc.close();
    }
}
