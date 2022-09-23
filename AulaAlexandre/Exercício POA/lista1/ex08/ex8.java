package ex08;

// 8. Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
// a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
// a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo:
// Renda Conjunta Alíquota - IR
// Até 900.00 / Isento
// De 900.01 até 1500.00 /10%
// De 1500.01 até 2500.00 /15%
// Acima de 2500.00 /25%
// Entrada
// O arquivo de entrada contém valores com dupla precisão(double) referente a renda
// do homem e a renda da mulher.
// Saída
// Imprima a renda conjunta (RC), a alíquota utilizada(ALIO), o imposto de renda(IR), a
// renda líquida calculada(RL).

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        double RM, RH, RC, IMP, RL, AU;

        System.out.println("Informe a renda da mulher: ");
        RM = scan.nextDouble();

        System.out.println("Informe a renda do homem: ");
        RH = scan.nextDouble();

        RC = RM + RH;
        // Até 900.00 / Isento
        // De 900.01 até 1500.00 /10%
        // De 1500.01 até 2500.00 /15%
        // Acima de 2500.00 /25%
        if (RC <= 900) {
            AU = 0;
            IMP = 0;
            RL = RC - IMP;
            System.out.println("RENDA CONJUNTA:  " + RC);
            System.out.println("ALÍQUOTA UTILIZADA: Isento");
            System.out.println("IMPOSTO DE RENDA: " + IMP);
            System.out.println("RENDA LÍQUIDA: " + RL);

        } else if (RC > 901 && RC < 1500) {
            AU = 0.10;
            IMP = RC * AU;
            RL = RC - IMP;

            System.out.println("RENDA CONJUNTA:  " + RC);
            System.out.println("ALÍQUOTA UTILIZADA: " + AU * 100 + "%");
            System.out.println("IMPOSTO DE RENDA: " + IMP);
            System.out.println("RENDA LÍQUIDA: " + RL);

        } else if (RC > 1501 && RC < 2500) {
            AU = 0.15;
            IMP = RC * AU;
            RL = RC - IMP;
            System.out.println("RENDA CONJUNTA:  " + RC);
            System.out.println("ALÍQUOTA UTILIZADA: " + AU * 100 + " %");
            System.out.println("IMPOSTO DE RENDA: " + IMP);
            System.out.println("RENDA LÍQUIDA: " + RL);
        } else {

            AU = 0.15;
            IMP = RC * AU;
            RL = RC - IMP;
            System.out.println("RENDA CONJUNTA:  " + RC);
            System.out.println("ALÍQUOTA UTILIZADA: " + AU * 100 + "%");
            System.out.println("IMPOSTO DE RENDA: " + IMP);
            System.out.println("RENDA LÍQUIDA: " + RL);
        }

        scan.close();

    }

}
