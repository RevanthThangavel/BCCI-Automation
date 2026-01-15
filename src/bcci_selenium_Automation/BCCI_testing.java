package bcci_selenium_Automation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class BCCI_testing {

	 public static void main(String[] args) throws InterruptedException {

	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--disable-notifications");
	    	options.addArguments("--disable-gpu");
	    	options.addArguments("--no-sandbox");
	    	options.addArguments("--disable-dev-shm-usage");
	    	options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);

	    	WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.get("https://www.bcci.tv/international/women");

	        WebElement menTab =
	                driver.findElement(By.xpath("//span[@class='menu-inner-text']"));
	        menTab.click();

	        WebElement playersTab =
	                driver.findElement(By.xpath("//a[@data-element_text='Players']"));
	        playersTab.click();

	        WebElement virat =
	                driver.findElement(By.xpath("//a[@data-player_name='Virat Kohli']"));
	        virat.click();
	        driver.navigate().back();

	        WebElement jadeja = driver.findElement(By.xpath("//a[@data-player_name='Ravindra Jadeja']"));
	        jadeja.click();
	        driver.navigate().back();
	        
	        WebElement rahul = driver.findElement(By.xpath("//a[@data-player_name='Kl Rahul']"));
	        rahul.click();
	        driver.navigate().back();

	        List<WebElement> playerCards = driver.findElements(By.xpath("(//a[@data-player_name])[position()<=11]"));

	        for (int i = 0; i < playerCards.size(); i++) {
	            WebElement player = playerCards.get(i);
	            String name = player.getAttribute("data-player_name");
	            System.out.println("Name : " + name);
	        }
	        driver.quit();
	    }
	}
	}

}
