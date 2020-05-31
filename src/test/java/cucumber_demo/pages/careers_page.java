package cucumber_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class careers_page {
    private final static Integer TIMEOUT = 5000;

    public static void go_to_careers_page(WebDriver driver, String menu, String career_locator) {
        driver.findElement(By.id(menu)).findElement(By.linkText(career_locator)).click();
    }

    public static void wait_careers_page_refreshed(WebDriver driver, String careers) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.urlContains(careers));

    }

    public static void wait_find_position_information(WebDriver driver, String open_positions) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(By.id(open_positions)));
    }
}
