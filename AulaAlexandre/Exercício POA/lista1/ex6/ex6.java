package ex6;
// 6. Calcule o consumo médio de um automóvel sendo fornecidos a distância total
// percorrida (em km) e o total de combustível gasto (em litros).
// Entrada
// O arquivo de entrada contém dois valores: um valor inteiro X representando a
// distância total percorrida (em km) e um valor real Y representando o total de
// combustível gasto, com um dígito após o ponto decimal.
// 3
// Saída
// Apresente o valor que representa o consumo médio do automóvel, seguido da
// mensagem "km/l
import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int distância;
        double  combustível ;

        System.out.println("Informe a distância pecorrida pelo carro: ");
        distância = scan.nextInt();

        System.out.println("Informe quantos litros foram gastos: ");
        combustível = scan.nextDouble();

        double consumo =  distância /  combustível;

        String medida = " Km/l";

        System.out.printf("O gasto de combustível foi de %.3f", consumo);
        System.out.printf("%s",medida);

        
        scan.close();

    }
    
}
