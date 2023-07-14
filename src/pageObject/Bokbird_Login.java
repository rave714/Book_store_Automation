package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runTme.commandFile;

public class Bokbird_Login extends commandFile {
	

	By lnk_signIn = By.xpath("//button[@id='login_button']");
	
	By tf_UserName = By.xpath("//input[@name='login_username']");
	By tf_Password = By.xpath("//input[@name='login_password']");
	By btn_Login = By.xpath("//button[@name=\"submit\"]");

	By ele_ValidationText = By.xpath("//h3[contains(text(),'POPULAR AUTHORS')]");
	
	
	
	
	 
public void storeRLogin_link (WebDriver driver,String url ) throws IOException {
    	
		open(driver, url);
		
		
}
	 

		public void Store_loginpage(WebDriver driver,String userName,String password) throws IOException {
			//open(driver, url);
			click(driver, lnk_signIn);
			type(driver, tf_UserName, userName);
			type(driver, tf_Password, password);
			click(driver, btn_Login);
			
		}
		
		public void storeLogin_verifydetails(WebDriver driver, String expectedText) throws IOException   {
			
			verifyByText(driver, ele_ValidationText, expectedText);
		}
	
}
