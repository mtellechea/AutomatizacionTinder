//import org.junit.Assert;
//import org.junit.BeforeClass;
//7import org.junit.Test;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.MatchesPage;
import pages.SummaryPage;
import util.Browser;
import util.URLs;

import static util.SeleniumUtils.buildDriver;
//import util.BaseTest;

public class SummaryPageTest extends BaseTest {

    public static SummaryPage summaryPage;

    @BeforeTest
    public  static void openDriver() throws Exception {
        driver = buildDriver(Browser.CHROME);
        driver.get(URLs.RC.getUrl());
    }

    @BeforeMethod
    public static void openLoginPage() throws InterruptedException {
        LOGGER.info("Comienzo test de Summary");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Logueandome");
        //System.out.print("martin.tellechea");
        summaryPage = loginPage.loginUser("martin.tellechea", "Machete94()=?");

    }

    @Test
    public void testMenu() {
        summaryPage.lanzaBusquedaSummary();
        MatchesPage matchesPage = summaryPage.clickMatches();
        Assert.assertTrue(matchesPage.isApp());
      //Assert.assertTrue(true);
    }

    @AfterTest
    public static void tearDownDriver() {
        driver.quit();
        //driver.quit();
    }

}
