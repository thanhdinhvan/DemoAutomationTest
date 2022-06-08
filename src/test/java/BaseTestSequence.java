import common.CapabsReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestSequence {
    CapabsReader capabs = null;
    AppiumDriver<MobileElement> appium = null;
    AppiumDriver<MobileElement> appTest2 = null;
    AppiumDriverLocalService service = null;
    AppiumDriverLocalService service2 = null;

    public void configTest() {
        service = new AppiumServiceBuilder().usingPort(Integer.valueOf(5785)).build();
        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("deviceName", "iphone 11");
        capabilities.setCapability("udid", "1AEF1C53-0D87-40B5-AF2E-431898EE8E18");
        capabilities.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT,"8011");
        capabilities.setCapability("app", "/Users/vanthanh/Downloads/UserAndDriver/[S]mobi　Community　Mobility.app");
        capabilities.setCapability("derivedDataPath", "/Users/vanthanh/Desktop/device/device2");
        appTest2 = new IOSDriver<MobileElement>(service.getUrl(), capabilities);
        appTest2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void configTestPralells() {
//        service2 = new AppiumServiceBuilder().usingPort(Integer.valueOf(5786)).build();
//        service2.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("platformVersion", "15.0");
        capabilities.setCapability("deviceName", "iphone 11 Pro");
        capabilities.setCapability("udid", "84B06133-A415-4BD7-91E1-B807B9E30557");
        capabilities.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT,"8081");
        capabilities.setCapability("app", "/Users/vanthanh/Downloads/UserAndDriver/[S]mobi Community Mobility Driver.app");
        capabilities.setCapability("derivedDataPath", "/Users/vanthanh/Desktop/device/device2");
        appium = new IOSDriver<MobileElement>(service.getUrl(), capabilities);
        appium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public  void kill(){

        if (service != null){
            service.stop();
        }
        if (service2 != null){
            service2.stop();
        }
    }
}
