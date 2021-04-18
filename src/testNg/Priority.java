package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
 @Test(priority= 1)
 public void blocks()
 {
	 Reporter.log("block", true);
 }

 @Test
 public void calls()
 {
	 Reporter.log("call" ,true);
 }
 
 @Test(priority= -1)
 public void chats()
 {
	 Reporter.log("chat",true);
 }
}
