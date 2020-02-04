package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class kum extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	getDriver();
	loadUrl("https://uat.mrlpay.com/login");
	BaseClass ba =new BaseClass();
	
WebElement mail=driver.findElement(By.id("username"));
WebElement pass =driver.findElement(By.id("password"));
WebElement name=driver.findElement(By.xpath("//button[@class='btn green']"));
//WebElement down =driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[3]/div[2]/div/ul"));

	ba.fill(mail,"ranjith1");
	ba.fill(pass,"RAnjith1519@");
	//ba.drop(down,"1" );
	ba.btnClick(name);
	Thread.sleep(2000);
	
	driver.quit();
	getDriver();
	loadUrl("https://uat.mrlpay.com/login");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File des =new File("C://Users//ranjith//Pictures//Saved Pictures//Sample.png");
	FileUtils.copyFile(src, des);
	
	
	
	
	
}
}
