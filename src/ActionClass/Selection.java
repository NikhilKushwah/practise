package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable");
		
		driver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();
		driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']")).click();

	}

}
