package test_scripts;

import org.testng.annotations.Test;

import generic_methods.Generic_Test;
import pom.Login_Page;
import pom.OpenTasks_Page;

public class AddNewTask_Test extends Generic_Test{

	@Test
	public void navigateToAddNewTasks() throws InterruptedException {
		
		Login_Page lp= new Login_Page(driver);
		lp.login_Actitime();
		OpenTasks_Page otp = new OpenTasks_Page(driver);
		otp.click_AddNewTasks();

	}
}
