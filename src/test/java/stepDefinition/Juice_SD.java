package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Juice_SD {
	public static ChromeDriver driver=new ChromeDriver();
	String url="https://juice-shop.herokuapp.com/#/register";
	String url1="https://juice-shop.herokuapp.com/#/login";
	//@FindBy (xpath="//span[text()='Dismiss']") WebElement Dismiss;
	By Dismiss = By.xpath("//span[text()='Dismiss']");
	By Email= By.xpath("//input[@id='emailControl']");
	By Password= By.id("passwordControl");
	By RepeatPwd= By.id("repeatPasswordControl");
	By select= By.xpath("//div[@id='mat-select-value-1']/span");
	By value=By.xpath("//span[text()=' Your eldest siblings middle name? ']");
	By answer= By.id("securityAnswerControl");
	By register=By.xpath("//button[@id='registerButton']/span[1]");

	@Given("Launch the URL")
	public void launch_the_url() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		//Dismiss.click();
		//Please create a user in https://juice-shop.herokuapp.com/#/register
		
	  
	}

	@And("Create a User")
	public void create_a_user() throws InterruptedException {
		driver.findElement(Dismiss).click();
		driver.findElement(Email).sendKeys("test30@gmail.com");
		driver.findElement(Password).sendKeys("abcdef1!");
		driver.findElement(RepeatPwd).sendKeys("abcdef1!");
		Thread.sleep(5000);
		driver.findElement(select).click();
		Thread.sleep(1000);
		driver.findElement(value).click();
		driver.findElement(answer).sendKeys("test");
		driver.findElement(register).click();
	   
	}

	@Then("Login into the page")
	public void login_into_the_page() {
	   
	}

	@When("The page is logged in we can able to Add one or two items to basket")
	public void the_page_is_logged_in_we_can_able_to_add_one_or_two_items_to_basket() {
	   
	}

	@And("Go to your basket and increase the quantity of all items by {int}")
	public void go_to_your_basket_and_increase_the_quantity_of_all_items_by(Integer int1) {
	    
	}

	@And("Press checkout and add a new address")
	public void press_checkout_and_add_a_new_address() {
	    
	}

	@Then("Select the address and any delivery speed")
	public void select_the_address_and_any_delivery_speed() {
	    
	}

	@And("Add a new card, try to add a fake coupon \\({int} digits) and verify error message")
	public void add_a_new_card_try_to_add_a_fake_coupon_digits_and_verify_error_message(Integer int1) {
	    
	}

	@And("Select card, review and place the order")
	public void select_card_review_and_place_the_order() {
	    
	}

	@And("Verify in Account, order history print order, track order")
	public void verify_in_account_order_history_print_order_track_order() {
	    
	}

	@Then("logout from the application")
	public void logout_from_the_application() {
	    
	}


}
