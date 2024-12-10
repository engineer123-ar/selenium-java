package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Helloworld {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NCS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        WebElement element;


//        driver.get("https://student.saylaniwelfare.com/");
//        System.out.println("Page title is: " + driver.getTitle());
//
//        element = driver.findElement(By.id("form7Example1"));
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        element.clear();
//
//        element = driver.findElement(By.id("form7Example2"));
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        element.clear();
        //  element = driver.findElement(By.xpath(("//button[contains(text(),'LOGIN')]")));
//        element.click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        element = driver.findElement(By.className(("Toastify__close-button Toastify__close-button--light")));

        driver.get("https://www.daraz.pk/#?");
        System.out.println("Page title is:" + driver.getTitle());

        element = driver.findElement(By.xpath("//body/div[@id='New_LzdSiteNav']/div[@id='topActionHeaderWrapper']/div[@id='topActionHeader']/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]"));
        element.click();
        System.out.println("element is found");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
    element= driver.findElement(By.xpath("//span[contains(text(),'Save More on App')]"));
    element.click();
    System.out.println("case is pass");

} catch (Exception e) {
    System.out.println("case is fail");
    throw new RuntimeException(e);
}
        element= driver.findElement(By.xpath("//input[@id='q']"));
        element.sendKeys("laptop");
        element=driver.findElement(By.xpath("//a[contains(text(),'SEARCH')]"));
        element.click();
        //validation
        try {
       Thread.sleep(4000);
        element=driver.findElement(By.partialLinkText("Acer Predator Helios 18"));
        element.click();
        System.out.println("product found");
        } catch (InterruptedException e) {
            System.out.println("product not found");
            throw new RuntimeException(e);
        }
        try {
            element= driver.findElement(By.xpath("//input[@id='q']"));
            element.sendKeys("jjjjjjjj");
            element=driver.findElement(By.xpath("//a[contains(text(),'SEARCH')]"));
            element.click();
            System.out.println("product not found case is pass");
        } catch (Exception e) {
            System.out.println("product found case is fail");
            throw new RuntimeException(e);
        }
    try {

        Thread.sleep(1000);
        element=driver.findElement(By.className("cart-icon-daraz"));
        element.click();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
try {
    Thread.sleep(10000);
    element=driver.findElement(By.xpath("//button[contains(text(),'Google')]"));
    element.click();
    System.out.println("element is google case is pass");
} catch (Exception e) {
    System.out.println("element is not google case is fail");
    throw new RuntimeException(e);
}

try {
  Thread.sleep(10000);
  driver.close();
  Thread.sleep(5000);

 element= driver.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
 element.click();
 Thread.sleep(5000);
 element= driver.findElement(By.xpath("//span[contains(text(),'Continue as Ayesha')]"));
 element.click();

 System.out.println("facebook found case is pass");
}

catch (Exception e) {
    System.out.println("facebook not found case is fail");
    throw new RuntimeException(e);
}


    }
}

