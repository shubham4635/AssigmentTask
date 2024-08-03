import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Task1_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();                    // launching the Chrome Browser

        //Task 1
driver.navigate().to("https://www.fitpeo.com/");            // launching the Url
driver.manage().window().maximize();                            // maximize the Window

        //task 2
        driver.navigate().to("https://fitpeo.com/revenue-calculator");  // navigate to revenue-calculator Page
        JavascriptExecutor js=(JavascriptExecutor) driver;                      // Exuting the javascript
        Thread.sleep(2000);

        //Task 3
        js.executeScript("window.scrollBy(100,500)");                   // Scroll up the page

        //task 4
Actions actions=new Actions(driver);                    //Creating action class object
        WebElement slider= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));   //decarling the webelemnet
        Thread.sleep(2000);

        actions.dragAndDropBy(slider,94,5).perform();           // Moving the slider
        js.executeScript("window.scrollBy(100,600)");

        //task 5
        WebElement textField= driver.findElement(By.cssSelector("input[type='number']")); // Creating the Textbox Webelement


        Thread.sleep(3000);
        textField.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        textField.sendKeys(Keys.DELETE); // delete the selected text
        textField.sendKeys("560");              // Sending the value
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(100,700)");
Thread.sleep(2000);
   WebElement block1 =     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input"));          //Selecting the Box
        Thread.sleep(2000);
        WebElement block2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input"));

        Thread.sleep(2000);
        WebElement block3 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input"));

  Thread.sleep(3000);
   WebElement block4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input"));

   actions.click(block1).build().perform();
actions.click(block2).build().perform();
        actions.click(block3).build().perform();
        actions.click(block4).build().perform();
String Amount =driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/p[4]/p")).getAttribute("value");
if(Amount == "110700"){
    System.out.println("Total Recurring Reimbursement for all Patients Per Month: shows the value $110700.");
}else {
    System.out.println("Total Recurring Reimbursement for all Patients Per Month: shows the value "+Amount);
}

        // Close the browser
        //driver.quit();
    }
}
