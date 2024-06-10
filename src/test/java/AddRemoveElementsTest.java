import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    //добавить два элемента, проверить количество элементов
    //затем удалить один элемент, проверить количество элементов
    @Test
    public void elementCanBeAddedAndRemoved() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton =  driver.findElement(By.cssSelector("[onclick='addElement()']"));
        addButton.click();
        addButton.click();
        List<WebElement> deleteButtons =  driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtons.size(), 2, "Кол-во кнопок на странице не совпадает");
        deleteButtons.get(1).click();
        deleteButtons =  driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtons.size(), 1, "Кол-во кнопок на странице не совпадает");
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}