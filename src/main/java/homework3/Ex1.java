package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ex1 extends TestBase{


    @Test
    public void pricesCheck(){

        driver.get("https://automationpractice.com/index.php");

        WebElement popularOption = driver.findElement(By.xpath("//*[@id='home-page-tabs']/li[1]/a"));

        if(popularOption.isEnabled()){
            System.out.println("Wybrana opcja to 'Popular'");
        }else{
            System.out.println("Wybrana opcja jest inna niż 'Popular'");
            popularOption.click();
        }

        List<WebElement> prices = driver.findElements(By.xpath("//*[@id='homefeatured']/li/div/div/div/span[@itemprop='price']"));

        Assert.assertTrue(prices.size() == 7);
        System.out.println("Ilość cen produktów na stronie: " + prices.size());

    }
}
