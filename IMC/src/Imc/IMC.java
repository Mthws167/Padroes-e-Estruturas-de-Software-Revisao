package Imc;

import javax.swing.JOptionPane;

public class IMC {
	
	public static void main(String[] args) {
		try {
			String sexo = JOptionPane.showInputDialog("Informe o sexo: \n M - Masculino \n F - Feminino").toUpperCase();
			float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o Peso"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Altura"));
			float imc = calcularImc(sexo, peso, altura);
			String condicao = verificarCondicao(imc, sexo);
			JOptionPane.showMessageDialog(null, condicao);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Valores incorretos!");
		}
		
	}
	
	public static float calcularImc(String sexo, float peso, float altura) {
		if((sexo.equalsIgnoreCase("H")) && (sexo.equalsIgnoreCase("M"))) {
			Exception e = new Exception("Inválido, tente novamente");
			JOptionPane.showMessageDialog(null, e);
			System.exit(0);
		}
		float imc = peso/(altura*altura);
		return imc;
	}
	
	public static String verificarCondicao(float imc, String sexo) {
		String mensagem = "";
		switch (sexo) {
			case "M":
				if(imc < 19.1) {
					mensagem = "Abaixo do peso";
				}else if(imc >= 19.1 && imc <= 25.8) {
					mensagem = "Peso normal";
				}else if(imc >= 25.8 && imc <= 27.3) {
					mensagem = "Marginalmente acima do peso";
				}else if(imc >= 27.3 && imc <= 32.3) {
					mensagem = "Acima do peso ideal";
				}else if(imc > 32.3) {
					mensagem = "Obeso";
				}
				break;
			case "H":
				if(imc < 20.7) {
					mensagem = "Abaixo do peso";
				}else if(imc >= 20.7 && imc <= 26.4) {
					mensagem = "Peso normal";
				}else if(imc >= 26.4 && imc <= 27.8) {
					mensagem = "Marginalmente acima do peso";
				}else if(imc >= 27.8 && imc <= 31.1) {
					mensagem = "Acima do peso ideal";
				}else if(imc > 31.1) {
					mensagem = "Obeso";
				}
				break;	
		}
		
		return mensagem;
	}
	
}
