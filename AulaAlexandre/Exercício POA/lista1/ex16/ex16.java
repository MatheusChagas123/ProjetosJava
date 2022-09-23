package ex16;

// 16. Supondo que a população de um país A seja recebido via teclado em uma
// variável com dupla precisão (double) representando a população atual daquele país
// que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
// país B seja recebida também em uma variável com dupla precisão e que tenha uma
// taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos
// necessários para que a população do país A ultrapasse ou iguale a população do
// número do país B, mantida essas taxas de crescimento.
// Entrada
// O arquivo de entrada contém um valor referente a população do país A(POPA) e um
// outro valor inteiro referente a população do país B(POPB). A população do país B
// tem que ser superior ou igual a do país A, ou seja : (POPB > POPA).

// Saída
// Deve ser mostrado a quantidade de anos que a população do país A ultrapasse ou
// se iguale a do país B.

import java.util.Scanner;
import java.util.InputMismatchException;
public class ex16 {
    public static void main(String[] args) {
        
        Double countryA, countryB;
		int yearsToCome = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Digite a população do Pais A: ");
			try {
				countryA = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite a população do Pais B: ");
			try {
				countryB = sc.nextDouble();
				if(!(countryA <= countryB)) {
					System.err.println("A população do pais B deve ser maior ou igual a população do pais A!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos!");
			}
		}
		
		while(countryA < countryB) {
			
			countryA = (countryA * 0.03) + countryA;
			countryB = (countryB * 0.015) + countryB;
			
			yearsToCome++;
			
		
		}
		
		System.out.println("A quantidade necessária de anos é: " + yearsToCome + " ano(s)");
		
		sc.close();
    }


    
}
