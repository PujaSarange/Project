package Amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Testing {
	private WebDriver driver;
	private String parentWinId;
	private String parntWinId;
	private String partWinId;
  @Test(priority=0)
  public void When_guest_user_open_chrome() throws InterruptedException {
	  ChromeOptions options= new ChromeOptions();
	  options.addArguments("-remote-allow-origins=*");
	  driver=new ChromeDriver(options);
	  driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	  driver.manage().window().maximize();
  }

   @Test(priority=1)
  public void then_search_iPhone() {
	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("iPhone");
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
	  
  }
 
  @Test(priority=2)
  public void Apple_iPhone() {
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
  }
  
 
  @Test(priority=3)
  public void iPhone_buynow() {
	 Set<String> allwin=driver.getWindowHandles();
	 for(String win: allwin){
		 if(!win.equals(parentWinId)){
			 driver.switchTo().window(win);
		 }
	 }
	 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[35]/div/div/span/span/input")).click();
	 
  }
  @Test(priority=4)
  public void sign_in_Email() {
   
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys("-----");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[2]/span/span/input")).click();
  }
  @Test(priority=5)
  public void sign_in_password() {
   
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")).sendKeys("****");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input")).click();
 
  driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[4]/div[3]/a[2]")).click();
  }
 @Test(priority=6)
  public void check_personalcareproducts() {
	  Set<String> allwin=driver.getWindowHandles();
		 for(String win: allwin){
			 if(!win.equals(partWinId)){
				 driver.switchTo().window(win);
			 }
		 }

	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/section/div/div/div/div/div/ol/li[2]/a/div[1]/img")).click();
  }
  
  
  @Test(priority=7)
  public void Home_page() {
	 
	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a")).click();
  }


  @Test(priority=8)
  public void logout() throws InterruptedException {
      WebElement target=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")); 
     
      Actions act=new Actions(driver);
      act.moveToElement(target).perform();
      Thread.sleep(2000);
      WebElement Signout=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[13]/span"));
      act.click(Signout).perform();


}


}







