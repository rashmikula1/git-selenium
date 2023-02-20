package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange {
	public static ChromeDriver driver=new ChromeDriver();
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	//@FindBy (name="username") WebElement name;
	By name=By.name("username");
	By pwd= By.name("password");
	By login= By.xpath("//form[@class='oxd-form']/div[3]/button");
	@Given("browser is open")
	public void browser_is_open() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.manage().window().maximize();
	   
	}

	@When("^user enters(.*)and(.*)$")
	
	public void user_enters_admin_and_admin123(String username, String password) {
		//driver.get(url);
		driver.findElement(name).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);

	    
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		
	driver.findElement(login).click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
		System.out.println("Navigated to the home screen");
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}


}
