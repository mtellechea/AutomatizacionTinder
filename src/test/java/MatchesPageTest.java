//import org.junit.Assert;
//import org.junit.BeforeClass;
//7import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MatchesPage;
import pages.SummaryPage;
//import util.BaseTest;

public class MatchesPageTest extends BaseTest {

    public static SummaryPage summaryPage;
    public static MatchesPage matchesPage;


    @BeforeClass
    public static void openLoginPage() throws InterruptedException {
        LOGGER.info("Comienzo test de Summary");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Logueandome");
        //System.out.print("martin.tellechea");
        summaryPage = loginPage.loginUser("martin.tellechea", "Machete94()=?");
        matchesPage = summaryPage.clickMatches();

    }




    @Test(priority = 1)
    public void testBasicSearch() {
        LOGGER.info("Corro busqueda básica con ID 6920115402");
        matchesPage.runBasicSearch("6920115402");
        Assert.assertTrue(matchesPage.trajoResults());
        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }

    @Test(priority = 2)
    public void testReservationDateSearch(){
        LOGGER.info("Corro busqueda usando fechas de Reserva");
        matchesPage.runReservationDateSearch();
        Assert.assertTrue(matchesPage.trajoResults());
        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }


    @Test(priority = 3)
    public void testReservationByOracleStatusError(){
        LOGGER.info("Corro busqueda usando Oracle Status ERROR");
        matchesPage.runOracleStatusSearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }

    @Test(priority = 4)
    public void testReservationByLegalEntity(){
        LOGGER.info("Corro busqueda usando Legal Entity");
        matchesPage.runLegalEntitySearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }

    @Test(priority = 5)
    public void testReservationByCollectionType(){
        LOGGER.info("Corro busqueda usando Collection Type");
        matchesPage.runCollectionTypeSearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }


    @Test(priority = 6)
    public void testReservationByApplicationType(){
        LOGGER.info("Corro busqueda usando Application Type");
        matchesPage.runApplicationTypeSearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }

    @Test(priority = 7)
    public void testReservationByChannel() throws InterruptedException {
        LOGGER.info("Corro busqueda usando Product Type");
        matchesPage.runChannelSearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }

    @Test(priority = 8)
    public void testReservationByProductType(){
        LOGGER.info("Corro busqueda usando Channel");
        matchesPage.runProductTypeSearch();
        Assert.assertTrue(matchesPage.trajoResults());

        if (matchesPage.trajoResults()) {
            LOGGER.info("Trajo resultados válidos");
        } else
            LOGGER.info("NO trajo resultados válidos");
    }



    @Test(priority = 9)
    public void testReportCreation() throws InterruptedException {
        LOGGER.info("Corro busqueda y creo Reporte");
        String resultadoReport = matchesPage.runReportCreation("2018-04-01");
        //LOGGER.info(resultadoReport);
        if (resultadoReport.contains("Report generated successfully"))
            LOGGER.info("Reporte generado OK");
        else LOGGER.info("Reporte NO generado: "+resultadoReport);
        Assert.assertTrue(matchesPage.trajoResults());
    }

}