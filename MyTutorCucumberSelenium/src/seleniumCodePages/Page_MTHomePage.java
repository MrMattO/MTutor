package seleniumCodePages;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.MT_BasePage;


public class Page_MTHomePage extends MT_BasePage {
	
	MTflow_PageFactory mtFlowPF = new MTflow_PageFactory(driver);
	
// launching the browser and setting driver to Chrome
	public void launchChromeBrowser() throws IllegalStateException {
		System.setProperty("webdriver.chrome.driver", "C://Users//M//Selenium_drivers//chromedriver.exe");
		driver = new ChromeDriver();
	
	// initialise Explicit wait time
		wait = new WebDriverWait(driver, 10);
			
	}
	

// Opening the My Tutor webpage	
	public void myTutorStagingURL() throws NoSuchElementException {
		driver.get("https://staging.mytutor.co.uk/form97A.html");
		driver.manage().window().maximize();
		
	}

	
// Enter the user sign up details
	public void enterValidUserCredentials(String firstname, String lastname, String email, String signperson, String phonenumber) throws InterruptedException {

		
	//Enter the user credentials 
		driver.findElement(By.xpath("//input[@id='parentsignupform:firstname:input']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='parentsignupform:lastname:input']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='parentsignupform:email:input']")).sendKeys(email);
		
		if (signperson.equals("parent"))
		{
			driver.findElement(By.xpath("//input[@id='parentsignupform:customerType:0']")).click();
			System.out.println("Parent sign up selected");
		}
		
		else if (signperson.equals("student"))
		{
			driver.findElement(By.xpath("//input[@id='parentsignupform:customerType:1']")).click();
			System.out.println("Student sign up selected");
		}
		
		else
		{
			System.out.println("INCORRECT sign up");
		}
		
		Thread.sleep(2000);     // **Code not working without this waiting statement
		
		driver.findElement(By.xpath("//input[@id='parentsignupform:phone:input']")).sendKeys(phonenumber);
		
	}


// Initiate Search to find a Tutor 	
	public void triggerTutorSearch() {

	// select find tutors
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

	}
	
	
// Enter a password	
	public void enterPassword(String password) throws InterruptedException {
		
		Thread.sleep(2000);     // **Code not working without this waiting statement

		try
		{
		// waiting for page loading
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='texthero__form__header']")));
		
		// enter password	
			driver.findElement(By.xpath("//input[@id='parentsignupform:passwordinput']")).sendKeys(password);
		}
		
		catch (ElementNotVisibleException e)
		{
				 
				System.out.println("Element Not Found");
			 
				throw(e);
		}	

	}
	
	
// Re-Initiate Search to find a Tutor 	
	public void triggerTutorSignedUpSearch() {

	// select find tutors
		driver.findElement(By.xpath("//button[@id='parentsignupform:signup2']")).click();

	}	
	
	
// Choose a subject	
	public void selectSubject(String subject) throws InterruptedException {
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='findTutorsForm:step1Subject']")));

		if (subject.equals("Maths"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Maths')]")).click();
			System.out.println("Selected subject:  "+subject);
		}
		
		else if (subject.equals("Biology"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Biology')]")).click();
			System.out.println("Selected subject:  "+subject);
		}
		
		else if (subject.equals("Chemistry"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Chemistry')]")).click();
			System.out.println("Selected subject:  "+subject);
		}
		
		else if (subject.equals("English"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
			System.out.println("Selected subject:  "+subject);
		}
		
		else if (subject.equals("Physics"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Physics')]")).click();
			System.out.println("Selected subject:  "+subject);
		}
		
		else
		{
			System.out.println("No Subject chosen");
		}				

	}	
	

// Choose subject level 	
	public void subjectLevel() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='findTutorsForm:step2Level']")));
			
	// select the level 'GCSE'
		driver.findElement(By.xpath("//span[contains(text(),'GCSE')]")).click();

	}	
	

// Choose achievement  level 
	public void achievementLevel() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='findTutorsForm:step3Motivation']")));
				
	// select the achievement 'Improve grades'	
		driver.findElement(By.xpath("//span[contains(text(),'Improve grades')]")).click();

	}
	
	
// Choose time to start	
	public void startTime() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='findTutorsForm:step4Urgency']")));
					
	// select the starting day 'Today'
		driver.findElement(By.xpath("//span[contains(text(),'Within a few weeks')]")).click();

	}
			
	
	
// Display finding matches page during search
	public void findingMatches() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/images/selectionwizzard-loading.png']")));
		System.out.println("Finding matches image displayed");				
	

	}
	
	
// Choose tutor from search result
	public void tutorResults() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='js-listviewfilters']")));

	// select the 1st tutor is any are displayed
		try {
				
		driver.findElement(By.xpath("//input[@id='gender:input:2']")).click();
		driver.findElement(By.xpath("//input[@id='gender:input:2']")).sendKeys(Keys.chord(Keys.TAB,Keys.ENTER));
		
		}
		catch(Exception e)
		{
			System.out.println("No Tutors available");
		}
			
	}
			
	
// Send a message to the tutor 
	public void sendMessge() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='fullcontactform:sendMessageFromTutorProfile']")));
				
	// select the achievement 'Improve grades'	
		driver.findElement(By.xpath("//a[@id='fullcontactform:sendMessageFromTutorProfile']")).click();

		}
	

// Check the final page is displayed 
	public void messageSent() {

		String firstNextButton = "//div[@id='js-modalsteps-step1']//a[@class='r_button r_button--primary r_button--l r_button--full-width']";
		String secondNextButton = "//div[@id='js-modalsteps-step2']//a[@class='r_button r_button--primary r_button--l r_button--full-width']";
		String doneButton = "//div[@id='js-modalsteps-step3']//a[contains(@class,'r_button r_button--primary r_button--l r_button--full-width')][contains(text(),'Done')]";
		
	// selecting the next button              
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Message sent')]")));
		driver.findElement(By.xpath(firstNextButton)).click();
	//	mtFlowPF.FinalPagesNextButtonOne().click();     // using Page Object Factory
		
	// selecting the 2nd next button 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(secondNextButton)));
		driver.findElement(By.xpath(secondNextButton)).click();
		
	// selecting the done button 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(doneButton)));
		driver.findElement(By.xpath(doneButton)).click();
		
	// Check elements of the final page	(Book Meeting and Book Lesson buttons) 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='messageTutorButton']")));

		assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Book a free meeting')]")).isDisplayed());
		System.out.println("Final Page: Book a meeting button is displayed");
		
		assertTrue(driver.findElement(By.xpath("//a[@id='bookForm:bookTutorial']")).isDisplayed());
		System.out.println("Final Page: Book a lesson button is displayed");
		
	}	
	
	
	
}
