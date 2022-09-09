package AlertsBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Text");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
