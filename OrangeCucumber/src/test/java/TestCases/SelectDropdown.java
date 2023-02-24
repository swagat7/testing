package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	String s = "";
	private WebDriver driver;
	@Given("Open application")
	public void open_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
	
		
	   
	}

	@When("Enter {string} {string}")
	public void enter(String un, String pw) {
		 driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
		    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);

	    
	}

	@And("Click on login Button")
	public void click_on_login_button() {
		driver.findElement(By.name("Submit")).click();
	    
	}

	@And("Click on all the dropdown")
	public void click_on_all_the_dropdown()throws Exception {
		driver.switchTo().frame("rightMenu");
		WebElement e = driver.findElement(By.xpath("//*[@id='loc_code']"));
		Select dr=new Select(e);
		 List<WebElement> t =dr.getOptions();
	      System.out.println("Options are: ");
	      for(WebElement options: t) {
	              System.out.println(options.getText());
	      		  s = (options.getText());
	      		  Thread.sleep(2000);
	            dr.selectByVisibleText(s);
	      
	      
	      }
//		dr.selectByVisibleText("Emp. First Name");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	    
	}

	@Then("Close application")
	public void close_application() {
	   driver.quit();
	}

}
