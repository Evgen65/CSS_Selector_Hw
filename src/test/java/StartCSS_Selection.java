import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartCSS_Selection {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void testLogin() {
        System.out.println("Test Login");
        WebElement a = wd.findElement(By.tagName("a"));
        System.out.println(a.getLocation());
        WebElement element = wd.findElement(By.cssSelector(".active"));
        System.out.println(element.isEnabled());


    }

    @Test
    public void testEmail() {

    }

    @Test
    public void testName() {

    }

    @AfterMethod
    public void postCondition() {
          wd.close();
      //  wd.quit();
    }
}







