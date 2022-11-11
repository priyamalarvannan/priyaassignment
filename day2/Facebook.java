package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		  //          ( A normal click will do for this step) 
		// TODO Auto-generated method stub
//set the path
		WebDriverManager.chromedriver().setup();
		//launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//Maximise the window
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create New Account button
	//	driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("priya");
		//Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Malarvannan");
		// Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("priyamalarvannan1@gmail.com");
		//Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("priya@xyz1");
		// Handle all the three drop downs
		WebElement automateday = driver.findElement(By.id("day"));
		//create obj for select
		Select dropday=new Select(automateday); 
		dropday.selectByIndex(8);
		WebElement automatemonth = driver.findElement(By.id("month"));
		Select dropmonth=new Select(automatemonth);
		dropmonth.selectByIndex(5);
		WebElement automateyear = driver.findElement(By.id("year"));
		Select dropyear=new Select(automateyear);
		dropyear.selectByValue("1984");
		//Select the radio button "Female" 
		driver.findElement(By.id("gender-help")).click();
		
				
	}

}
