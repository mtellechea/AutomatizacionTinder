package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver){
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(driver,20);
        this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
}
