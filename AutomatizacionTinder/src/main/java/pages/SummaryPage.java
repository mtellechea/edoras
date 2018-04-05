package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends Page {

    public SummaryPage (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/ul/li[3]/a")
    public WebElement menuMatches;

    @FindBy(id = "app")
    private WebElement app;

    @FindBy(className = "ant-select-selection__placeholder")
    private WebElement legalEntities;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/ul/li[5]")
    private WebElement optnChile;

    @FindBy(className = "ant-btn-primary")
    public WebElement btnSearch;

    public boolean isApp() {
        return app.isDisplayed();
    }

    public MatchesPage clickMatches() {
        menuMatches.click();
        return new MatchesPage(driver);
    }



    public void lanzaBusquedaSummary() {
        legalEntities.click();
        optnChile.click();
        btnSearch.click();
    }


}
