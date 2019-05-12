package tests;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.setTitulo("Livro 1");
		book2.setTitulo("Livro 2");
		book3.setTitulo("Livro 3");
		
		book1.setIsbn("000001");
		book2.setIsbn("000002");
		book3.setIsbn("000003");
		
		book1.setPreco(10.90);
		book2.setPreco(15.12);
		book3.setPreco(30.45);
		
		cart.add(book1);
		cart.add(book2);
		cart.add(book3);
		
		System.out.println(cart.count());
		System.out.println(cart.totalPrice());
		cart.remove("000002");
		System.out.println(cart.count());
		System.out.println(cart.totalPrice());
		
	}

}
