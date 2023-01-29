package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis= new FileInputStream("C:\\Users\\tanma\\OneDrive\\Desktop\\Tanmay.xlsx");
	  Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  String UN = sh.getRow(0).getCell(0).getStringCellValue();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	  String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  String Exp = sh.getRow(0).getCell(2).getStringCellValue();
	  String act = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
      if(act.equals(Exp)) {
   	   System.out.println("tc pass oh yaaa");
   	   
      }
      else {
   	   System.out.println("TC fail");
      }
	}

}
