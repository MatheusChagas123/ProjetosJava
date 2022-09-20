import java.util.Scanner;
// 1. Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
// notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
// peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
// pode ir de O até 10.0, sempre com uma casa.
// Entrada
// O arquivo de entrada contém 2 valores com uma casa decimal cada um.
// Saída
// Calcule e imprima a variável MÉDIA conforme exemplo abaixo, com um espaço em
// branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double).



public class ex1 {
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
