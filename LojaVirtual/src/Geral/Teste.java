package Geral;

import Controle.CarrinhoControle;
import Modelo.Carrinho;
import Modelo.Cliente;
import Modelo.Produto;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("00000000000");
		cliente.setNome("Matheus");
		
		Produto produto0 = new Produto();
		produto0.setNome("Mouse");
		produto0.setCodigo(01.);
		produto0.setQuantidade(200.);
		
		Produto produto1 = new Produto();
		produto1.setNome("Teclado");
		produto1.setCodigo(02.);
		produto1.setQuantidade(100.);
		
		
		Carrinho carrinho = new Carrinho();
		carrinho.setCliente(cliente);
		
		CarrinhoControle carrinhoControle = new CarrinhoControle();
		carrinhoControle.adicionarItem(carrinho, produto1, 35., 2.);
		carrinhoControle.adicionarItem(carrinho, produto0, 15., 1.);

		System.out.println(carrinhoControle);
		
		
	}

}
