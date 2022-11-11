package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Leaf Ground Application Assignment:
		1.http://testleaf.herokuapp.com/pages/Edit.html
		2.http://testleaf.herokuapp.com/pages/Button.html
		3.http://testleaf.herokuapp.com/pages/Link.html
		4.http://testleaf.herokuapp.com/pages/Image.html
		5.http://testleaf.herokuapp.com/pages/Dropdown.html
		6.http://testleaf.herokuapp.com/pages/radio.html
		7.http://testleaf.herokuapp.com/pages/checkbox.htm
	
	*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//are you enjoying the class
		driver.findElement(By.id("yes")).click();
		Thread.sleep(3000);
		//find default selected radio button
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		Boolean status1=unchecked.isSelected();
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		Boolean status2=checked.isSelected();
		
		if(status1==true)
		{
			System.out.println("checked box is not selected ");
		}
		else if(status2==true)
		{
			System.out.println("checked box is selected ");
			
		}
		
		//Select your age group (Only if choice wasn't selected)
		
		WebElement age = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		boolean ageselect=age.isSelected();
		if(ageselect==true)
		{
			System.out.println("age group is selected");
		}
	}
}
