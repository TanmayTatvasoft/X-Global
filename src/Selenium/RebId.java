package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RebId {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles under 20000",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		/*driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		String price = driver.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']/descendant::div)[1]")).getText();
		System.out.println(price);*/
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList(allwindows);
		for(String title:ar) {
			String Titles = driver.switchTo().window(title).getTitle();
			System.out.println(Titles);
			if(Titles.equals("SAMSUNG Galaxy F23 5G ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com")|| Titles.equals("Mobiles Under 20000- Buy Products Online at Best Price in India - All Categories | Flipkart.com")) {
				driver.close();
			}
		}


	}

}
