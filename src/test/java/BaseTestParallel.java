import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestParallel {
    AppiumDriver<MobileElement> appTest2 = null;
    AppiumDriverLocalService service = null; 

    @Parameters({"wda", "deviceName", "port", "path"})
    @BeforeClass(alwaysRun = true)
    public void configTest(String wda, String deviceName, String port, String path  ) {
        service = new AppiumServiceBuilder().usingPort(Integer.valueOf(port)).build();
        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT,wda);
        //capabilities.setCapability("udid", "DF7A9E00-C9CE-4936-91C3-4D802D4F1FD7");
        capabilities.setCapability("app", "/Users/vanthanh/Downloads/UserAndDriver/[S]mobi Community Mobility Driver.app");
        capabilities.setCapability("derivedDataPath", path);

            appTest2 = new IOSDriver<MobileElement>(service.getUrl(), capabilities);

        appTest2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //actualTest(driver);
    }

    @AfterClass
    public void kill(){
        service.stop();
    }
}
