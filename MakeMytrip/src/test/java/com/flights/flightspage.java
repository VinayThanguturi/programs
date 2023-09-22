package com.flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightspage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		close.click();
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
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
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		/*driver.findElement(By.xpath("//p[@class='font16 blackText latoBold appendRight30']//span[contains(text(),'Oct')]")).click();*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Tue Nov 14 2023']//p[contains(text(),'14')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Nov 18 2023']//div[@class='dateInnerCell']")).click();
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
		
			
	}
	
	

}
