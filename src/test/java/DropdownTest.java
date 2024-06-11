import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {

    @Test
    public void selectedDefaultOption() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        String defaultOption = driver.findElement(By.cssSelector("[disabled = 'disabled']")).getText();
        assertEquals(defaultOption, "Please select an option", "Не выбрана дефолтная опция");
    }

    @Test
    public void selectedFirstOption() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        assertEquals(select.getOptions().get(1).getText(), "Option 1", "Выбрана не первая опция");
    }

    @Test
    public void selectedSecondOption() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        assertEquals(select.getOptions().get(2).getText(), "Option 2", "Выбрана не вторая опция");
    }

    @Test
    public void checkAllOptions() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        assertEquals(select.getOptions().size(), 3, "Количество опций в дропдауне неправильное");
    }
}
