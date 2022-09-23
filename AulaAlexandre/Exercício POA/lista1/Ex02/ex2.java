package ex02;
import java.util.Scanner;



public class ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idFuncionario, horasTrabalahdas;
        double  salarioHora,salarioTotal ;

        System.out.println("Informe o ID do funcionário ");
        idFuncionario = scan.nextInt();

        System.out.println("Informe a quantidade de horas trabalhadas ");
        horasTrabalahdas = scan.nextInt();

        System.out.println("Informe o salário por hora do funcionário  "+idFuncionario + " :" );
        salarioHora = scan.nextDouble();

         salarioTotal = horasTrabalahdas * salarioHora;

        System.out.printf("O salário do funcionário "+ idFuncionario+" é igual a: R$ %.2f",salarioTotal);

        
        scan.close();

    }

}

