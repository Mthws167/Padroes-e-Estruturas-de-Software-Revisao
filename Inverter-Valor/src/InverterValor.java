import javax.swing.JOptionPane;

class InverterValor {

	public void Lista() {
		String numeros = JOptionPane.showInputDialog(null, "Informe os números desejados:");
		String[] valor = numeros.split(",");
		String lista = "";

		for (int i = valor.length - 1; i >= 0; i--) {
			if (lista.length() == 0) {
				lista = valor[i];
			} else {
				lista += "," + valor[i];
			}

		}
		JOptionPane.showMessageDialog(null,lista);
	}

}
