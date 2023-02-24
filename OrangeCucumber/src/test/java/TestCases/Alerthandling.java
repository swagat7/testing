package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandling {
private WebDriver driver;
	
	@Given("Open Application")
	public void open_application() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
	   
	}

	@When("Enter the {string}")
	public void enter_the(String UN) throws Exception{
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(UN);
	   Thread.sleep(2000);
	}

	@And("Click on the login button")
	public void click_on_the_login_button() throws Exception{
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	   Thread.sleep(2000);
	  
	}

	@And("Switch to alert")
	public void switch_to_alert() throws Exception{
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		
		
	   
	}

	@Then("Close Application")
	public void close_application() {
		driver.quit();
	   
	}


}


