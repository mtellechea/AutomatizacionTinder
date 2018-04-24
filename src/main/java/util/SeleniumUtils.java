package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import util.URLs;
import util.Browser;

import java.util.logging.Logger;


public class SeleniumUtils {

    public static WebDriver buildDriver (Browser browser) throws Exception {
        WebDriver driver = null;

        switch (browser) {
            case FIREFOX:
                FirefoxProfile profile = new FirefoxProfile();
                profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
                profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/csv, text/csv, text/plain,application/octet-stream doc xls pdf txt");
                profile.setPreference("browser.download.manager.focusWhenStarting", false);
                profile.setPreference("browser.download.useDownloadDir", true);
                profile.setPreference("browser.helperApps.alwaysAsk.force", false);
                profile.setPreference("browser.download.manager.closeWhenDone", true);
                profile.setPreference("browser.download.manager.showAlertOnComplete", false);
                profile.setPreference("browser.download.manager.useWindow", false);
                profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
                profile.setPreference("pdfjs.disabled", true);
                driver = new FirefoxDriver(profile);
                break;
            case CHROME:
                driver = new ChromeDriver();
                break;

            default: throw new Exception("Browser not found!");


        }
        return driver;
    }


}
