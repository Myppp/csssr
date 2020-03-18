package ru.csssr;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/bd/Downloads/csssr/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("Web Driver успешно настроен и запущен!");
        driver.get("http://blog.csssr.ru/qa-engineer/");
        System.out.println("Сайт открыт!");
    }

    @After
    public void close() {
    }
}