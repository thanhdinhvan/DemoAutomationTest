import common.CapabsReader;
import common.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseTest {
     CapabsReader capabs = null;
     AppiumDriver<MobileElement> appium = null;
     AppiumDriverLocalService service = null;

    @Parameters({"wda", "deviceName", "port", "path"})
    @BeforeClass(alwaysRun = true)
    public void setUpTestLogin(String wda, String deviceName, String port, String path ){
        service = new AppiumServiceBuilder().usingPort(Integer.valueOf(port)).build();
        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT,wda);
        capabilities.setCapability("app", "/Users/vanthanh/Library/Developer/Xcode/DerivedData/LoginScreen-2-hhcxfmgjvvhuiwgrnmfldvqjdeyn/Build/Products/Debug-iphonesimulator/LoginScreen-2.app");
        capabilities.setCapability("derivedDataPath", path);
        appium = new IOSDriver<MobileElement>(service.getUrl(), capabilities);

        appium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public  void denit(){

        appium.closeApp();
        appium.quit();
        service.stop();
    }


}


