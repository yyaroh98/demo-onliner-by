package by.onliner.login.tests;

import by.onliner.login.pages.LoginMessage;
import by.onliner.login.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    private static final String LOGIN = "test1@test.com";
    private static final String PASSWORD = "7788#_@";
    private LoginPage loginPage;

    @BeforeEach
    void setUpLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.clickButtonEnterLoginPage();
    }

    @Test
    @DisplayName("Тест: не указан логин и пароль")
    public void testSignInWithEmptyLoginAndPassword() {
        loginPage.clickSingInButton();

        Assertions.assertEquals(LoginMessage.EMPTY_NIK_OR_EMAIL, loginPage.getErrorMessageLoginEmpty());
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getErrorMessagePasswordField());
    }

    @Test
    @DisplayName("Тест: не указан пароль")
    public void testSignInWithEmptyPassword() {
        loginPage.inputLoginAddress(LOGIN);
        loginPage.clickSingInButton();

        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getErrorMessagePasswordField());
    }

    @Test
    @DisplayName("Тест: не указан логин")
    public void testSignInWithEmptyLogin() {
        loginPage.inputPassword(PASSWORD);
        loginPage.clickSingInButton();

        Assertions.assertEquals(LoginMessage.EMPTY_NIK_OR_EMAIL, loginPage.getErrorMessageLoginEmpty());
    }

    @Test
    @DisplayName("Тест: неверные учетные данные")
    public void testSignInWithLoginAndPassword() {
        loginPage.inputLoginAddress(LOGIN);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickSingInButton();

        Assertions.assertEquals(LoginMessage.WRONG_CREDENTIALS, loginPage.getErrorMessageWrongCredentials());
    }
}
