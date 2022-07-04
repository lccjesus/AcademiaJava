package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPolimorfismo3 {
public static void main(String[] args) {
	Pessoa pessoa1 = new Funcionario("Agenor", 27, Sexo.MASCULINO, "Maqueiro", 5000);
	JOptionPane.showMessageDialog(null, pessoa1.mostrar());
	
	/* Desejamos alterar a idade e o sal�rio deste funcionario.
	 * 
	 * A variavel pessoa1 � do tipo Pessoa. Apesar de sabermos que ela referencia um objeto do tipo Funcionario, 
	 * o compilador n�o tem como detectar pois objetos s�o criados na execu��o, enquanto que as variaveis 
	 * s�o criadas durante a compila��o.
	 * 
	 * Para que uma variavel de subclasse (Funcionario) referencie o mesmo objeto referenciado por uma variavel 
	 * de superclasse (Pessoa), devemos fazer a opera��o de typecast.
	 * 
	 */
	
	if(pessoa1 instanceof Funcionario) {
	//Funcionario func = (Funcionario)pessoa1;
	//pessoa1.setIdade(28);
	((Funcionario)pessoa1).setIdade(28);
	((Funcionario)pessoa1).setSalario(2800);
	JOptionPane.showMessageDialog(null, pessoa1.mostrar());
	}
	
	if(pessoa1 instanceof Aluno) {
	//Efeito colateral: quando as referencias s�o enganosas
		pessoa1.setIdade(29);
		((Aluno) pessoa1).setMatricula(12345);
	}else {
		JOptionPane.showMessageDialog(null, "A variavel pessoa1 N�O referencia Aluno");
	}
}

}
