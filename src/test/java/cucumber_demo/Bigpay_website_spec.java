package cucumber_demo;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static cucumber_demo.pages.careers_page.*;


public class Bigpay_website_spec {
    private WebDriver driver = new FirefoxDriver();
    private String title = "Challenge Banking - BigPay";
    private String base_url = "https://www.bigpayme.com/";


    @Given("user open bigpay website")
    public void user_open_bigpay_website() {
        driver.get(base_url);
        Assert.assertEquals(driver.getTitle(), title);
    }

    @When("user go to careers tab")
    public void user_go_to_careers_tab() {
        String menu = "SITE_HEADERinlineContent";
        String career_locator = "Careers";

        go_to_careers_page(driver, menu, career_locator);
        wait_careers_page_refreshed(driver, "careers");
        Assert.assertEquals(driver.getTitle(), title);
    }

    @Then("he could find the open positions")
    public void he_could_find_the_open_positions() {
        String open_positions = "comp-jqx7363a";

        wait_find_position_information(driver, open_positions);
        Assert.assertEquals(driver.findElement(By.id(open_positions)).getText(), "Open Positions");
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
