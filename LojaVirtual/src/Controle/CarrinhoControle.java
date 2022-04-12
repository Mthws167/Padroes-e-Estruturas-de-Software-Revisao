package Controle;

import java.util.ArrayList;
import java.util.List;

import Modelo.Carrinho;
import Modelo.ItensCarrinho;
import Modelo.Produto;

public class CarrinhoControle {

	private List<ItensCarrinho> carrinhoItens = new ArrayList<ItensCarrinho>();

	public void adicionarItem(Carrinho carrinho, Produto produto, Double valorUnitario, Double quantidade) {

		ItensCarrinho itens = new ItensCarrinho();
		itens.setCarrinho(carrinho);
		itens.setProduto(produto);
		itens.setQuantidade(quantidade);
		itens.setValorUnitario(valorUnitario);
		carrinhoItens.add(itens);

	}

	public void removerItem() {
		
		ItensCarrinho itens = new ItensCarrinho();
		itens.getCarrinho();
		itens.getProduto();
		itens.getQuantidade();
		itens.getValorUnitario();
		carrinhoItens.remove(itens);
	}
	

	@Override
	public String toString() {
		String resultado="";
		for(int i=0; i<carrinhoItens.size();i++) {
			resultado="Nome do Produto: \n"+carrinhoItens.get(i).getProduto().getNome()+"\n";
		}
		return resultado;
	}
}
