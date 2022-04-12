package pacote;

public class CalculoImc {
	private Double altura;
	private Double peso;
	private String sexo;
	
	public String getSexo() {
		return sexo;
	}
	
	public Double getCalculo() {
		return (peso/(altura*altura));
	}
		
	public String getHMPeso() {
		if(getSexo()=="H" && getCalculo()<20.7){
			return "Abaixo do peso!";
		}
		else if(getSexo()=="H" && getCalculo()>=20.7 || getCalculo()<26.4){
			return "Peso normal!";
		}
		else if(getSexo()=="H" && getCalculo()>=26.4 || getCalculo()<27.8){
			return "Marginalmente acima do peso!";
		}
		else if (getSexo()=="H" && getCalculo()>=27.8 || getCalculo()<31.1){
			return "Acima do peso!";
		}
		else if(getSexo()=="H" && getCalculo()>31.1){
			return "Obeso!";
		}else if(getSexo()=="M" && getCalculo()<19.1){
			return "Abaixo do peso!";
		}
		else if(getSexo()=="M" && getCalculo()>=19.1 || getCalculo()<25.8){
			return "Peso normal!";
		}
		else if(getSexo()=="M" && getCalculo()>=25.8 || getCalculo()<27.3){
			return "Marginalmente acima do peso!";
		}
		else if (getSexo()=="M" && getCalculo()>=27.3 || getCalculo()<32.3){
			return "Acima do peso!";
		}
		else if(getSexo()=="M" && getCalculo()>32.3){
			return "Obeso!";
		}else {
		return "Informe os dados corretamente!";
		}
	}
	
	public Double getaltura(){
		return altura;
	}
	
	public Double setaltura(){
		return altura = getaltura();
	}
	
	@Override
	public String toString() {
		
		return  "Resultado: \n"
		+"IMC: "+String.format("%.2f",getCalculo())+"\n" 
		+"Sexo: "+getSexo()+"\n"
		+"Peso: "+getPeso()+" kg"+"\n"
		+"Altura: "+getAltura()+ " m"+"\n"
		+"Análise: "+getHMPeso();
			
	}
	

	public Double getpeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
}

