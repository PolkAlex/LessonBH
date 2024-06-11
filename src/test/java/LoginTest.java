import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String userName = "tomsmith";
    String password = "SuperSecretPassword!";

    //успешный логин
    @Test
    public void successLogin() {

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String flashSuccessLogin = driver.findElement(By.cssSelector("[class='flash success']")).getText();

        assertEquals(flashSuccessLogin,
                "You logged into a secure area!\n" + "×",
                "Не удалось залогиниться");
    }

    //неправильный юзернейм
    @Test
    public void notCorrectUserName() {

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("userName");
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String flashSuccessLogin = driver.findElement(By.cssSelector("[class='flash error']")).getText();

        assertEquals(flashSuccessLogin,
                "Your username is invalid!\n" + "×",
                "Сообщение об ошибке при неуспешном логине не корректное");
    }

    //неправильный пароль
    @Test
    public void notCorrectPassword() {

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String flashSuccessLogin = driver.findElement(By.cssSelector("[class='flash error']")).getText();

        assertEquals(flashSuccessLogin,
                "Your password is invalid!\n" + "×",
                "Сообщение об ошибке при неуспешном логине не корректное");
    }
}
