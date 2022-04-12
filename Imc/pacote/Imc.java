package pacote;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
	String sexo = JOptionPane.showInputDialog(null, "Informe o seu sexo (H ou M):");
	Double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o seu peso(kg): "));
	Double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a sua altura(m): "));
	
	
	CalculoImc resultado = new CalculoImc();
	
	resultado.setPeso(peso);
	resultado.setAltura(altura);
	resultado.setSexo(sexo);
	
	JOptionPane.showMessageDialog(null,resultado);
	
	}

}
