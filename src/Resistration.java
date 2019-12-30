import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resistration 
{
	public static void main(String[] args) throws InterruptedException

		{
			System.setProperty("webdriver.chrome.driver","D:\\ASDM Exam\\chromedriver.exe");
			ChromeDriver chrome = new ChromeDriver();
			
			chrome.get("https://accounts.google.com");
			
			Thread.sleep(3000);
			chrome.findElementByClassName("BHzsHc").click();
			
			chrome.findElementByClassName("NlWrkb snByac").click();
			
			
			//chrome.findElementByClassName("whsOnd zHQkBf").sendKeys("aishwaryatibile77@gmail.com");
			Thread.sleep(3000);
			
			//*[@id="identifierId"]
			chrome.findElementByXPath("//*[@id=\"identifierId\"]").sendKeys("aishwaryatibile77@gmail.com");
			//chrome.findElementByXPath("//*[@id=\"ow279\"]/span").click();
			Thread.sleep(3000);
			
		}
}
