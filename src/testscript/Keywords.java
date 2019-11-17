package testscript;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class Keywords {
	
	static WebDriver driver;
	static Properties prop;
	static FileInputStream fis;
	static Robot robot;
	static{
		try{
		robot = new Robot();
		fis = new FileInputStream("C:\\Users\\Pawan\\eclipse-workspace\\myFramework\\src\\objectRepository\\objectRepository.properties");
			
			prop = new Properties();
			prop.load(fis);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void openBrowser() throws Exception{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		
		
		
	}
	
public void navigate(String testData){
		
		driver.get(testData);
		
	}

public void waitStatement() 
		throws Exception{
	Thread.sleep(10000);
}

public void input(String testData, String objectName){
	
	driver.findElement(By.xpath
			(prop.getProperty(
					objectName))).sendKeys(testData);
}

public void click(String objectName) throws Exception{
	Thread.sleep(12000);
	driver.findElement(By.xpath
			(prop.getProperty(objectName))).click();
}

public void type(String testData) throws InterruptedException{

	if (testData.equals("Mr.")){
	
	robot.keyPress(KeyEvent.VK_M);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_PERIOD);
	robot.keyPress(KeyEvent.VK_ENTER);	
	}
	if (testData.equals("Mrs.")){
		
	robot.keyPress(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_PERIOD);
	robot.keyPress(KeyEvent.VK_ENTER);	
	}
	if (testData.equals("Ms.")){
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_ENTER);	
	}
	if (testData.equals("Dr.")){
		
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_ENTER);	
	}
	if (testData.equals("Prof.")){
		
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_ENTER);	
	}
}

public void close(){
	driver.close();
}
public void upload (String testdata) throws InterruptedException
{
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(testdata),null );
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);					
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
public void mouse(String objectName)
{
	WebElement wb = driver.findElement(By.xpath(prop.getProperty(objectName)));
	Actions as = new Actions(driver);
	Action s = as.moveToElement(wb).click().build();
	s.perform();
	
}
public void window()
{
	Set windowid = driver.getWindowHandles();
	Object[] o = windowid.toArray();
	System.out.println(o.length);
}
public void drop(String testdata, String objectName)
{
	Select select =new Select(driver.findElement(By.xpath(prop.getProperty(objectName))));
	select.selectByIndex(1);
}

public String verifyTitle(){
	
String actualValue = 	driver.getTitle();
return actualValue;
	
}

}







