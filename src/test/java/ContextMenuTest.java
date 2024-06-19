import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContextMenuTest extends BaseTest {

    @Test
    public void successCallContextMenu() {

        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement contextButton = driver.findElement(By.id("hot-spot"));
        new Actions(driver).contextClick(contextButton).perform();
        String contextWindow = driver.switchTo().alert().getText();

        assertEquals(contextWindow, "You selected a context menu", "Аллерт не появился " +
                "либо текст аллерта неправильный");
    }
}
