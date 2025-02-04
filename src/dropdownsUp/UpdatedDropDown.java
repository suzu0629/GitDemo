package dropdownsUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//60追記 checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); 

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//繰り返しさせたい
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//int i = 1;	
//		while(i < 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		
		
		//RoundTrip date変更
				//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
				System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
				//driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")
				//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
				if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
					System.out.println("its enabled");
					Assert.assertTrue(true);
				}else {
					Assert.assertTrue(false);
				}
		
		
		for(int i=1;i<5;i++ ) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
