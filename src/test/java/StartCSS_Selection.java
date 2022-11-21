import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
    public void testDialogLogin() {
        System.out.println("Dialog of Login and Pass");
        WebElement el = wd.findElement(By.cssSelector("div.login_login__3EHKB"));
        System.out.println(el.getLocation());
    }
    @Test

    public void testFieldPassword() {
        System.out.println("Test Field Password");
        List<WebElement> input = wd.findElements(By.tagName("input"));
        System.out.println(input.size());
        WebElement element = wd.findElement(By.cssSelector("[placeholder$='Password']"));
        System.out.println(element.isDisplayed());
    }

    @AfterMethod
    public void postCondition() {
        wd.close();
        //  wd.quit();
    }
}







