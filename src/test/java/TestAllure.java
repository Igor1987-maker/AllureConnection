import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(ListenerNG.class)
public class TestAllure {
   protected static WebDriver wd;


    @Test
    public void test1(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.google.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = wd.findElement(By.className("lnXdpd")).getAttribute("alt");
        System.out.println(">>>>>>>>>>>>>>>>> " +text);
        Assert.assertTrue(text.equalsIgnoreCase("goooooogle"));
   //     System.out.println("1===========" +Thread.currentThread().getId());


    }



}
