package Temp_files.Temp_files;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;
public class TEMP {
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
	 DesktopOptions option=new DesktopOptions();
	 option.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories\\Calculator.lnk");
	 	WiniumDriver d=new WiniumDriver(new URL("http://localhost:9999"),option);
	 	//Thread.sleep(6000);
	 	d.findElement(By.name("7")).click();	
	 	d.findElement(By.id("93")).click();
	 	d.findElement(By.name("8")).click();
	 	d.findElement(By.name("Equals")).click();
	 	String output=d.findElement(By.id("150")).getAttribute("Name");
	 	System.out.println("result is " +output);
	 	d.findElement(By.name("Close")).click();
	 	
	 	d.get("https://incessanttechnologies.greythr.com");
	 	Thread.sleep(30000);
	 	d.findElement(By.xpath("//*[@id='j_username']")).sendKeys("C069");
	 	d.findElement(By.name("j_password")).sendKeys("9703742792@");
	 	d.findElement(By.id("login-button")).click();
	 	Thread.sleep(10000);
	 	d.findElement(By.linkText("Sign Out")).click();
	 	d.close();
	 
	}
}