package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	private static final char[] Title = null;

	public static void main(String[] args) throws InterruptedException {
				
	/*	Leaf Ground Application Assignment:
		1.http://testleaf.herokuapp.com/pages/Edit.html
		2.http://testleaf.herokuapp.com/pages/Button.html
		3.http://testleaf.herokuapp.com/pages/Link.html*/

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		//Find where am supposed to go without clicking me?
		WebElement attribute = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String text=attribute.getAttribute("href");
		System.out.println(text);
		//Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		Thread.sleep(3000);
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.contains("404"))
		{
			System.out.println("the link is broken");
		}
		else
		{
			System.out.println("the link is valid one");
		}
		driver.navigate().back();
		//Go to Home Page (Interact with same link name)
		List<WebElement> duplicate = driver.findElements(By.xpath("//a[text()='Go to Home Page']"));
		int samename=duplicate.size();
		if(samename>1)
		{
			System.out.println("go to duplicate home page"+samename);
		}
		else
		{
			System.out.println("go to home page");
		}
		// how many links are available in that page
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int linkcount=totallinks.size();
		System.out.println("total links"+linkcount);
		//driver.close();
	}

}
