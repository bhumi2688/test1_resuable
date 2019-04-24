package pqr;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

    public static void clickElementBy(By by) {
        driver.findElement(by).click();

    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);


    }

    public static void selectTextByValue(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);

    }

    public static void waitForElementDisplay(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by) );

    }
}




