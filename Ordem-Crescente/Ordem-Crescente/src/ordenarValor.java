import javax.swing.JOptionPane;

class OrdenarValor {

	public void Lista() {
		int quantidade = 3;
		int aux,i,j,cont;
		int[] valor = new int[quantidade];
		String valores ="";
		
		
		for ( i = 0; i <= quantidade-1; i++) {
			String numeros = JOptionPane.showInputDialog(null, "Informe os números desejados:");
			valor[i] = Integer.parseInt(numeros);
			
		}
		for (i = quantidade -1; i > 0; i--){
			for (j = 0; j < i; j++){
				if (valor[j] > valor[j+1]){
					aux = valor[j];
					valor[j] = valor[j+1];
					valor[j+1] = aux;
					
				}
			}
		}
		
		for(i = 0; i < quantidade; i++){
			valores+=valor[i]+",";
		}
		
		JOptionPane.showMessageDialog(null, valores+".");
	}

}