package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation {
	@Test(priority= 1, invocationCount=2)
	 public void blocks()
	 {
		 Reporter.log("block", true);
	 }

	 @Test
	 public void calls()
	 {
		 Reporter.log("call" ,true);
	 }
	 
	 @Test(priority= -1, invocationCount=3)
	 public void chats()
	 {
		 Reporter.log("chat",true);
	 }
}
