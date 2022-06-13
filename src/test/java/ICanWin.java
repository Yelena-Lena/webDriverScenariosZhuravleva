import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://pastebin.com");

       WebElement searchInput = waitForFindElement(driver, By.id("postform-text"));
       searchInput.sendKeys("Hello from WebDriver");

       WebElement searchPasteExpiration = driver.findElement(By.id("select2-postform-expiration-container"));
       searchPasteExpiration.click();

       WebElement valueFromDropDownList = waitForFindElement(driver,By.xpath("//li[contains(text(), '10 Minutes')]"));
       valueFromDropDownList.click();

       WebElement searchPasteName = waitForFindElement(driver, By.id("postform-name"));
       searchPasteName.sendKeys("helloweb");

       WebElement searchbtn = driver.findElement(By.id("w0"));
       searchbtn.click();

       waitForFindElement(driver, By.xpath("//*[@class = 'post-view js-post-view']"));
       driver.quit();
   }

    private static WebElement waitForFindElement(WebDriver driver, By by) {
        Duration duration = Duration.ofSeconds(10);
        return new WebDriverWait(driver, duration)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
    }
