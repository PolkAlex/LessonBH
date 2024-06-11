import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTest extends BaseTest {

    List<WebElement> checkBoxes;

    @Test
    public void checkedCheckBox2() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkBoxes = driver.findElements(By.cssSelector("[type='checkbox']"));
        assertTrue(checkBoxes.get(1).isSelected(), "Чекбокс2 не выбран");
    }

    @Test
    public void checkedCheckBox1() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkBoxes = driver.findElements(By.cssSelector("[type='checkbox']"));
        assertFalse(checkBoxes.get(0).isSelected(), "Чекбокс1 выбран");
    }

    @Test
    public void checkedAllCheckBoxes() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkBoxes = driver.findElements(By.cssSelector("[type='checkbox']"));
        checkBoxes.get(0).click();
        assertTrue(checkBoxes.get(0).isSelected(), "Чекбокс1 не выбран");
        assertTrue(checkBoxes.get(1).isSelected(), "Чекбокс2 не выбран");
    }

    @Test
    public void unCheckedAllCheckBoxes() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkBoxes = driver.findElements(By.cssSelector("[type='checkbox']"));
        checkBoxes.get(1).click();
        assertFalse(checkBoxes.get(0).isSelected(), "Чекбокс1 выбран");
        assertFalse(checkBoxes.get(1).isSelected(), "Чекбокс2 выбран");
    }
}
