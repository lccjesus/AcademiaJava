package qintess.academiajava.variaveis.reais;

public class VariaveisReais01 {
	public static void main(String[] args) {
		// declarando uma vari�vel para armazenar o pre�o de um produto
		double preco_oleo = 9.58;
		double preco_cafe = 18.92;
		
		// pessoa com 27 anos e 6 meses
		double idade_real = 27.5;
		int idade = (int)idade_real; // typecast ou cast
		
		// atribuindo um int para um double
		int medida = 100;
		double medida_real = medida;
		
		System.out.println("Pre�o do �leo: " + preco_oleo);
		System.out.println("Pre�o do caf�: " + preco_cafe);
		System.out.println("Idade: "+idade);
		System.out.println("Medid: "+medida);
		System.out.println("Medida Real: "+medida_real);
		
		
			
		
		
	}

}
