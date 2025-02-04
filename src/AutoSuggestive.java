import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
			
		//Elements ←複数形に注意
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item']a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}

}
