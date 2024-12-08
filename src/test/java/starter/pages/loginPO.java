package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class loginPO extends PageObject {




    public static By InputUserName = By.xpath("//input[@name='username']");

    public static By InputPassword = By.xpath("//input[@name='password']");

    public static By btnLogin = By.xpath("//button[@type='submit']");

    public static By TextDashboard = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]");

}
