package pageObjectForPastebin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class pastebinPastePage {

  private WebDriver driver;
  @FindBy(xpath = "//div[@class = 'left']/a")
  private WebElement searchHighlightedCode;

  @FindBy(xpath = "//*[@class='textarea -raw js-paste-raw']")
  private WebElement searchPasteCode;

  public pastebinPastePage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getHighlightedCode() {
        return searchHighlightedCode.getText();
    }

    public String getPasteCode() {
        return searchPasteCode.getText();
    }

 }
