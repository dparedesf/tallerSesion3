package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeProxy implements IBrowser{
    @Override
    public WebDriver create() {
        String rutaDriver="C:\\Users\\MERY\\Desktop\\JBVulnerability\\jb_vulnerability\\src\\test\\resources\\driver\\chromedriver.exe";
        //Para crear una variable de entorno
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        //PROXY
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service",false);

        Proxy proxy = new Proxy();
        //El puerto debe ser el mismo que se utiliza en OWASP ZAP
        proxy.setHttpProxy("127.0.0.1:8888");
        //Para grabar con SSL
        proxy.setSslProxy("127.0.0.1:8888");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy",proxy);

        ChromeOptions options = new ChromeOptions();
        //Para ignorar los mensajes cuando el SSL indica error de certificado
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs",prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
        return driver;

    }
}
