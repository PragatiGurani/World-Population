package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Population {

	WebDriver driver;

//	@Before
//	public void initialize() {
//		
//	}

	@When("user navigates to worldometers page")
	public void user_navigates_to_worldometers_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://worldometers.info/world-population/");
	}

	@Then("search for population of the country")
	public void search_for_population_of_the_country() {
		System.out.println(driver.findElement(By.xpath("//span[@rel='viet-nam-population']")).getText());
	}

	@Then("user get the population of the country")
	public void user_get_the_population_of_the_country() {

	}

}
