import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import selenium.SeleniumHolder;

public class Test_01_CheckSearchResultsPageIsDisplayed {

    /**
     * Scenario: Check search result page is opened by clicking on 'Find flights' button.
     *
     * Steps:
     * 1. Open BlazeDemo.com page - Main page has opened
     * 2. Click 'Find flights' - Search results page is displayed
     */

    private static final WebDriver WEB_DRIVER = SeleniumHolder.getChromeDriver();


    @Test
    public void test_01_CheckSearchResultsPageIsDisplayed() {
        // Step 1
        WEB_DRIVER.get("http://blazedemo.com");
        Assert.assertEquals(WEB_DRIVER.getTitle(), "BlazeDemo");

        // Step 2
        WEB_DRIVER.findElement(By.cssSelector("input[value='Find Flights']")).click();
        Assert.assertEquals(WEB_DRIVER.getTitle(), "BlazeDemo - reserve");

    }

    @AfterMethod
    public void tearDown() {
        WEB_DRIVER.close();
    }
}
