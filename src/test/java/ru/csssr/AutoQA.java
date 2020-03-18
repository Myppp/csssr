package ru.csssr;

import org.junit.Test;

public class AutoQA extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {

        Thread.sleep(2000);//Чтобы страница точно полностью прогрузилась

        System.out.println("Проверка ссылки для скриншотов!");
        driver.findElementByLinkText("НАХОДИТЬ НЕСОВЕРШЕНСТВА").click();
        driver.findElementByLinkText("Софт для быстрого создания скриншотов").click();
        String url = driver.getCurrentUrl();
        if(url.equals("https://monosnap.com/")) {
            System.out.println("Ссылка верна!");
        } else {
            System.out.println("Ссылка некорректная!");
        }
    }
}