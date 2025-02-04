package StreamsTutorial;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

        //1 results

       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
        collect(Collectors.toList());

       //1 result

       Assert.assertEquals(veggies.size(), filteredList.size());

       

       

	}

}
