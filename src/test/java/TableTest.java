import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.crypto.spec.PSource;
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
     //   List<WebElement> elements = wd.findElements(By.cssSelector("#customers tr:nth-child(4) "));
      //  System.out.println(elements.size());
        // check if there is text "Mexico" there
        List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4) tr"));
        String text= "";
        for (WebElement e: row4){
            System.out.println(e.getText());
            text=e.getText();
            if(text.contains("Mexico"));
          //  assert(text.contains("Mexico"));

        }
        System.out.println(text.contains("Mexico"));

        List<WebElement> lastCol = wd.findElements(By.cssSelector("#customers td:last-child"));
        for(WebElement e: lastCol){
            System.out.println(e.getText());
        }
        List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
        int count=0;
        for(int i=0; i<tr.size();i++){

            if(tr.get(i).getText().contains("Philip Cramer")){
                System.out.println(i+1);
            }
        }



    }

    @AfterMethod
    public void tearDown(){
      //  wd.close();
        //  wd.quit();
    }






}
