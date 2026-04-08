
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username=By.id("username");
    private By txt_password=By.id("password");
    private By btn_login=By.id("submit");
    private By btn_logout= By.linkText("Log out");

    public LoginPage(WebDriver driver){
        this.driver=driver;
        if(!driver.getTitle().contains("Test Login | Practice Test Automation")){
            throw new IllegalStateException("This is not login page. The current page is "+ driver.getCurrentUrl() + "and the title is" +driver.getTitle());
        }
    }
    public void enterUserName(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public boolean checkLogoutIsDisplayed(){
        try {
            return driver.findElement(btn_logout).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
    public void loginValidUser(String username,String  password){
        enterUserName(username);
        enterPassword(password);
        clickLogin();

    }
}

