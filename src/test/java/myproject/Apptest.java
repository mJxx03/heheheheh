package myproject; 
import org.testng.Assert; 
import org.testng.annotations.Test;
public class apptest { 
	public void testlogin1() {
		app myapp=new app(); 
		Assert.assertEquals(0,myapp.userlogin("abc","9054")); 
		}
	public void testlogin2() {
		app myapp=new app();
		Assert.assertEquals(0,myapp.userlogin("ram","3025")); 
		}
	}