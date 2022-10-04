package ex23;
import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.println("Digite um número inteiro ");
         int x = sc.nextInt();

         System.out.println("Digite um número inteiro ");
         int y = sc.nextInt();
         System.out.println("-------------------------- ");
         System.out.println("Resultado ");
         System.out.println("-------------------------- ");
         System.out.println((x > y) ? "1" : "0");
         System.out.println((x == y) ? "1" : "0");
         System.out.println((x < y) ? "1" : "0");
         System.out.println((x != y) ? "1" : "0");
         System.out.println((x >= y) ? "1" : "0");
         System.out.println((x <= y) ? "1" : "0");
        sc.close();
    }
}
