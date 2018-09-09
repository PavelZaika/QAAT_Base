package com.facebook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        File file = new File("D:\\AndroidDev\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        System.out.println("Test start");

    }

    @After
    public void closed() {
        driver.quit();
        System.out.println("Test close");

    }

}
