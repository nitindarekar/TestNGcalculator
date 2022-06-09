package TestNGweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGopen {
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		 driver= new  ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.calculator.net/");
	}
	
	@Test(priority=0)//priority=1 enabled=false
	public void Multiplication() throws InterruptedException
	{   Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
		
	}
		
	@Test(priority=1)//priority=0 enabled=false
	public void Division() throws InterruptedException
	{   Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
		
	}
	
	@Test(priority=2)//enabled=false priority=3
	public void Addition() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)//enabled=false priority=2
	public void Subtraction() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();  
		driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click(); 
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(3000);
	}
	
    @AfterTest
	
	   public void winclose() throws InterruptedException
	
	  {
		
    	Thread.sleep(9000);
		  driver.quit();
		
	   }
	
	
}
