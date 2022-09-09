package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class reziableFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/resizable");
		
		//driver.switchTo().frame(0);
		WebElement resizable=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
		WebElement resizable2=driver.findElement(By.xpath("//div[@id='resizable']//span[@class='react-resizable-handle react-resizable-handle-se']"));

		Actions act = new Actions(driver);
		act.moveToElement(resizable).dragAndDropBy(resizable, 100, 150).build().perform();
		act.moveToElement(resizable2).dragAndDropBy(resizable2, 100, 150).build().perform();
		Thread.sleep(3000);
	}

}
