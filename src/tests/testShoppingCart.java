package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*Implemente métodos de teste para a classe ShoppingCart.*/

public class testShoppingCart {
  
   @Test
   public void test_add_count_totalPrice() {
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
   
	assertEquals(3, cart.count());
	assertEquals(56.47, cart.totalPrice(), 0);	
   }
   
   @Test
   public void test_remove_empty() {
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
   
	cart.remove("000002");
	
	assertEquals(2, cart.count());
	assertEquals(41.35, cart.totalPrice(), 0);	
	
	cart.empty();
	
	assertEquals(0, cart.count());
	assertEquals(0, cart.totalPrice(), 0);	
   }
   
}