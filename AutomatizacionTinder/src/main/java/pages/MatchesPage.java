package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MatchesPage extends Page {

    @FindBy(className = "ant-btn-primary")
    private WebElement btnSearch;
    @FindBy(className = "report-button")
    private WebElement btnReport;
    @FindBy(className = "ant-btn-danger")
    private WebElement btnClean;

    @FindBy(id = "app")
    private WebElement app;

    public MatchesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isApp() {
        return app.isDisplayed();
    }
 }

