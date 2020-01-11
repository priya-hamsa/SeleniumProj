package test_scripts;

import org.testng.annotations.Test;

import generic_methods.Generic_Test;
import pom.Login_Page;
import pom.OpenTasks_Page;


public class Login_ActitimeTest extends Generic_Test{
	Login_Page lp= new Login_Page(driver);
	@Test
	public void login_Actitime() throws InterruptedException{

	
	lp.login_Actitime();
	}

}
