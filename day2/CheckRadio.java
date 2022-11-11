package week2.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRadio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Select the languages that you know?
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]")).click();
		Thread.sleep(3000);
		
		//Confirm Selenium is checked
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean staus=confirm.isSelected();
		if(staus==true)
		{
			System.out.println("Selenium is selected");
		}
		else
		{
			System.out.println("Selenium is not selected");
		}
//		DeSelect only checked
		WebElement deselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if(deselect.isSelected())
		{
			deselect.click();
		}
	
		WebElement select = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if(select.isSelected())
				{
			select.click();
				}
	
//		Select all below checkboxes

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]")).click();
	Thread.sleep(3000);
	driver.close();
	}
	
	
	

}
