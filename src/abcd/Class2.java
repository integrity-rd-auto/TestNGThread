package abcd;

import org.testng.annotations.Test;

public class Class2 {
	@Test
	  public void test5() {
		  long threadCount= Thread.currentThread().getId();
		  System.out.println("Test Case 5 Running in thread" + " " +threadCount);
	  }
	  @Test
	  public void test6() {
		  long threadCount= Thread.currentThread().getId();
		  System.out.println("Test Case 6 Running in thread" + " " +threadCount);
	  }
	  @Test
	  public void test7() {
		  long threadCount= Thread.currentThread().getId();
		  System.out.println("Test Case 7 Running in thread" + " " +threadCount);
	  }
	  @Test
	  public void test8() {
		  long threadCount= Thread.currentThread().getId();
		  System.out.println("Test Case 7 Running in thread" + " " +threadCount);
	  }
	}

