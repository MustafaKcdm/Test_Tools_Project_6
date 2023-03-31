package Pages;

import Utilities.GrWD;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GrWD.getDriver(), Duration.ofSeconds(6));

    public void inputKeys(WebElement element, String text){
        waitUntilVisible(element);
        scrollElement(element);
        element.clear();
        element.sendKeys(text);


    }

    public void  clickFunction(WebElement element){
      waitUntilClickable(element);
      scrollElement(element);
      element.click();

    }
    public void scrollElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GrWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.isTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"Text Bulunamadı");
        new Actions(GrWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }
}
