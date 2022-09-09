import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableAddData {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Nikhil");
		
		driver.findElement(By.id("lastName")).sendKeys("Kushwah");

		driver.findElement(By.id("userEmail")).sendKeys("nikhil.kushwah@adnet.com");
		
		driver.findElement(By.id("age")).sendKeys("28");
		
		driver.findElement(By.id("salary")).sendKeys("1000000");
		
		driver.findElement(By.id("department")).sendKeys("Software Eng");
		
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.xpath("//span[@id='edit-record-1']")).click();
		
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
		
		driver.findElement(By.id("delete-record-1")).click();
	}

}
