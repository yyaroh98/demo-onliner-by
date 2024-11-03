package by.onliner.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEnterLoginPage() {
        WebElement enterLoginPageWebElement = driver.findElement(By.xpath(LoginXpath.BUTTON_ENTER_LOGIN_PAGE_XPATH));
        enterLoginPageWebElement.click();
    }

    public void clickSingInButton() {
        WebElement singInButtonWebElement = driver.findElement(By.xpath(LoginXpath.SIGN_IN_BUTTON));
        singInButtonWebElement.click();
    }

    public void inputLoginAddress(String login) {
        WebElement inputLoginAddressWebElement = driver.findElement(By.xpath(LoginXpath.INPUT_LOGIN));
        inputLoginAddressWebElement.sendKeys(login);
    }

    public void inputPassword(String password) {
        WebElement inputPasswordWebElement = driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD));
        inputPasswordWebElement.sendKeys(password);
    }

    public String getErrorMessageLoginEmpty() {
        WebElement textMessage = driver.findElement(By.xpath(LoginXpath.LOGIN_FIELD_EMPTY_ERROR_MESSAGE));
        return textMessage.getText();
    }

    public String getErrorMessagePasswordField() {
        WebElement textMessage = driver.findElement(By.xpath(LoginXpath.PASSWORD_FIELD_EMPTY_ERROR_MESSAGE));
        return textMessage.getText();
    }

    public String getErrorMessageWrongCredentials() {
        WebElement textMessage = driver.findElement(By.xpath(LoginXpath.WRONG_CREDENTIALS_ERROR_MESSAGE));
        return textMessage.getText();
    }
}
