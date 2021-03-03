package utils;

import config.ReadProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.nio.file.Paths;

public class Appium {

    private ReadProperties properties = new ReadProperties();

    public AppiumDriver init() throws Exception {

        properties.initProperty("device.properties");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getValue("platformVersion"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getValue("deviceName"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getValue("appActivity"));
        capabilities.setCapability(MobileCapabilityType.APP, Paths.get("src","test","resources", properties.getValue("apk"))
                .toAbsolutePath()
                .toString() );
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getValue("appPackage"));
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);

        return new AndroidDriver(new URL(properties.getValue("URL")), capabilities);
    }

}
