package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHolder {

    private static WebDriver chromeDriver;

    public static WebDriver getChromeDriver() {
        if (chromeDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver");
            return new ChromeDriver();
        }
        return chromeDriver;
    }
}
