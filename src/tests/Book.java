package tests;

/*Implemente uma classe Book,
 * com atributos privados t�tulo, isbn e pre�o, 
 * mais respectivos m�todos get e set. */

public class Book {

	private String titulo;
	private String isbn;
	private double preco;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
