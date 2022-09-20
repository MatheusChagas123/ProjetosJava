import java.util.Scanner;

public class Grades {

    
}
public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println( "Digite a primeira nota do aluno");
    double firstGrade = sc.nextDouble();
    System.out.println( "Digite a primeira nota do aluno");
    double secondtGrade = sc.nextDouble();
    sc.close();
   

}

public static void printAverege(double grade1, double grade2){

    System.out.println("Média do aluno:" + (grade1 + grade2)/2);  
}
}
