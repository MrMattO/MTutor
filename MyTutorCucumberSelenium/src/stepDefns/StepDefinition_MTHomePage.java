package stepDefns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumCodePages.Page_MTHomePage;


public class StepDefinition_MTHomePage {
	
	Page_MTHomePage mtHomePage = new Page_MTHomePage();
	
	@Given("^I use Chrome browser$")
	public void i_use_Chrome_browser()  throws Exception{
		mtHomePage.launchChromeBrowser();
	   
	}

	@When("^I open MyTutor hompage$")
	public void i_open_MyTutor_hompage()  throws Exception {
		mtHomePage.myTutorStagingURL();
	    
	}

	@Then("^I enter Get Started valid credentials for \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_Get_Started_valid_credentials_for_and(String firstname, String lastname, String email, String signperson, String phonenumber)  throws Exception {
		mtHomePage.enterValidUserCredentials(firstname, lastname, email, signperson, phonenumber);
	    
	}

	@Then("^I trigger the initial tutor search$")
	public void i_trigger_the_initial_tutor_search() throws Exception {
		mtHomePage.triggerTutorSearch();
	   
	}

	@Then("^I enter a \"([^\"]*)\"$")
	public void i_enter_a(String password) throws Exception {
		mtHomePage.enterPassword(password);
	    
	}

	@Then("^I trigger the find tutor search$")
	public void i_trigger_the_find_tutor_search() throws Exception {
		mtHomePage.triggerTutorSignedUpSearch();
	    
	}

	@Then("^I choose a \"([^\"]*)\"$")
	public void i_choose_a(String subject) throws Exception {
		mtHomePage.selectSubject(subject);
	    
	}

	@Then("^I choose a subject level$")
	public void i_choose_a_subject_level() throws Exception {
		mtHomePage.subjectLevel();
	    
	}

	@Then("^I choose the required achievement$")
	public void i_choose_the_required_achievement() throws Exception {
		mtHomePage.achievementLevel();
	    
	}

	@Then("^I choose the time to start$")
	public void i_choose_the_time_to_start() throws Exception {
		mtHomePage.startTime();
	    
	}

	@Then("^the finding matches search page is displayed$")
	public void the_finding_matches_search_page_is_displayed() throws Exception {
		mtHomePage.findingMatches();
	    
	}

	@Then("^I choose a tutor from tutor search result page$")
	public void i_choose_a_tutor_from_tutor_search_result_page() throws Exception {
		mtHomePage.tutorResults();
	    
	}

	@Then("^I send a message to the tutor$")
	public void i_send_a_message_to_the_tutor() throws Exception {
		mtHomePage.sendMessge();
	    
	}

	@Then("^I verify the final message_sent page is displayed$")
	public void i_verify_the_final_message_sent_page_is_displayed() throws Exception {
		mtHomePage.messageSent();
	    
	}	
	


}
