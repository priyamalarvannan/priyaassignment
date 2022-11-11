package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("priyamalarvannan1@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("hello testleaf");
		WebElement attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String text=attribute.getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		//Confirm that edit field is disabled
		WebElement enable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean status=enable.isEnabled();
		if(status==false)
		{
			System.out.println("the text box is disabled");
		}
		else
		{
			System.out.println("the text box is enabled");
		}
		driver.navigate().back();
		driver.close();	

	}

}
