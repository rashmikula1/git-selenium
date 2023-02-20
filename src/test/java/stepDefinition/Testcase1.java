package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testcase1 {
	public static ChromeDriver driver=new ChromeDriver();
	String url="https://juice-shop.herokuapp.com/#/register";
	By Dismiss = By.xpath("//span[text()='Dismiss']");
	By Email= By.xpath("//input[@id='emailControl']");
	By Password= By.id("passwordControl");
	By RepeatPwd= By.id("repeatPasswordControl");
	By select= By.xpath("//div[@id='mat-select-value-1']/span");
	By value=By.xpath("//span[text()=' Your eldest siblings middle name? ']");
	By answer= By.id("securityAnswerControl");
	By register=By.xpath("//button[@id='registerButton']/span[1]");
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(Dismiss).click();
	}

	@Given("some other precondition")
	public void some_other_precondition() throws InterruptedException {
		
		driver.findElement(Email).sendKeys("test5@gmail.com");
		driver.findElement(Password).sendKeys("abcdef1!");
		driver.findElement(RepeatPwd).sendKeys("abcdef1!");
		Thread.sleep(5000);
		driver.findElement(select).click();
		Thread.sleep(1000);
		driver.findElement(value).click();
		driver.findElement(answer).sendKeys("test");
		driver.findElement(register).click();
	}

	@When("I complete action")
	public void i_complete_action() {
	    
	}

	@When("some other action")
	public void some_other_action() {
	    
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    
	}



}
