package tests;

import java.util.Iterator;
import java.util.LinkedList;

/*Implemente uma classe ShoppingCart, 
 * para armazenar os livros que um 
 * comprador da loja virtual deseja 
 * comprar. Essa classe possui os 
 * seguintes métodos públicos: 
 * (a) adicionar livro no carrinho; 
 * (b) remover livro do carrinho (dado seu isbn); 
 * (c) esvaziar completamente o carrinho; 
 * (d) retornar o número de livros do carrinho; 
 * (e) retornar o preço total dos livros no carrinho. */

public class ShoppingCart {
	
	private LinkedList<Book> cart = new LinkedList<Book>(); 
	
	public void add(Book book) {
		this.cart.add(book);
	}
	
	public void remove(String isbn) {
		for (Book book : cart) {
			if(book.getIsbn() == isbn) {
				cart.remove(book);
			}
		}
	}
	
	public void empty() {
		this.cart.clear();
	}
	
	public int count() {
		return this.cart.size();
	}
	
	public double totalPrice() {
		double total = 0;
		for (Book book : cart) {
			total += book.getPreco();
		}
		return total;
	}
}
