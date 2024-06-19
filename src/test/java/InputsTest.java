import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void successfulDigitalInputPlus() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type = 'number']")).click();
        driver.findElement(By.cssSelector("[type = 'number']")).sendKeys(Keys.ARROW_UP);
        String text = driver.findElement(By.cssSelector("[type = 'number']")).getAttribute("value");
        assertEquals(text, "1", "Неправильный ввод данных в инпуте");
    }

    @Test
    public void successfulDigitalInputMinus() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type = 'number']")).click();
        driver.findElement(By.cssSelector("[type = 'number']")).sendKeys(Keys.ARROW_DOWN);
        String text = driver.findElement(By.cssSelector("[type = 'number']")).getAttribute("value");
        assertEquals(text, "-1", "Неправильный ввод данных в инпуте");
    }

    @Test
    public void successfulKeyboardInput() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type = 'number']")).click();
        driver.findElement(By.cssSelector("[type = 'number']")).sendKeys("123");
        String text = driver.findElement(By.cssSelector("[type = 'number']")).getAttribute("value");
        assertEquals(text, "123", "Неправильный ввод данных в инпуте");
    }

    @Test
    public void successfulKeyboardInputLetter() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type = 'number']")).click();
        driver.findElement(By.cssSelector("[type = 'number']")).sendKeys("e");
        String text = driver.findElement(By.cssSelector("[type = 'number']")).getAttribute("value");
        assertEquals(text, "e", "Неправильный ввод данных в инпуте");
    }

    @Test
    public void letterEntryIsNotPossible() {

        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type = 'number']")).click();
        driver.findElement(By.cssSelector("[type = 'number']")).sendKeys("rgrhytgr");
        String text = driver.findElement(By.cssSelector("[type = 'number']")).getAttribute("value");
        assertEquals(text, "rgrhytgr", "Неправильный ввод данных в инпуте");
    }
}
