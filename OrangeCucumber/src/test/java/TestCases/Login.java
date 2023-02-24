package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
	private WebDriver driver;
	
	@Given("Open the Application")
	public void open_the_application() throws Exception {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://183.82.103.245/nareshit/login.php");
	    Thread.sleep(1000);
	}

	@When("Enter the {string}{string}")
	public void enter_the(String un, String pw) {
	    driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
	    
	}

	@And("Click on login button")
	public void click_on_login_button()throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Close the application")
	public void close_the_application() {
	   driver.quit();
	}

}
