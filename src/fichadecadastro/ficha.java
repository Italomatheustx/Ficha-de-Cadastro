package fichadecadastro;

import java.util.Scanner;
import java.io.IOException;

public class ficha {
	
		
	private static String nome;
	private static int idade;
	private static float altura;
	private static float peso;
	private static char sexo;
		
	public static void main(String[] args) throws IOException {
			Scanner entrada = new Scanner(System.in);
			
		do {
			System.out.println("Digite o seu nome completo: ");
			nome = entrada.nextLine();
		}while(nome.length() < 6 || idade >= 100);
		
		do {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
		}while(idade <= 0 || idade >= 100);
		
		do{
			System.out.println("Digite a sua altura: ");
			altura = entrada.nextFloat();
		}while(altura <= 0);
		
		do {
			System.out.println("Digite o seu peso: ");
			peso = entrada.nextFloat();
		}while(peso <= 0);
		
		do {
			System.out.println("Digite o seu sexo: ");
			sexo = (char) System.in.read();
		}while(sexo != 'F' && sexo != 'M');
		
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("altura: " + altura);
		System.out.println("sexo: " + sexo);
		
		System.out.println("Sua ficha de Cadastro foi realizado com sucesso!");
		
		entrada.close();
		
   }
}
