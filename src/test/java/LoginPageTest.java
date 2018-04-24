import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.logging.Logger;
import pages.LoginPage;
import pages.SummaryPage;
//import BaseTest;
import util.URLs;


public class LoginPageTest extends BaseTest {

   // private static final Logger LOGGER = Logger.getLogger(LoginPageTest.class.getName());
    //private static WebDriver driver;


    @Test
    public void openLoginPage() throws InterruptedException {
        LOGGER.info("Abro browser y voy a la pagina de Login");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Trato de hacer Login");
        System.out.print("martin.tellechea");
        SummaryPage summaryPage = loginPage.loginUser("martin.tellechea", "Machete93()=?");
        Assert.assertTrue(summaryPage.isApp());
    }

    /*
    @AfterClass
    public static void tearDownDriver() {
        driver.close();
        //driver.quit();
    }*/
}

