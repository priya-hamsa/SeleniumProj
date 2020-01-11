package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasks_Page {
	//Declaration
		@FindBy(xpath = "//input[@value='Add New Tasks']")
		private WebElement addNewTasks_button;
		
		
		
		
		// initialization
		public OpenTasks_Page(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		// utilization


		public void click_AddNewTasks()
		{
			addNewTasks_button.click();
		}
}