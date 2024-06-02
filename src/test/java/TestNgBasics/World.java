package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class World {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://44.220.155.30:8080/qaenv/");
        System.out.println(driver.getCurrentUrl());
        
        String expmsg = "Hello, World!";
        String actmsg = driver.findElement(By.xpath("/html/body")).getText();
        
        System.out.println("Expected Message : " + expmsg);
        System.out.println("Actual Message   : " + actmsg);
        
        if (expmsg.equals(actmsg)) {
            System.out.println("Scenario 1 testing passed");
        } else {
            System.out.println("Scenario 1 testing sFailed");
        }
        
        driver.close();
    }
}