//package Demo;
//
//public class SSLCheck {
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//
//		ChromeOptions options = new ChromeOptions();
//
//		Proxy proxy = new Proxy();
//
//		proxy.setHttpProxy("ipaddress:4444");
//
//		options.setCapability("proxy", proxy);
//
//		Map<String, Object> prefs = new HashMap<String, Object>();
//
//
//
//		prefs.put("download.default_directory", "/directory/path");
//
//
//
//		options.setExperimentalOption("prefs", prefs);
//
//		// FirefoxOptions options1 = new FirefoxOptions();
//
//		// options1.setAcceptInsecureCerts(true);
//
//		// EdgeOptions options2 = new EdgeOptions();
//
//		options.setAcceptInsecureCerts(true);
//
//		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//
//
//		WebDriver driver = new ChromeDriver(options);
//
//		driver.get("https://expired.badssl.com/");
//
//		System.out.println(driver.getTitle());
//	}
//
//}
