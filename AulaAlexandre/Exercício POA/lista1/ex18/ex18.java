package ex18;
import java.util.Scanner;



//     18. Faça um programa que inverta um número inteiro com quatro algarismos.
// Entrada
// Você receberá um único número inteiro com quatro algarismos.
// Saída
// Você deve imprimir o número invertido seguido de um final de linha. Importante: se o
// número dado for 3000 por exemplo, o invertido dele deve ser 3 e não 0003.77


public class ex18 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    String reverso = "";
         
        System.out.println("Digite um número");
        int n = sc.nextInt();

        String numero=  Integer.toString(n);

        for(int i = (numero.length() - 1); i >= 0; i--){
            reverso += numero.charAt(i);
        }
         
        System.out.println("o reverso do número é: " + reverso);

    sc.close();
}
    
}
