package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	
	@BeforeMethod
	public void beforerun() {
		System.out.println("Beforerun");
	
	}
	@Test
	public void one() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("HYD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("MAA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[1]/p/span[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Sun Oct 08 2023']//div[@class='dateInnerCell']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Fri Oct 13 2023']//p[contains(text(),'13')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/span")).click();
		Thread.sleep(3000);
		
		String expectedHeading = "Flights from Hyderabad to Chennai, and back";
		
		String heading = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/p/span")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading)) {
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	}else {
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
	}
		

		System.out.println("search page is displayed as expected");
		driver.close();	
	}
	@AfterMethod
	public void Afterrun() {
		System.out.println("Afterrun");
	}
	
		
	}

	
	


