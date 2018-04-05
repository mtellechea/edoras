import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import util.Browser;
import util.URLs;

import java.util.logging.Logger;
import static util.SeleniumUtils.buildDriver;

public  class BaseTest {
     public static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());
     public static WebDriver driver;

      @BeforeClass
      public  static void openDriver() throws Exception {
          driver = buildDriver(Browser.FIREFOX);
          driver.get(URLs.RC.getUrl());
      }

    }
