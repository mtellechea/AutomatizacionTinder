import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ReportsPage;
import pages.SummaryPage;

import java.util.List;
import java.util.logging.Logger;

public class ReportsPageTest extends BaseTest {

    public static SummaryPage summaryPage;
    public static ReportsPage reportsPage;


    @BeforeClass
    public static void openLoginPage() throws InterruptedException {
        LOGGER.info("Comienzo test de Summary");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Logueandome");
        //System.out.print("martin.tellechea");
        summaryPage = loginPage.loginUser("martin.tellechea", "Machete94()=?");
        reportsPage = summaryPage.clickReports();
        }


    @Test(priority = 1)
    public void testReportsSearch(){
        LOGGER.info("Corro busqueda de Reportes");
        reportsPage.runReportDateSearch("2018-04-12");
        Assert.assertTrue(reportsPage.trajoResults());
        }

    @Test(priority = 2)
    public void validarReportsInfo() throws InterruptedException {
            LOGGER.info("Verifico popup de Reports Info");
            Assert.assertTrue(reportsPage.verifyInfo());
    }

    @Test(priority = 3)
    public void imprimirEncabezados(){
        List <WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table/thead/tr[1]/th/span"));
        System.out.println("Headers in table are below:");
        System.out.println("Total headers found: "+allHeadersOfTable.size());
        for(WebElement header:allHeadersOfTable)
        {
            System.out.println(header.getText());
        }
    }

    @Test(priority = 4)
    public void testDownloadReport(){
        LOGGER.info("Pruebo bajada de Reporte");
        Assert.assertTrue(reportsPage.runDownloadReport());


    }
}
