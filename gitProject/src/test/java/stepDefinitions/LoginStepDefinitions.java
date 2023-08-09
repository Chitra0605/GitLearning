package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import utilities.ConstantUtils;

import java.time.Duration;


public class LoginStepDefinitions extends WebConnector {

    private LoginPage logpage = new LoginPage();

    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() { driver.get(ConstantUtils.BASE_URL); }


    @Given("the user follows {string} link")
    public void the_user_follows_link(String linkText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
    }
    @When("the user enter {string} in username field")
    public void the_user_enter_in_username_field(String username) {logpage.setUserName(username);}

    @When("the user enter {string} in password field")
    public void the_user_enter_in_password_field(String password) {
        logpage.setPassword(password);
    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        logpage.clickLogin();
    }


    @Then("the user should see {string} page")
    public void the_user_should_see_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

    @When("the user login with {string} username and {string} password and click on login button")
    public void the_user_login_with_username_and_password_and_click_on_login_button(String username, String password) {
        logpage.setUserName(username);
        logpage.setPassword(password);
        logpage.clickLogin();
    }

    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }

}




