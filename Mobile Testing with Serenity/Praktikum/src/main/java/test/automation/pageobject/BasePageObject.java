package test.automation.pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.automation.driver.AndroidDriverPool;
import test.automation.driver.DriverPool;

public class BasePageObject {

    public DriverPool driver = new DriverPool();
    public AndroidDriverPool androidDriverPool = new AndroidDriverPool();

    public AndroidDriver getDriver() {
        if (this.driver.getAndroidDriver() == null) {
            this.driver.setAndroidDriver(this.androidDriverPool.create());
        }
        return this.driver.getAndroidDriver();
    }

    public WebDriverWait onWait() {
        return new WebDriverWait(getDriver(), 15);
    }

    public AndroidElement waitUntilClickable(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.elementToBeClickable(by));
    }

    public AndroidElement waitUntilPresence(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public AndroidElement waitUntilVisible(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void onClick(By by) {
        waitUntilClickable(by).click();
    }

    public void onType(By by, CharSequence... keysToSend) {
        waitUntilPresence(by).sendKeys(keysToSend);
    }

    public void clear(By by) {
        waitUntilPresence(by).clear();
    }

    public boolean isElementInvisible(By by) {
        return onWait().until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}
