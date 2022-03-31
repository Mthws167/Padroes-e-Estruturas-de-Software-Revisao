import javax.swing.JOptionPane;

class InverterValor {

	public static void Lista() {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de números que deseja inserir:"));
		int[] valor = new int[quantidade];
		for (int i = 0; i <= quantidade - 1; i++) {
			valor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os números desejados:"));
		}
		String lista="";
		for (int i = quantidade - 1; i >= 0; i--) {
			lista += valor[i]+",";
		}
		JOptionPane.showMessageDialog(null, lista);
	}

}
