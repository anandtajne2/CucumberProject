package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsFeatures {

	public WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("step 1 user is on login page ");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("step 2 user enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

//	@When("click on login button")
//	public void click_on_login_button() {
//		System.out.println("step 3 user clicking on login button");
//		driver.findElement(By.id("btnLogin")).click();
//	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("user lands on home page");
	}

	@Then("user will close the browser")
	public void user_will_close_the_browser() {
		System.out.println("user is closing the browser");
		driver.close();
	}

}
