package ex20;
import java.util.Scanner;
import java.util.InputMismatchException;

// 20. A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante
// justa (pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da
// família e do bairro. O programa deve imprimir uma mensagem de erro caso o bairro
// digitado seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da
// tabela, não haverá desconto. Se a renda OU o consumo forem valores negativos,
// deve ser emitida uma mensagem de erro.
// O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T: Tabatinga),
// a renda da família e o consumo em reais e obter o desconto de acordo com a tabela
// abaixo:
// Bairro Renda (R$) Desconto (R$)
// Santa Ana [50; 500] 50
// (500; 1000] 25
// Industriários [240; 1000] 240
// (1000; 5000] 120
public class ex20 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String escolha;
		
		Double salary, consumedEnergy, discount = 0.0, payment;
		
		System.out.println("Digite um dos códigos das cidades abaixo");
		System.out.println("------------------");
		System.out.println("S - Santa Ana");
		System.out.println("I - Industriários");
		System.out.println("T - Tabatinga");
		
		while(true) {
			System.out.print("Escolha: ");
			try {
				escolha = sc.next().toUpperCase();
				if(escolha.contentEquals("S") || escolha.contentEquals("I") || escolha.contentEquals("T")) {
					break;
				} else {
					System.err.println("Código de cidade não encontrado");
					continue;
				}
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println();
			}
		}
		
		
		
		while(true) {
			System.out.print("Digite a renda mensal: R$ ");
			try {
				salary = sc.nextDouble();
				if(salary < 0) {
					System.err.println("Renda não pode ser negativa!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite em reais o seu consumo mensal: R$ ");
			try {
				consumedEnergy = sc.nextDouble();
				if(consumedEnergy < 0) {
					System.err.println("consumo não pode ser negativo!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		
		
		if (escolha.contentEquals("S")) {
			if (salary >= 50 && salary < 500) {
				discount = 50.0;
			} else if (salary >= 500 && salary < 1000) {
					discount = 25.0;
			} else {
				discount = 0.0;
			}
		} else if (escolha.contentEquals("I")) {
			if (salary >= 240 && salary < 1000) {
				discount = 240.0;
			} else if (salary >= 1000 && salary < 5000) {
				discount = 120.0;
			} else {
				discount = 0.0;
			}
		} else if (escolha.contentEquals("T")) {
			if (salary >= 1000 && salary < 5000) {
				discount = 720.0;
			} else if (salary >= 10000 && salary < 20000) {
				discount = 360.0;
			} else {
				discount = 0.0;
			}
		}
		
		payment = consumedEnergy - discount;
		
		System.out.println("Sua fatura devida é: R$ " + payment);
		
		sc.close();
	}
}
