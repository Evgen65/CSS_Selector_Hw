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
    public void testHw4Task2() {
      //  List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4)"));
        List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4)"));
        String text = "";
        for (WebElement e : row4) {
            System.out.println("The row 4 content is " + e.getText());
            text = e.getText();
            if (text.contains("Mexico")) ;
            assert (text.contains("Mexico"));
        }
        System.out.println(text.contains("Mexico"));
    }
    @Test
    public void testHw5Task1() {
        List<WebElement> row4 = wd.findElements(By.xpath("//*[@id='customers']//tr[4]"));
        String text = "";
        for (WebElement e : row4) {
            System.out.println("The row 4 content in Hw5 is " + e.getText());
            text = e.getText();
            if (text.contains("Mexico")) System.out.println("Yes");
            assert (text.contains("Mexico"));
        }
        System.out.println(text.contains("Mexico")) ;
    }

    @Test
    public void testHw4Task3() {
        List<WebElement> amountRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Amount of Rows = " + amountRows.size());
        Assert.assertEquals(amountRows.size(), 9);
        System.out.println("===================");
        List<WebElement> rowXpath = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        System.out.println("Amount of RowXpath="+ rowXpath.size());
        System.out.println("===================");
           List<WebElement> amountCols = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(amountCols.size(), 3);
        System.out.println("Amount of Cols = " + amountCols.size());
        System.out.println("===================");
        List<WebElement> colsXpath = wd.findElements(By.xpath("//table[1]/tbody[1]/tr/th"));
        Assert.assertEquals(colsXpath.size(), 3);
        System.out.println("Amount of ColsXpath = " + colsXpath.size());
                System.out.println("===================");
        List<WebElement> row3 = wd.findElements(By.cssSelector("#customers tr:nth-child(3)"));
        for (WebElement e : row3) {
            System.out.println("The row 3 content is " + e.getText());
        }
        System.out.println("===================");
        List<WebElement> rowXPath3 = wd.findElements(By.xpath("//*[@id='customers']//tr[3]"));
        for (WebElement e : rowXPath3) {
            System.out.println("The row 3 content in Hw5 is " + e.getText());
        }
        WebElement row3Xpath = wd.findElement(By.xpath("//*[@id='customers']//tr[3]"));
        System.out.println("The row 3 content in Hw5 is " + row3Xpath.getText());
        System.out.println("===================");
        List<WebElement> lastCol = wd.findElements(By.cssSelector("#customers td:last-child"));
        for (WebElement e : lastCol) {
            System.out.println(e.getText());
        }
        System.out.println("===================");
        List<WebElement> lastColXpath = wd.findElements(By.xpath("//*[@id='customers']//td[last()]"));
        for (WebElement e : lastColXpath) {
            System.out.println(e.getText());
        }
        System.out.println("===================");
        List<WebElement> lastColXpath2 = wd.findElements(By.xpath("//*[@id='main']//td[3]"));
        for(WebElement e :lastColXpath2){
            System.out.println(e.getText());
        }
               System.out.println("===================");
        List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
        for (int i = 0; i < tr.size(); i++) {
            if (tr.get(i).getText().contains("Philip Cramer")) {
                System.out.println("The row of Philip Cramer is " + (i + 1));
            }
        }
        System.out.println("===================");
        List<WebElement> trXpath = wd.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        for (int i = 0; i < trXpath.size(); i++) {
            if (trXpath.get(i).getText().contains("Philip Cramer")) {
                System.out.println("The row number of Hw5 of Philip Cramer is " + (i + 1));
            }
        }
        System.out.println("===================");
        List<WebElement> trXpath2 = wd.findElements(By.xpath("//*[@id='main']//tr"));
        for (int i = 0; i < trXpath2.size(); i++) {
            if (trXpath2.get(i).getText().contains("Philip Cramer")) {
                System.out.println("The row number of Hw5 of Philip Cramer in trXpath2  is " + (i + 1));
            }
        }

    }

          @AfterMethod
        public void tearDown () {
            wd.close();
            //  wd.quit();
        }
    }
