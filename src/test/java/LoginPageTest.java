//import org.junit.Assert;
//import org.junit.BeforeClass;
//7import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MatchesPage;
import pages.SummaryPage;
//import util.BaseTest;



public class LoginPageTest extends BaseTest {

   // private static final Logger LOGGER = Logger.getLogger(LoginPageTest.class.getName());
    //private static WebDriver driver;


    @Test
    public void openLoginPage()  {
        LOGGER.info("Abro browser y voy a la pagina de Login");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Trato de hacer Login!");
        System.out.print("martin.tellechea");
        SummaryPage summaryPage = loginPage.loginUser("martin.tellechea", "Machete94()=?");
        Assert.assertTrue(summaryPage.isApp());
    }

    @AfterClass
    public static void tearDownDriver() {
        driver.quit();
        //driver.quit();
    }
}

