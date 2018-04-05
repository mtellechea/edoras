package util;

//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.URLs;
import util.Browser;

import java.util.logging.Logger;


public class SeleniumUtils {

    public static WebDriver buildDriver (Browser browser) throws Exception {
        WebDriver driver = null;

        switch (browser) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver();
                break;

            default: throw new Exception("Browser not found!");


        }
        return driver;
    }


}
