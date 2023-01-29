package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRame {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(2000);
		//WebElement pack = driver.findElement(By.xpath("//div[@class='leftTop']"));
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
		String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String text2 = driver.findElement(By.xpath("//a[text()='Actions']")).getText();
		System.out.println(text2);
	}

}
