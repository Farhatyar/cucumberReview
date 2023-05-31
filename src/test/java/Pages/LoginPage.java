package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends CommonMethods {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //* Page Factory Model
    @FindBy(id="txtUsername")
  public WebElement usernameTextBox;

    @FindBy(id="txtPassword")
   public WebElement passwordTextBox;

    @FindBy(id="btnLogin")
   public WebElement loginBtn;

    @FindBy(id="welcome")
   public WebElement welcomeIcon;

    @FindBy(xpath="//a[text()='Logout']")
   public WebElement logoutLink;
}
