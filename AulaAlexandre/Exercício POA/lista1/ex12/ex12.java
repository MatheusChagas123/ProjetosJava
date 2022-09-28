package ex12;

// 12. Neste problema, você deverá ler 3 palavras que definem o tipo de animal
// possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
// conclua qual dos animais seguintes foi escolhido, através das três palavras
// fornecidas.
import java.util.Scanner;
import java.util.Locale;

public class ex12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int q1, q2, q3;
        q2=0;
        q3=0;

        System.out.println("Escolha entre uma das opções [1] Vertebrado [2] Inverebrado ");
        q1 = scan.nextInt();
        switch (q1) {
            case 1:
                System.out.println("Escolha entre uma das opções [1] ave [2] mamífero ");
                q2= scan.nextInt();
                break;
            case 2:
                System.out.println("Escolha entre uma das opções [3] inseto [4] anelidio ");
                q2= scan.nextInt();
                break;

            default:
                System.out.println("Valor digitado incorreto!");
        }

        int points = q1 + q2;

        switch (points) {
            case 2:
                System.out.println("Escolha entre uma das opções [1] carnivoro [2] onifero ");
                q3 = scan.nextInt();
                break;
            case 3:
                System.out.println("Escolha entre uma das opções [2] onifero [3] herbivoro ");
                q3 = scan.nextInt();
                break;
            case 5:
                System.out.println("Escolha entre uma das opções [3] hematofago [4] herbivoro ");
                q3 = scan.nextInt();
                break;
            case 6:
                System.out.println("Escolha entre uma das opções [4] hematofago [5] onifero ");
                q3 = scan.nextInt();
                break;

            default:
                System.out.println("Valor digitado incorreto!");
        }

            points = points + q3;

            switch (points) {
                case 3:
                    System.out.println("águia ");
                   
                    break;
                case 4:
                    System.out.println("pomba ");
                    
                    break;
                case 5:
                    System.out.println("homem ");
                  
                    break;
                    case 6:
                    System.out.println("vaca ");
                  
                    break;
                    case 8:
                    System.out.println("pulga ");
                  
                    break;
                    case 9:
                    System.out.println("lagarta ");
                  
                    break;
                    case 10:
                    System.out.println("sanguesuga ");
                  
                    break;
                    case 11:
                    System.out.println("minhoca ");
                  
                    break;
    
                default:
                    System.out.println("Valor digitado incorreto!");
            }

        scan.close();
    }

}
