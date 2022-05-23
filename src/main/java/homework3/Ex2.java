package homework3;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex2 extends TestBase{

    @Test
    public void creatingAccount() {

        driver.get("http://146.59.32.4/index.php?controller=authentication&create_account=1");

        driver.findElement(By.xpath("//span/input[@name='id_gender'][@value='2']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monika");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wieczorek");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(generateEmail(15));

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("10/10/1990");

        driver.findElement(By.xpath("//input[@name='customer_privacy']")).click();

        driver.findElement(By.xpath("//input[@name='psgdpr']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-primary form-control-submit float-xs-right']")).click();

        WebElement accountName= driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));

        Assert.assertEquals(accountName.getText(), "Monika Wieczorek");

        System.out.println("Imię i nazwisko użytkownika to: " + accountName.getText());

    }
    //tę metodę znalazłam w internecie, pewnie można to zrobić w jakiś inny sposób, ale działa ;)
    public String generateEmail(int length) {

        String allowedChars = "abcdefghijklmnoprqstuwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@testdata.com";
        return email;
    }
}

