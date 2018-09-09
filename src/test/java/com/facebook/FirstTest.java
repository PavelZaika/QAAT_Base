package com.facebook;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    @Test
    public void userLogin() {

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Facebook — войдите или зарегистрируйтесь"));
        System.out.println(title);

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("test");
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("testpass");
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

    }

}
