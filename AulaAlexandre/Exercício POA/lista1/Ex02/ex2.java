// 2. Escreva um programa que leia o número de um funcionário, seu número de horas
// trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
// seguir, mostre o número e o salário do funcionário, com duas casas decimais.
// Entrada
// O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
// decimais, representando o número, quantidade de horas trabalhadas e o valor que o
// funcionário recebe por hora trabalhada, respectivamente.
// Saída
// Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um
// espaço em branco antes e depois da igualdade. No caso do salário, também deve
// haver um espaço em branco após o R$.

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

