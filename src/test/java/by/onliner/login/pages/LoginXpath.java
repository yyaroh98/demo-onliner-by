package by.onliner.login.pages;

public class LoginXpath {
    public static final String BUTTON_ENTER_LOGIN_PAGE_XPATH = "/html/body/div[1]/div/div/div/header/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]";

    public static final String INPUT_LOGIN = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
    public static final String INPUT_PASSWORD = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input";
    public static final String SIGN_IN_BUTTON = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
    public static final String BUTTON_ACCEPT_COOKIES = "//a[@id='submit-button']";

    public static final String LOGIN_FIELD_EMPTY_ERROR_MESSAGE = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    public static final String PASSWORD_FIELD_EMPTY_ERROR_MESSAGE = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    public static final String WRONG_CREDENTIALS_ERROR_MESSAGE = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/div";
}
