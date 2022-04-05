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

	}
	
	@Override
	public String toString() {
		//Imprimir resultados
		
		return "" ;
	}

}
