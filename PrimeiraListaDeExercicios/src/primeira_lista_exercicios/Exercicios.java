package primeira_lista_exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Exercicios {

	public static void main(String[] args) {
		Exercicios ex = new Exercicios();
		//ex.exercicio1();
		//ex.exercicio10Primo();
		//ex.exercicio4();
		//ex.exercicio5();
		//ex.exercicio6();
		//ex.exercicio7();
		ex.exercicio9();
	
	}
	
	
	
	/*
	  [M1S01] - Ex 1 - Quest�o aleat�ria
	  Crie um programa em Java que, ao executar, escreve na tela um n�mero aleat�rio entre 0 e 1.
	 */
	public void exercicio1() {
		Random geradorNumero = new Random();
		int numeroGerado = geradorNumero.nextInt((1 - 0) + 1) + 0;
		
		System.out.println("O numero aleatorio gerado e: " + numeroGerado);
	}
	
	
	
	/*
		[M1S01] - Ex 2 - Tipo assim� qual o tipo?
		Correlacione TODOS os tipos primitivos com suas respectivas descri��es e exemplos:
		Tipos primitivos em Java: 
		(i) boolean; 
		(ii) caracter; 
		(iii) inteiro; 
		(iv) real.
		Descri��es: 
		(a) qualquer n�mero inteiro, seja ele negativo, nulo ou positivo; -> (iii) inteiro;
		(b) qualquer conjunto de caracteres alfanum�ricos;  -> (ii) caracter;
		(c) conjunto de valores falso ou verdadeiro.  -> (i) boolean; 
		(d) qualquer n�mero real, seja ele negativo, nulo ou positivo. -> (iv) real.
	*/
	
	
	
	
	/*
		[M1S01] - Ex 3 - Nome completo
		Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usu�rio seu sobrenome, depois seu nome, e ent�o escreva na tela, em uma �nica �string�, o nome completo do usu�rio.
	*/
	public void exercicio3() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		leitor.close();
		
		System.out.println("O nome completo do usuario �: " + nome + " " + sobrenome);
	}
	
	
	
	/*
		[M1S01] - Ex 4 - N�o sei calcular com v�rgula
		Crie um programa em Java que, utilizando a classe Scanner, pe�a ao usu�rio que digite um n�mero com 2 ou mais casas depois da v�rgula, converta esse n�mero para um inteiro e escreva o resultado na tela.
	*/
	public void exercicio4() {
		Scanner leitor = new Scanner(System.in);
		double numeroDigitado;
		int numeroDigitadoInteiro = 0;
		
		System.out.println("digite um n�mero com 2 ou mais casas depois da v�rgula:");
		try {
			numeroDigitado = leitor.nextDouble();
			numeroDigitadoInteiro = (int)numeroDigitado;
			System.out.println("O n�mero convertido para inteiro �: " + numeroDigitadoInteiro);
		}catch(Exception e){
			System.out.println("N�mero digitado � inv�lido!!!");
		}finally {
			leitor.close();
		}
		
		leitor.close();
	}
	
	
	
	/*
		[M1S01] - Ex 5 - N�vel de dificuldade para alfabetiza��o de crian�as
		Crie um programa em Java que, utilizando a classe Scanner, pe�a ao usu�rio que digite um nome qualquer, e em seguida escreva na tela o tamanho de letras que o nome possui.

	*/
	public void exercicio5() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um nome qualquer:");
		String nome = leitor.nextLine();
		
		System.out.println("A quantidade de letras do nome:" + nome + " �: " + nome.length());
		
		leitor.close();
	}
	
	
	
	/*
		[M1S01] - Ex 6 - Boletim
		Crie um programa em Java que, utilizando a classe Scanner, pe�a ao usu�rio para inserir as notas do semestre, e deve retornar a m�dia final. O programa deve pedir 3 notas, que devem ser n�meros reais, e retornar um n�mero real com 2 casas depois da v�rgula, com o texto �Sua m�dia final �:� seguido do valor.
	*/
	public boolean exercicio6() {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>();
		double somaNotas = 0;
		
		for (int contNotas = 1; contNotas <= 3; contNotas++) {
			try {
				System.out.println("Digite a " + contNotas + "� Nota:");
				notas.add(Double.parseDouble(leitor.nextLine()));
			}catch(Exception e){
				System.out.println("Nota digitada � inv�lida!!!");
				return false;
			}
		}
		
		leitor.close();
		
		for (Double nota : notas) {
			somaNotas += nota;
		}
		
		System.out.println("Sua m�dia final �: " +  String.format("%.2f", somaNotas / notas.size()));
		return false;
			
	}
	
	
	
	/*
		[M1S01] - Ex 7 - Fatorial
		Crie um programa em Java que, utilizando a classe Scanner, calcule o fatorial de um n�mero inteiro de 0 a 10. O programa deve pedir para o usu�rio inserir um n�mero inteiro, mas s� deve aceitar valores de 0 a 10, e ent�o deve calcular o fatorial desse n�mero e escrever o resultado na tela.
	 */
	public void exercicio7() {
		Scanner leitor = new Scanner(System.in);
		int totalFatorial = 1;
		
		try {
			System.out.println("Insira um n�mero inteiro:");
			int numero = leitor.nextInt();
			
			if(numero == 0) {
				System.out.println("O fatorial de 0 � 1!");
			}else if(numero >= 1 && numero <= 10) {
				for(int i = numero; i > 0; i--) {
					totalFatorial *= i;
				}
				
				System.out.println("O total do fatorial �: " + totalFatorial);
			}else {
				System.out.println("N�mero digitado n�o est� entre 0 e 10!");
			}
			
		}catch(Exception e){
			System.out.println("N�mero digitado � inv�lida!!!");
		}finally {
			leitor.close();
		}
	}
	
	
	
	/*
		[M1S01] - Ex 8 - Me tira desse la�o!
		Analise as afirma��es a seguir e responda se s�o verdadeiras ou falsas: 
		FALSO -> O comando �continue� dentro de um loop �while� faz com que o controle seja passado para o pr�ximo bloco de c�digo ap�s o loop. 
		VERDADEIRO -> O comando return pode ser utilizado dentro de loops. 
		FALSO -> O comando �break� dentro de um loop �while� faz com que o controle seja passado para a pr�xima itera��o do loop.
	 */
	
	
	
	/*
		[M1S01] - Ex 9 - Campe�o do rod�zio
		Crie um software que oferece ao usu�rio tr�s sabores fixos diferentes de pizza (exemplo: mussarela, calabresa, portuguesa) identificadas por um n�mero. Enquanto o usu�rio escolher um sabor v�lido, pergunte se ele deseja uma nova fatia. Caso contr�rio, exiba quantas fatias ele comeu e encerre o programa.
		Exemplo:
		�Voc� deseja uma pizza? Envie �1� para calabresa, 
		�2� para mussarela, 
		�3� para portuguesa ou 
		�0� caso esteja satisfeito�
	 */
	public void exercicio9() {
		boolean novoPedaco = true;
		Scanner leitor = new Scanner(System.in);
		int qtdePedacoComido = 0;
		
		while(novoPedaco) {
			System.out.println("Voc� deseja uma pizza?");
			System.out.println("Digite 1 para calabresa");
			System.out.println("Digite 2 para mussarela");
			System.out.println("Digite 3 para portuguesa");
			System.out.println("Digite 0 para satisfeito");
			try {
				int opcao = leitor.nextInt();
				
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					qtdePedacoComido++;
				}else {
					if(opcao != 0) {
						System.out.println("Op��o digitada � inv�lida!!!");
					}
					novoPedaco = false;
				}
			}catch(Exception e){
				System.out.println("Op��o digitada � inv�lida!!!: " + e.getMessage());
				break;
			}
		}
		
		System.out.println("Quantidade de peda�os comidos: " + qtdePedacoComido);
		leitor.close();
		
	}
	
	
	
	
	/*
		[M1S01] - Ex 10 - Primos?
		Crie um software que verifica se um n�mero inserido pelo usu�rio � primo
	*/
	public void exercicio10Primo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um n�mero inteiro:");
		int numero = scanner.nextInt();
		
		if(numero <= 1) {
			System.out.println("Numero nao � primo!!!");
		}else if(parExceto2(numero)) {
			System.out.println("Numero nao � primo!!!");
		}else if(divisivelPor3Exceto3(numero)) {
			System.out.println("Numero nao � primo!!!");
		}else if(divisivelPor5Exceto5(numero)) {
			System.out.println("Numero nao � primo!!!");
		}else if(divisivelPor7Exceto7(numero)) {
			System.out.println("Numero nao � primo!!!");
		}else {
			System.out.println("N�mero � Primo");
		}
	}

	public boolean parExceto2(int numero) {
		if(numero % 2 == 0 && numero != 2) {
			return true;
		}	
		return false;
	}
	
	public boolean divisivelPor3Exceto3(int numero) {
		if(numero % 3 == 0 && numero != 3) {
			return true;
		}
		return false;
	}
	
	public boolean divisivelPor5Exceto5(int numero) {
		if(numero % 5 == 0 && numero != 5) {
			return true;
		}
		return false;
	}
	
	public boolean divisivelPor7Exceto7(int numero) {
		if(numero % 7 == 0 && numero != 7) {
			return true;
		}
		return false;
	}
	
}
