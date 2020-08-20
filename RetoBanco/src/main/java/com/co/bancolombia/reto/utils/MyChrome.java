package com.co.bancolombia.reto.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MyChrome {

        private static WebDriver driver;

        public static MyChrome driver() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            String downloadFilepath = System.getProperty("user.dir") + "\\src\\test\\resources\\data";
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("download.default_directory", downloadFilepath);
            chromePrefs.put("profile.default_content_setting_values.clipboard", 1);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            return new MyChrome();
        }

        public WebDriver inThePage(String url) {
            driver.get(url);
            return driver;
        }
    }