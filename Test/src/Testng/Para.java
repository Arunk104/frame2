package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para{
	
private static WebDriver driver;
 WebDriverWait wait;
	//http://apps.qaplanet.in/qahrm/login.php
 

 @Test
	@Parameters({"browser","Strurl","Username","Password"})

	
	public void para(String browser,String Strurl,String Username,String Password){

        try

        {

               if(browser.equalsIgnoreCase("Firefox"))

               {
            	   System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
                     driver = new FirefoxDriver();

               }

               if(browser.equalsIgnoreCase("Chrome"))

               {

                     //Location of the chromedriver.exe file stored in your machine

                      System.setProperty("webdriver.chrome.driver","C:\\Users\\QAP37\\Downloads\\chromedriver.exe");

                     driver = new ChromeDriver();

               }

        }
               catch (WebDriverException e)

               {

                      System.out.println("Browser not found" +e.getMessage());

               }
           
		driver.get(Strurl);
		
		
		
		wait=new WebDriverWait(driver, 30);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUserName")).sendKeys(Username);
		
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
		
		driver.findElement(By.name("Submit")).click();
		
		driver.close();
		
		}
	

	
}
