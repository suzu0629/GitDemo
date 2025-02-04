import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//下記業がなければ、えらーになってしまう
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jhon");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Jhon@rsa.com");
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Jhon@gmail.com");
			//driver.findElement(By.xpath("//from/input[3]")).sendKeys("9864353253");
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9864353253");
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("from p")).getText());
			driver.findElement(By.xpath("//div[@class='forgot-btn-conainer']/button[1]")).click();
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			
			

		
	}

}
