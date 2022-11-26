import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XPathSelect {

    WebDriver wd;

    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testHw4() {
        List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4)"));
        String text = "";
        for (WebElement e : row4) {
            System.out.println("The row 4 content is "+e.getText());
            text = e.getText();
            if (text.contains("Mexico")) ;
            assert (text.contains("Mexico"));
        }
        System.out.println(text.contains("Mexico"));


        List<WebElement> amountRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Amount of Rows = "+amountRows.size());
        Assert.assertEquals(amountRows.size(),9);

        List<WebElement> amountCols = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(amountCols.size(),3);
        System.out.println("Amount of Cols = "+amountCols.size());

        List<WebElement> row3 = wd.findElements(By.cssSelector("#customers tr:nth-child(3)"));
        for (WebElement e : row3) {
            System.out.println("The row 3 content is "+e.getText());
        }

        List<WebElement> lastCol = wd.findElements(By.cssSelector("#customers td:last-child"));
        for (WebElement e : lastCol) {
            System.out.println(e.getText());


        }
        List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
        for(int i=0; i<tr.size();i++){
            if(tr.get(i).getText().contains("Philip Cramer")){
                System.out.println("The row of Philip Cramer is "+(i+1));
            }
        }
    }
    @AfterMethod
    public void tearDown() {
         wd.close();
        //  wd.quit();
    }
}