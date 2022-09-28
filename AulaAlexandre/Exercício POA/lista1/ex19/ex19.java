package ex19;
import java.util.Scanner;
public class ex19 {

//     19. Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
// aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500,
// terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de
// 7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa
// que receba como entrada o salário atual de um funcionário, calcule e exiba o valor
// de seu novo salário já com o aumento concedido.
// Entrada
// Você receberá um único número com dupla precisão (double).
// Saída
// Você deve imprimir o número também com dupla precisão com resultado do
// processamento.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        double sal,aumento,salTotal,taxa;

        System.out.println("informe  o salário do funcionáiro: ");
        sal = scan.nextDouble();

              
       
        if (sal >= 500) {
            taxa = 0.10;
            aumento = sal * taxa;
            salTotal = sal + aumento;
            System.out.printf("O salário total do funcionário será de :  %.2f" , salTotal);
            

        } else if (sal > 300 && sal < 500) {
            taxa = 0.07;
            aumento = sal * taxa;
            salTotal = sal + aumento;

             System.out.printf("O salário total do funcionário será de :  %.2f" , salTotal);

        
        } else {

            taxa = 0.05;
            aumento = sal * taxa;
            salTotal = sal + aumento;
            System.out.printf("O salário total do funcionário será de :  %.2f" , salTotal);
        }

        scan.close();

    }
    
}
