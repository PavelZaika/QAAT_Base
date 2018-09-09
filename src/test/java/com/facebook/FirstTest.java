package com.facebook;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {

    @Test


    public void firstTest1() {///ddfdfdf

        driver.get("https://www.facebook.com/");
        System.out.println("Open");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Facebook — войдите или зарегистрируйтесь"));
        System.out.println(title);

    }

    @Test
    public void firstTest2() {

        driver.get("https://www.facebook.com/");
        System.out.println("Open");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Facebook — войдите или зарегистрируйтесь"));
        System.out.println(title);
    }

}
