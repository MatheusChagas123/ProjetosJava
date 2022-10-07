package ex31;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        float n1,n2;
        

        System.out.println("Informa a primeira nota");
        n1 = sc.nextFloat();
        if (n1 < 0 || n1 >10 ){
            System.out.println("Nota inválida:");
            System.out.println("Média do aluno : "+ n1);
        }else{
            System.out.println("informe a segunda nota:");
            n2 = sc.nextFloat();
            if (n2 < 0 || n2>10){
                System.out.println("Nota inválida:");
                System.out.println("Média do aluno : "+ (n1+n2)/2);
            } else{
                System.out.println("Nota válida:");
                System.out.println("Média do aluno : "+ (n1+n2)/2); 
            }
        }
        sc.close();
    }
}
