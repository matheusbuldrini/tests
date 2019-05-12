package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(testShoppingCart.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Test ShoppingCart Result: "+result.wasSuccessful());
	      
	      result = JUnitCore.runClasses(testFibonacci.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Test Fibonacci Result: "+result.wasSuccessful());
	   }
}
