package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "identifierId") public WebElement emailField;

    @FindBy(id = "identifierNext") public WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input") public WebElement passw;

    @FindBy(id = "passwordNext") public WebElement passNext;

    public void naviagteToUrl(String url) {
        driver.navigate().to(url);
    }

    public void enterEmailId(String email) {
        emailField.sendKeys(email);
        System.out.println("Entered emailId");
        nextButton.click();
    }

    public void enterPassword(String pass){
        passw.sendKeys(pass);
        System.out.println("Entered password");
        passNext.click();
    }

}
