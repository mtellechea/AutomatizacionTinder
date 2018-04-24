package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Page{

    public LoginPage(WebDriver driver){super(driver);}

    @FindBy(name = "username")
    private WebElement fieldUsername;

    @FindBy(name = "password")
    private WebElement fieldPassword;


    //@FindBy(className = "btn btn-lg btn-primary btn-block")
    //private WebElement btnSubmit;

    @FindBy(xpath = "/html/body/div/div/form/button")
    private WebElement btnSubmit;



    public SummaryPage loginUser (String username, String password) {
        this.wait.until(ExpectedConditions.elementToBeClickable(this.fieldUsername));
        fieldUsername.sendKeys(username);
        fieldPassword.sendKeys(password);
        btnSubmit.click();
        return new SummaryPage(driver);

    }
}
