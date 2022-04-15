import javax.swing.JOptionPane;

public class FaixaEtaria {
	
	public static void main(String[] args) {
		String idade = null;
		StringBuilder mensagem = new StringBuilder();
		
		try {	
			int idade1 = Integer.parseInt(idade = JOptionPane.showInputDialog("Digite a sua idade:"));
			
			if(idade1>=0 && idade1 <= 11) {
				mensagem.append("Criança, com ").append(idade1).append(" anos de idade!");
				JOptionPane.showMessageDialog(null,mensagem);
			}
			else if(idade1>=12 && idade1 <= 18) {
				mensagem.append("Adolescente, com ").append(idade1).append(" anos de idade!");
				JOptionPane.showMessageDialog(null,mensagem);
			}
			else if(idade1>=19 && idade1 <= 59) {
				mensagem.append("Adulto, com ").append(idade1).append(" anos de idade!");
				JOptionPane.showMessageDialog(null,mensagem);
			}
			else if(idade1>=60) {
				mensagem.append("Idoso, com ").append(idade1).append(" anos de idade!");
				JOptionPane.showMessageDialog(null,mensagem);
			}
			else {
				mensagem.append("Dados Irregulares");
				JOptionPane.showMessageDialog(null,mensagem);
			}
		}
		catch (Exception e) {
			mensagem.append("ERROR ").append(idade).append(" not identify this age in system!");
			JOptionPane.showMessageDialog(null,mensagem);
		}

	}

}
