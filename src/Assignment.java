import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mljuser.PCN4394.000\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		String text = "Rahul";
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		driver.findElement(By.id("name")).sendKeys(text); 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click(); 
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click(); 

		System.out.println(driver.switchTo().alert().getText()); 
		//dismiss キャンセル
		driver.switchTo().alert().dismiss();
	}
	

}
