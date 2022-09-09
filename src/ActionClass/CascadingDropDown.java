package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CascadingDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/country-state-city-example-cascading-jquery-dependent-dropdown/");
		
	//	List <WebElement> country=driver.findElements(By.xpath("//select[@id='country-list']/option"));
		
		WebElement country= driver.findElement(By.xpath("//select[@id='country-list']"));
		Select Sl=new Select(country);
	//	Sl.getOptions().size();
		Sl.selectByValue("3");
		Thread.sleep(2000);
	
		
		WebElement state= driver.findElement(By.xpath("//select[@id='state-list']"));
		Select sl=new Select(state);
		//sl.getOptions().size();
		sl.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//select[@id='city-list']"));
		Select sL=new Select(city);
		sL.selectByValue("2");
	

	}

}
