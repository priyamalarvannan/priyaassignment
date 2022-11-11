package week2.day2;


import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	private static Dimension size;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		//find the position of the element(x,y)
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("the xy posotion is"+location);
		//Find button color
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("background color of the button is" +color);
		//find size
		WebElement size = driver.findElement(By.id("size"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("the height:" +height   +  "width is :" +width);
		driver.close();
		
		
	}

}
