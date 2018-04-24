package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReportsPage extends Page {

    public ReportsPage (WebDriver driver) {super(driver);}

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[1]/div/div[1]/span/div/input")
    private WebElement selReportDateFrom;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[1]/div/input")
    private WebElement inpReportDateFrom;
    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[1]/div/div[2]/span/div/input")
    private WebElement selReportDateTo;
    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[1]/div/div[3]/label/span[1]/input")
    private WebElement chkShowOnlyMyReports;
    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[1]/div/div[4]/button")
    private WebElement btnSearch;
    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/table/tbody")
    private WebElement gridResults;
    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[5]/button")
    private WebElement btnInfo;
  //  @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[6]/button")
  //  private WebElement btnDownload;
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[1]/div/div/div[1]/span")
    private WebElement txtReportTitle;
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[1]/div/div/div[2]/button")
    private WebElement btnInfoOK;

    public void runReportDateSearch (String reportDate) {
        selReportDateFrom.click();
        inpReportDateFrom.clear();
        inpReportDateFrom.sendKeys(reportDate);
        chkShowOnlyMyReports.click();
        btnSearch.click();
    }

    public boolean runDownloadReport (){
        Boolean findReport=false;
        List<WebElement> allRows= driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Cantidad de reportes: "+allRows.size());
        for (int i=1;i<=allRows.size();i++) {
            WebElement reportStatus=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]"));
            if (reportStatus.getText().toLowerCase().equalsIgnoreCase("GENERATED")){
                WebElement reportID=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
                System.out.println("Reporte GENERADO encontrado. ID:"+reportID.getText());

                if (findReport== false){
                findReport = true;
                WebElement btnDownload = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]/button"));
                btnDownload.click();}
            }
        }
        return findReport;
    }

    public boolean verifyInfo() throws InterruptedException {
        Thread.sleep(2000);
        btnInfo.click();
        String infoTitle = txtReportTitle.getText();

        btnInfoOK.click();
        if (infoTitle.equals("Report info") ) {
            return true;
        } else
            return false;
    }

    public boolean trajoResults() {
        return gridResults.isDisplayed();
    }


}
