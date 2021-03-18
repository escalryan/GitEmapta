package Emapta.Exam;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTest extends Exam{

	@BeforeTest
	public void PageTest1() throws IOException
	{
		driver=EmaptaExam();
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void validation ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p/a"));
		String anrchorexpected = "government stimulus packages";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("government stimulus packages is a expected");

	}

	@Test
	public void validation1 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[2]/a"));
		String anrchorexpected = "Zombie companies";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("Zombie companies is a expected");
	}
	
	@Test
	public void validation2 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[4]/a"));
		String anrchorexpected = "Registering on the PPSR";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("Registering on the PPSR is a expected");
	}
	
	
	@Test
	public void validation3 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[5]/a"));
		String anrchorexpected = "temporary restructuring relief";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("temporary restructuring relief is a expected");
	}
	
	@Test
	public void validation4 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[8]/a"));
		String anrchorexpected = "Ledlin Lawyers";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("Ledlin Lawyers is a expected");
	}
	
	@Test
	public void validation5 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[12]/a"));
		String anrchorexpected = "free PPSA LEDcheck";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("free PPSA LEDcheck is a expected");
	}
	
	@Test
	public void validation6 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[16]/a"));
		String anrchorexpected = "this whitepaper";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("this whitepaper is a expected");
		}
	
	@Test
	public void validation7 ()
	{
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
		WebElement anchor = driver.findElement(By.xpath("//div[@class='entry-content']/p[17]/a"));
		String anrchorexpected = "PPSRLogic";
		Assert.assertEquals(anrchorexpected, anchor.getText());
		System.out.println("PPSRLogic is a expected");
	}
}
