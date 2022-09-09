package eBay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eBayShopping {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		
		driver.findElement(By.xpath("(//a[text()='Deals'])[9]")).click();
		
		System.out.println(" line 20");
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dne-itemtile-detail'])[19]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='isCartBtn_btn']")).click();*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-deals-right-arrow'])[4]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ebayui-ellipsis-2'])[17]")).click();

	}

}
