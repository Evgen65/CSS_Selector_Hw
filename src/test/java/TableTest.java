import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void testCW(){
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
        String text = canada.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Canada");
    }
    @Test
    public void tableHW(){
        // get row 4 content
        List<WebElement> elements = wd.findElements(By.cssSelector("#customers tr:nth-child(4) n"));
        System.out.println(elements.size());
        // check if there is text "Mexico" there
    }

    @AfterMethod
    public void tearDown(){
        wd.close();
        //  wd.quit();
    }






}
