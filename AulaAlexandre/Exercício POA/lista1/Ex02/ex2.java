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

        double notaA, notaB;

        System.out.println("Digite a primeira nota ");
        notaA = scan.nextDouble();

        System.out.println("Digite a segunda nota ");
        notaB = scan.nextDouble();

        double media = (notaA + notaB) / 2;

        System.out.println("A media do aluno e :" + media);

        double mediaPonderada = ((notaA * 3.5) + (notaB * 7.5)) / 11;
        System.out.printf("mediaPonderada %.5f ", mediaPonderada);

        scan.close();

    }

}

