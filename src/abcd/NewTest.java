package abcd;

import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void test1() {
	  long threadCount= Thread.currentThread().getId();
	  System.out.println("Test Case 1 Running in thread" + " " +threadCount);
  }
  @Test
  public void test2() {
	  long threadCount= Thread.currentThread().getId();
	  System.out.println("Test Case 2 Running in thread" + " " +threadCount);
  }
  @Test
  public void test3() {
	  long threadCount= Thread.currentThread().getId();
	  System.out.println("Test Case 3 Running in thread" + " " +threadCount);
  }
  @Test
  public void test4() {
	  long threadCount= Thread.currentThread().getId();
	  System.out.println("Test Case 4 Running in thread" + " " +threadCount);
  }
}
