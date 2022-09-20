import java.util.Scanner;



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
