package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MT_BasePage {

	
	// Initialise Driver
	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	
	
	/*	For testing on multiple browsers a data file can be used to set the correct driver and system property
	 *  e.g. System.setProperty("webdriver.chrome.driver", "path for chromedriver.exe");	
	 *	driver = new ChromeDriver();
	 * 
	 *For simplicity here I'm going to use the Chrome
	 */
	
}
