package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"mail\"]/div/div/table/tbody/tr[2]/td/h2")
    private WebElement costFromEmail;

    @FindBy(xpath = "//*[@class='textarea -raw js-paste-raw']")
    private WebElement searchPasteCode;

    public emailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCostFromEmail() {
        return costFromEmail.getText();
    }
}
