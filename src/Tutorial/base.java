package Tutorial;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//野菜のコード
public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

		Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"}; 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/"); 
		Thread.sleep(3000); 
		addItems(driver,itemsNeeded); 

		driver.findElement(By.cssSelector("img[alt='Cart']")).click(); 
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); 
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='promoWrapper']"))); 
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.cssSelector("button.promoBtn")).click(); 
		//explicit wait 

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); 
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()); 			
	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded) 
	{ 
	int j=0; 
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name")); 

	for(int i=0;i<products.size();i++) 

	{ 
	//Brocolli - 1 Kg 
	//Brocolli,    1 kg 

	String[] name=products.get(i).getText().split("-"); 
	String formattedName=name[0].trim(); 

	List itemsNeededList = Arrays.asList(itemsNeeded); 

	if(itemsNeededList.contains(formattedName)) 

	{ 

	j++; 

	//click on Add to cart 

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); 

	if(j==itemsNeeded.length) 

	{ 

	break; 

	} 
						}
				}
		
	}

}
