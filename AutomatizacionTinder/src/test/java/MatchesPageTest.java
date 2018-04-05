import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MatchesPage;
import pages.SummaryPage;
//import util.BaseTest;

public class MatchesPageTest extends BaseTest {

    public static SummaryPage summaryPage;

    @BeforeClass
    public static void openLoginPage() throws InterruptedException {
        LOGGER.info("Comienzo test de Summary");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Logueandome");
        //System.out.print("martin.tellechea");
        summaryPage = loginPage.loginUser("martin.tellechea", "Machete93()=?");

    }

    @org.junit.Test
    public void testMenu() {
        summaryPage.lanzaBusquedaSummary();
        MatchesPage matchesPage = summaryPage.clickMatches();
        Assert.assertTrue(matchesPage.isApp());

        Assert.assertTrue(true);
    }
}
