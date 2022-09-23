package ex15;
// 15. A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
// Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
// dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
// primeiros números dessa série.
// Entrada
// O arquivo de entrada contém um valor inteiro N (0 < N< 46).
// Saída
// Os valores devem ser mostrados na mesma linha, separados por um espaço em
// branco. Não deve haver espaço após o último valor

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número menor que 46: ");
        int numero = leia.nextInt();
        int n1 = 0;
        

        
        int interacao = 6;

        int contador = 0;

        for (int i = numero; i < 9999; i++) {
            if (i % 2 == 1 && contador < interacao) {
                System.out.println(i);
                contador++;
            }
        }

        leia.close();
    }
}
