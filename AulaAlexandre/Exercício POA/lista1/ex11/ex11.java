package ex11;
// 11. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,

// sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
// duração mínima de 1 hora e máxima de 24 horas.
// Entrada
// A entrada contém dois valores inteiros representando a hora de início e a hora de
// fim do jogo.
// Saída
// Apresente a duração do jogo conforme exemplo abaixo.

import java.util.Scanner;
import java.util.Locale;

public class ex11 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    
            Locale.setDefault(Locale.US);
            
        System.out.println("Digite o horário do ínicio do jogo: ");
        int startTime = scan.nextInt();
        System.out.println("Digite horário final  do jogo: ");
        int finishTime = scan.nextInt();
        int hourTheGame =0;
        if ((startTime < 12 && startTime > 1) && finishTime < 24) {
            hourTheGame = finishTime - startTime;
            System.out.println("O jogo durou " + hourTheGame + " hora(s)");
        } else if (startTime == 0 && finishTime == 0) {
            System.out.println("O jogo durou 24 hora(s)");
        } else {
            hourTheGame = (24 - startTime) + finishTime;
            System.out.println("O jogo durou " + hourTheGame + " hora(s)");
        }


        
            
    
            scan.close(); 
    }
}