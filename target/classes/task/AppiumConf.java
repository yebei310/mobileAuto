package task;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static testcases.TestStudentClass.androidDriver;
import java.net.URL;

public class AppiumConf {

    public static void setUp() throws Exception {
        //1.添加配置，创建DesiredCapabilities对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //指定测试设备的名称
        desiredCapabilities.setCapability("deviceName", "03157df38af71a05");
        //添加操作系统配置
        desiredCapabilities.setCapability("platformName", "Android");
        //添加操作系统版本设置
        desiredCapabilities.setCapability("platformVersion", "7.0");
        //指定想要测试应用的包名
        desiredCapabilities.setCapability("appPackage", "com.pxwx.student");
        //指定想要测试应用的入口activity
        desiredCapabilities.setCapability("appActivity", ".ui.activity.SplashActivity");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        //2.创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
    }
}
