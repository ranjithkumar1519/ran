package kumar;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ran {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjith\\workspace\\ranjith\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://uat.mrlpay.com/");
		
		driver.manage().window().maximize();
		
	WebElement mail= driver .findElement(By.id("username"));
	mail.sendKeys("ranjith1");
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("RAnjith1519@");
	
	WebElement btn=driver.findElement(By.xpath("//button[@class='btn green']"));
	btn.click();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
//	
//	Thread.sleep(2000);
	
//	WebElement mov =driver.findElement(By.xpath("//html//body//div[3]//div[4]//div[1]//div//ul//li[12]//a//span[1]"));
//	Actions acc=new Actions (driver);
//	acc.moveToElement(mov).perform();
//	Thread.sleep(2000);
//	
//	
//	WebElement mov1=driver.findElement(By.xpath("//html//body//div[3]//div[4]//div[1]//div//ul//li[12]//ul//li[2]//a//span[1]"));
//	acc.moveToElement(mov1).perform();
//	Thread.sleep(2000);
//	WebElement mov2=driver.findElement(By.xpath("//html//body//div[3]//div[4]//div[1]//div//ul//li[12]//ul//li[2]//ul//li[3]//a//span[1]"));
//	acc.moveToElement(mov2).perform();
//	mov2.click();

	WebElement sou=driver.findElement(By.xpath("//html//body//div[3]//div[4]//div[2]//div//div[2]//div//div[3]//div[2]//div[1]//div[1]//div[2]//div//div[2]//button"));
	sou.click();
	Thread.sleep(2000);
//
//Robot r = new Robot();
//for(int i=0;i<25;i++){
//	
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/form/div[1]/div[7]/div/textarea")).sendKeys("0001210M");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/form/div[2]/div/div/button[1]")).click();
	Thread.sleep(2000);
	//WebElement sco=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[3]/div[1]/div"));
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000)");
	WebElement param=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/table/tbody/tr/td[17]/a[5]"));
	param.click();
	
	
	
	
	
	
	
	
}

	
}

		
	

