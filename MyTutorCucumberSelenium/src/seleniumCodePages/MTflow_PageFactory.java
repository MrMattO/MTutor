package seleniumCodePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTflow_PageFactory {

		WebDriver driver;
		
		public MTflow_PageFactory(WebDriver driver)
		{

	// use this so that you can use the same name for driver locally
			this.driver = driver;				
			PageFactory.initElements(driver, this);
		}
		
	// For Sending Message 1st Next button
		@FindBy(xpath="//div[@id='js-modalsteps-step1']//a[@class='r_button r_button--primary r_button--l r_button--full-width']")
		WebElement nextButtonOne;

	// For Sending Message 2nd Next button 
		@FindBy(xpath="//div[@id='js-modalsteps-step2']//a[contains(@class,'r_button r_button--primary r_button--l r_button--full-width')]")
		WebElement nextButtonTwo;
		
	// For Sending Message done button 
		@FindBy(xpath="//div[@id='js-modalsteps-step3']//a[contains(@class,'r_button r_button--primary r_button--l r_button--full-width')][contains(text(),'Done')]")
		WebElement doneButton;
		
		
		public WebElement FinalPagesNextButtonOne()
		{
			return nextButtonOne;
		}
		
		public WebElement FinalPagesNextButtonTwo()
		{
			return nextButtonTwo;
		}
		
		public WebElement FinalPagesDoneButton()
		{
			return doneButton;
		}
		
		
}
	
	

