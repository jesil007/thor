package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}

@Given("user is on the login page")
public void user_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://www.facebook.com/");
}

@When("user enter username and password")
public void user_enter_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
 driver.findElement(By.name("email")).sendKeys("asdf@gmail.com");
 driver.findElement(By.name("pass")).sendKeys("pass213");
 
}

@And("click login button")
public void click_login_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("login")).submit();
}


@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com","valid login");
}

}
