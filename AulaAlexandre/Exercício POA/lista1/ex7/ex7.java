package ex7;
// 7. Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis

// (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
// 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
// Entrada
// O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
// Saída
// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
// necessárias, conforme o exemplo fornecido.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor desejado:");
      int valorInformado = scan.nextInt();
        int valor = 0;

        int [] notas = {100,50,20,10,5,2,1};
        System.out.println("Notas: ");
       
        for (int i = 0; i <notas.length; i++) {
           valor = (int) valorInformado / notas[i]; 
    System.out.println(valor +" nota(s) de R$ "+ notas[i]+",00.");
            valorInformado = valorInformado % notas[i];

        }
       
        
       
      


        scan.close();
    }

}
