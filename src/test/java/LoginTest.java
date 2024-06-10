import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String userName = "tomsmith";
    String password = "SuperSecretPassword!";
    @Test
    public void login() {

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String flashSuccessLogin = driver.findElement(By.cssSelector("[class='flash success']")).getText();

        assertEquals(flashSuccessLogin,
                "You logged into a secure area!\n" + "×",
                "Не удалось залогиниться");
    }
}
