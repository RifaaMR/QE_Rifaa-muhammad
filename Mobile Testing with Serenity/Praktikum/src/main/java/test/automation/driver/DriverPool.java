package test.automation.driver;

import io.appium.java_client.android.AndroidDriver;

import java.util.HashMap;

public class DriverPool {
    private HashMap<String, AndroidDriver> android = new HashMap<>();

    public AndroidDriver getAndroidDriver() {
        return this.android.get(Thread.currentThread().getName());
    }

    public void setAndroidDriver(AndroidDriver androidDriver) {
        this.android.put(Thread.currentThread().getName(), androidDriver);
    }
}
