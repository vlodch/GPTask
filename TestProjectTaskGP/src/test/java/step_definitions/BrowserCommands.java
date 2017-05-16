
package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {
    public WebDriver driver;

    public BrowserCommands() {
        driver = Hooks.driver;
    }

    @Given("^User open site$")
    public void user_open_site() throws Throwable {
        driver.get("https://sports.williamhill.com/betting/en-gb");
        driver.manage().window().maximize();
    }

    @And("^User navigate to football event$")
    public void user_navigate_to_football_event() throws Throwable {
        driver.findElement(By.id("OB_OU1551289081")).click();
    }

    @Then("^User navigate to place bet$")
    public void user_navigate_to_place_bet() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='stake-input__1551289081L']")).click();
    }

    @Then("^User place bet$")
    public void user_place_bet() throws Throwable {

        driver.findElement(By.id("stake-input__1551289081L")).sendKeys(String.valueOf(0.05));
        driver.findElement(By.id("place-bet-button")).click();
        // Write code here that turns the phrase above into concrete actions


    }
}