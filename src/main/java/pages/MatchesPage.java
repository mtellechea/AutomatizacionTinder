package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MatchesPage extends Page {

    public MatchesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "ant-btn-primary")
    private WebElement btnSearch;

    @FindBy(className = "report-button")
    private WebElement btnReport;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[3]/div[4]/div/button[3]")
    private WebElement btnClean;

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[1]/div/div/div[3]/div[1]/div/div/div/div")
    private WebElement selBusinessID;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[3]/div[2]/input")
    private WebElement inpBusinessID;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/div[1]/span/div/input")
    private WebElement dateReservationFrom;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[1]/div/input")
    private WebElement dateReservationFromInput;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/div")
    private WebElement optReservationDateFrom;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/span/div/input")
    private WebElement dateReservationTo;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[6]/div")
    private WebElement optReservationDateTo;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[1]/div/input")
    private WebElement dateReservationToInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/div[3]/div/div/div/ul/li/div/input")
    private WebElement selOracleStatus;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/div[4]/div/div/div/div")
    private WebElement selLegalEntity;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/div[4]/div/div/div/ul/li/div/input")
    private WebElement inpLegalEntiy;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[1]/div/div/div")
    private WebElement selCollectionType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[1]/div/div/div/ul/li/div/input")
    private WebElement inpCollectionType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[2]/div/div/div")
    private WebElement selApplicationType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[2]/div/div/div/ul/li/div/input")
    private WebElement inpApplicationType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[3]/div/div/div/div")
    private WebElement selProductType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[3]/div/div/div/ul/li/div/input")
    private WebElement inpProductType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[4]/div/div/div")
    private WebElement selChannel;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/div[4]/div/div/div/ul/li/div/input")
    private WebElement inpChannel;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/div/table/tbody")
    private WebElement gridRow1;

    @FindBy(xpath = "/html/body/div[11]/div/div[2]/div/div[1]/div/div/div[2]/button[2]")
    private WebElement btnReportOK;

    @FindBy(className = "ant-notification-notice-closable")
    private WebElement msgReport;



    @FindBy(id = "app")
    private WebElement app;



public void runBasicSearch(String BID){
    btnClean.click();
    inpBusinessID.click();
   // selBusinessID.click();
    inpBusinessID.sendKeys(BID);
    btnSearch.click();
    }

public void runReservationDateSearch() {
    btnClean.click();
    dateReservationFrom.click();
    optReservationDateFrom.click();
    dateReservationTo.click();
    optReservationDateTo.click();
    btnSearch.click();
}

public void runOracleStatusSearch(){
    btnClean.click();
    //selOracleStatus.click();
    selOracleStatus.sendKeys("ERROR");
 //   dateReservationFrom.click();
   dateReservationFrom.click();
    dateReservationFromInput.sendKeys("2018-01-01");
    //dateReservationFrom.sendKeys("2018-01-01");
    btnSearch.click();
}

public void runLegalEntitySearch() {
    btnClean.click();
    selLegalEntity.click();
    inpLegalEntiy.sendKeys("Decolar.com Ltda");
    dateReservationFrom.click();
    dateReservationFromInput.sendKeys("2018-01-01");
    btnSearch.click();
}

    public void runCollectionTypeSearch() {
        btnClean.click();
        selCollectionType.click();
        inpCollectionType.sendKeys("PP");
        dateReservationFrom.click();
        dateReservationFromInput.sendKeys("2018-01-01");
        btnSearch.click();
    }

    public void runApplicationTypeSearch() {
        btnClean.click();
        selApplicationType.click();
        inpApplicationType.sendKeys("AR_FC");
        dateReservationFrom.click();
        dateReservationFromInput.sendKeys("2018-01-01");
        btnSearch.click();
    }

    public void runProductTypeSearch() {
        btnClean.click();
        selProductType.click();
        inpProductType.sendKeys("FLIGHT");
        dateReservationFrom.click();
        dateReservationFromInput.sendKeys("2018-01-01");
        btnSearch.click();
    }

    public void runChannelSearch() throws InterruptedException {
        Thread.sleep(500);
        btnClean.click();
        selChannel.click();
        inpChannel.sendKeys("SALE");
        dateReservationFrom.click();
        dateReservationFromInput.sendKeys("2018-01-01");
        btnSearch.click();
    }



    public String runReportCreation(String FechasReporte) throws InterruptedException {
    Thread.sleep(300);
    btnClean.click();
    dateReservationFrom.click();
    dateReservationFromInput.sendKeys(FechasReporte);
    //optReservationDateFrom.click();
    selOracleStatus.click();
    dateReservationTo.click();
    dateReservationToInput.sendKeys(FechasReporte);
    btnSearch.click();
    btnReport.click();
    btnReportOK.click();
    Thread.sleep(1000);
    String resultadoReport = msgReport.getText();
    return resultadoReport;
    }



    public boolean trajoResults() {
        wait.until(ExpectedConditions.elementToBeClickable(gridRow1));
        return gridRow1.isDisplayed();
    }

    public boolean isApp() {
        return app.isDisplayed();
    }
 }

