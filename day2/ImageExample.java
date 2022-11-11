package week2.day2;

import java.awt.Desktop.Action;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ImageExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		//Click on this image to go home page
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Am I Broken Image?
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//naturalWidth
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("the image is broken");
		}
		else
		{
			System.out.println("the image is not broken");
		}
	//click me using keyboard or mouse
		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

	}
	
}