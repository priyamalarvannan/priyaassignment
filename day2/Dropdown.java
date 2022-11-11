package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
		public static void main(String[] args) throws InterruptedException
		{
			
					
					WebDriverManager.edgedriver().setup();
					EdgeDriver driver=new EdgeDriver();
					driver.manage().window().maximize();
					driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
					//select training program using index
					WebElement drop = driver.findElement(By.id("dropdown1"));
					Select o1=new Select(drop);
					o1.selectByIndex(2);
					//select training program using text
					WebElement drop1 = driver.findElement(By.name("dropdown2"));
					Select o2=new Select(drop1);
					o2.selectByVisibleText("Selenium");
					//select training program using value
					WebElement drop2 = driver.findElement(By.id("dropdown3"));
					Select o3=new Select(drop2);
					o3.selectByValue("4");
					//get the number of drop down options
					//*[@id="contentblock"]/section/div[4]/select+
					WebElement drop3 = driver.findElement(By.xpath("//select[@class='dropdown']"));
					Select o4=new Select(drop3);
					int options=o4.getOptions().size();
					System.out.println("drop down options" +options);
					// you can also use sendkeys to select
					driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select/option[2]")).click();
					Thread.sleep(3000);
					//select your programs
					driver.findElement(By.xpath("//option[text()='Select your programs']")).click();
					Thread.sleep(4000);
					//driver.close();
	
		
		}
		
		
		
}