package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usercreation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		driver.findElement(By.xpath("//button[@id='newUser']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Kushwah");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nikhil");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//button[@id='register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='gotologin']")).click();

	}

}
