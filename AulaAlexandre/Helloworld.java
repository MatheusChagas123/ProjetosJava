import java.util.Scanner;

public class Helloworld {
    
    public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
       System.out.println("hello, World!");
       System.out.println("digite seu nome:");
        String name = sc.nextLine();

        sc.close();
        System.out.println("hello, "+name);
    }
}