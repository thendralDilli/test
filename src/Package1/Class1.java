package Package1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {

	
	public static void main(String[] args) {

		System.setProperty(
                "webdriver.edge.driver",
                "C:\\Users\\ldill\\Desktop\\Projects\\Testing\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        
      WebElement fromElement = driver.findElement(By.xpath("//*[@id='draggable']"));

      //WebElement to which the above object is dropped
      WebElement toElement = driver.findElement(By.xpath("//*[@id=\'droppable\']"));

      //Creating object of Actions class to build composite actions
      Actions builder = new Actions(driver);

      //Building a drag and drop action
      org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();

      //Performing the drag and drop action
      dragAndDrop.perform();
        
	}
}
