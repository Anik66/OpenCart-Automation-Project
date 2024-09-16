package opencart;

import org.openqa.selenium.WebDriver; // Corrected WebDriver import
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;


public class HomePage {
	public static void main(String [] args) {
      WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//validate title should be "Swag Labs";
		String act_Title =driver.getTitle();
		
		if(act_Title.equals("Swag Labs")) {
			System.out.println(" Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		   //className locators
		   boolean islogoDisplayed =driver.findElement(By.className("bot_column")).isDisplayed();
		   System.out.println(islogoDisplayed);
		
		       //id locators
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//name locators
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				driver.findElement(By.id("login-button")).click();
				
				//linkText 
				driver.findElement(By.linkText("Sauce Labs Backpack")).click();	
				
				//name locators
				driver.findElement(By.className("inventory_details_back_button")).click();
				
				
				
				
				
				//tagname
				List<WebElement> Links=driver.findElements(By.tagName("a"));
				
				System.out.println("Total number of links:"+Links.size());
				
				
				//Total number of images
				
				
				
				List<WebElement> images=driver.findElements(By.tagName("img"));
				
				System.out.println("Total number of images:"+images.size());
				
				//cssSelector tag and id -->tag#id
				//tag is optional
				//driver.findElement(By.cssSelector("a#item_3_title_link"")).click();
				
				driver.findElement(By.cssSelector("#item_3_title_link")).click();
				
				//cssselector tag and attribute -->tag[attribute="value"]
				//tagname is optional
				//driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
				
				driver.findElement(By.cssSelector("[class='btn_primary btn_inventory']")).click();
				
				//cssSelector tag and class -->tag.class
				
				//driver.findElement(By.cssSelector("div.shopping_cart_container ")).click();
				
				//class is optional
				driver.findElement(By.cssSelector(".shopping_cart_container")).click();
			
				//xpath with single attribute
				
				driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();
				
				//xpath with id
				
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("anik");
				
				//xpath with contains
				
				driver.findElement(By.xpath("//input[contains(@placeholder, 'Last Name')]")).sendKeys("Das");
		
				//xpath with start-with
				
				driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Zip')]")).sendKeys("1971");
				
				// absolute xpath
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[2]/input[1]")).click();
				
				// partial linkText 
				driver.findElement(By.partialLinkText("ISH")).click();	
		
		//driver.quit();
	}

	
}

