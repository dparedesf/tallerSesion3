package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome implements  IBrowser{

    @Override
    public WebDriver create() {
        String rutaDriver="C:\\Users\\MERY\\Desktop\\JBVulnerability\\jb_vulnerability\\src\\test\\resources\\driver\\chromedriver.exe";
        //Para crear una variable de entorno
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
        return driver;
    }
}


