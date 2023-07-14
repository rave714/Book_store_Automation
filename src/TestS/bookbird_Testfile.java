package TestS;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Bokbird_Login;
import utilS.Helperfile;

public class bookbird_Testfile extends Helperfile {
	
	
	
	@Test()
	public void Bookbird_login01()throws IOException  {
		
		Bokbird_Login Store_homepage = new Bokbird_Login();
		
		Store_homepage.storeRLogin_link (driver,"http://localhost/BookStore-masterop/");
		Store_homepage.Store_loginpage(driver, "Raveen","123");
		Store_homepage.storeLogin_verifydetails(driver, "POPULAR AUTHORS");
		
		
		
	}
	

}
