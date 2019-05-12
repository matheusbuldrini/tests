package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*implemente um teste simples. 
 * Exemplo: uma função fibonacci (em uma classe) e 
 * seu teste (em outra classe).*/

public class testFibonacci {
   @Test
   public void test_n_esimo() {
      assertEquals(832040,Fibonacci.n_esimo(30));
   }
}