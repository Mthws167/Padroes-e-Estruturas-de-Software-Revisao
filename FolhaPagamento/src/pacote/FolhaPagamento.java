package pacote;

public class FolhaPagamento {
	private Double quantidadeHoras;
	private Double valorHoras;
	
	
	public Double getSalarioBruto() {
		return quantidadeHoras*valorHoras;
	}
	
	public Double getValorSindicato() {
		return (getSalarioBruto()*1.03)-getSalarioBruto();
	}
	
	public Double getInss() {
		return (getSalarioBruto()*1.1)-getSalarioBruto();
	}
	
	public Double getValorImpostoRenda() {
		if(getSalarioBruto()<=900){
			return getSalarioBruto();
		}
		else if(getSalarioBruto()<=1500){
			return (getSalarioBruto()*1.05)-getSalarioBruto();
		}
		else if(getSalarioBruto()<=2500){
			return (getSalarioBruto()*1.1)-getSalarioBruto();
		}
		else{
			return (getSalarioBruto()*1.2)-getSalarioBruto();
		}
	}
	
	public Double getFgts() {
		return (getSalarioBruto()*1.11)-getSalarioBruto();
	}
	
	public Double getTotalDesconto() {
		return getInss()+getValorImpostoRenda()+getValorSindicato();
	}
	
	public Double getSalarioLiquido() {
		return getSalarioBruto()-(getTotalDesconto());
	}
	
	
	public Double getQuantidadeHoras(){
		return quantidadeHoras;
	}
	
	public Double setQuantidadeHoras(){
		return quantidadeHoras = getQuantidadeHoras();
	}
	
	@Override
	public String toString() {
		return "Salário Bruto: " +getSalarioBruto()+"\n" + "Salário Líquido: "+getSalarioLiquido();
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public void setQuantidadeHoras(Double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	
}

