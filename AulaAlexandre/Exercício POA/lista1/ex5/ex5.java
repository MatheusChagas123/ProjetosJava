package ex5;
// 5. Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem

// crescente.
// Entrada
// O arquivo de entrada contém 3 (três) valores inteiros, representando os valores a
// serem ordenados.
// Saída
// Imprima os valores lidos em ordem crescente.

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i <= 2; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor");
            int n = scan.nextInt();
            num[i] = n;

        }
        for (int j = 0; j < num.length - 1; j++) {
            for (int h = j + 1; h < num.length; h++) {
                if (num[j] > num[h]) {
                    int temp = num[j];
                    num[j] = num[h];
                    num[h] = temp;

                }
            }
        }
        System.out.println("Resultado:");
        for (int l = 0; l < num.length; l++) {
            System.out.println("-----------------");
            System.out.println(num[l]);

        }

        scan.close();
    }

}
