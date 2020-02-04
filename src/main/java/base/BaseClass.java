package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver getDriver ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjith\\workspace\\ranjith\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String Url) 
	{
	driver.get(Url);
}
public void fill(WebElement element,String name)
{
	element.sendKeys(name);
}
public void btnClick (WebElement element)
{
	element.click();
}

public void drop(Select s,String text)
{
s.selectByVisibleText(text);

	
}
}
