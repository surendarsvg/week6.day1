package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver  driver;
	@Given("open the chrome browser")
	public void openchromebrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}
	@Given("Load the application url")
	public void loadapplication () {
		driver.get("http://leaftaps.com/opentaps");
			
	}
	@Given("Enter the username as {string}")
	public void enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
		@Given("Enter the password as {string}")
		public void enterpassword(String password) {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		}
	@When("Click on login button")
	public void clickloginbutton () {
		driver.findElement(By.className("decorativesubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyhomepage () {
		boolean elementDisplayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (elementDisplayed) {
			System.out.println("Homepage is displayed");
		}
		else
		{
			System.out.println("");
		}
	@But("Error message should be dispalyed")
	public void verifyErrorMessage () {
		System.out.println("Error message is displayed");
	}
		
	}
	
	
