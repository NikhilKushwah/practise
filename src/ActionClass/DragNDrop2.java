package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragNDrop2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		
		WebElement source2=driver.findElement(By.xpath("//div[@id='dragBox']"));
		WebElement target2=driver.findElement(By.xpath("//div[@id='greedyDropBoxInner']"));
		
		act.clickAndHold(source2).moveToElement(target2).release().build().perform();

	}

}
