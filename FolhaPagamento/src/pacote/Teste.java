package pacote;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
	Double valorHoras = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da hora: "));
	Double horas = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade de horas: "));
	
	
	FolhaPagamento folha = new FolhaPagamento();
	
	folha.setQuantidadeHoras(horas);
	folha.setValorHoras(valorHoras);
	System.out.println( folha);
	
	}

}
