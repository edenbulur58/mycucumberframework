package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCLoginPage {
    public FHCLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement logiInButton;


}
