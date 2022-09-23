package ex04;

import java.util.Scanner;
// 4. Faça um programa que leia do teclado três valores inteiros e exiba o maior e
// menor entre eles.
// Entrada
// O arquivo de entrada contém 3 (três) valores inteiros, representando os valores a
// serem verificados.
// Saída
// Imprima o maior e menor entre os valores lidos

public class ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       int n,maior,menor;

       maior =0;
       menor = 0;
        for (int i=1; i<=3;i++){
            System.out.println("Informe o " +i+"° valor");
        n = scan.nextInt();
            maior = (i==1) ? n:maior;  
            maior = (n>maior)? n : maior; 

            menor = (i==1) ? n : menor;
            menor = (n<menor)?n : menor;

        
        }
        System.out.println("O maior número digitado foi " +maior);
        System.out.println("O menor número digitado foi " +menor);

       
         scan.close(); 
}

}
