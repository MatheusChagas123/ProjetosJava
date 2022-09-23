package ex09;

// 9. Faça um programa que receba via teclado o tempo de duração de um evento em
// uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
// expresso em horas, minutos e segundos.
// Entrada
// O arquivo de entrada contém valores com inteiros (int) referente a quantidade de
// segundos informada.
// Saída
// Imprima a conversão realizada em HH (horas), MM (minutos) e Segundos (SS).
import java.util.Scanner;
import java.util.Locale;
public class ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        

        System.out.println("Digite o tempo de fabricação: ");
        int seconds = scan.nextInt();

       
        int hours = seconds/3600;
        int minutes = (seconds - (hours * 3600))/60;
        seconds = (seconds - (hours * 3600) - (minutes * 60));



        System.out.printf("HH:MM:SS = %d:%d:%d", hours, minutes, seconds);
        

        scan.close();
   
    }
}
