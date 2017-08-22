package common_Function;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;  
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginpage extends RW
{ 	
	
	 
	public String Login(WebDriver driver1) throws Exception
	{
		 WebDriver driver=driver1;  
				
		 
	     driver.findElement(By.id(jibe_config.getData(2, 1, 2))).sendKeys(jibe_config.getData(1,1,0));  // Read username from excelsheet
	     Thread.sleep(1000);	   
		 driver.findElement(By.id(jibe_config.getData(2, 2, 2))).sendKeys(jibe_config.getData(1,1,1)); //   Read Password from excelsheet
		 Thread.sleep(1000);	   
	     driver.findElement(By.id(jibe_config.getData(2, 3, 2))).click(); 				    //  Read login button  from excelsheet
	     Thread.sleep(1000);
	     String title = driver.getTitle().trim();         // Get trim title from web.
	     System.out.println("Successfully logged in " + title);
	       
	    // return null;
	   
	    //Get the page load Time
	 
	     
	      long LoagingStart = System.currentTimeMillis();   //take system(PC) current time in millisecond
		  
		  List<WebElement> allLinks = driver.findElements(By.xpath("//*"));  //Find xpath of all element for opened page. 

		  long Loadingstop = System.currentTimeMillis();  //take system(PC) current time in millisecond
		  
		  double TotalTime = (Loadingstop-LoagingStart);
		  
		  String Result  =  Double.toString(TotalTime);
		  
		  System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec");	
		//  write_data.writedata(1,1,2,Result);
		  
		
		  Thread.sleep(100);
		  	         
	      return(title);
	      	        
	}
	//-----------------Function for Take screenshot if wrong page is open or expected page is crashed--------------------------//
	/*int i;
	public String SShot(WebDriver driver1) throws IOException, AWTException {
		String ScreenshotName = "ABCD" + (i++) + ".jpg";

		String failScreenshot = Scrnshot.concat(ScreenshotName);
		WebDriver driver = driver1;

		Robot robot = new Robot();

		BufferedImage screenshot = robot
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		ImageIO.write(screenshot, "JPG", new File(failScreenshot));

		return ScreenshotName;

	}*/
	
		
	
		public String SShot (String actual1, String title1, WebDriver driver1) throws IOException
		{
			
			String actual = actual1;
			String title = title1;
			WebDriver driver = driver1;
			
			
			if(title.contentEquals(actual))
			{
				System.out.println(title+ " page is open" );
			}	
			else
			{
			
					File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					FileUtils.copyFile(scrFile, new File(path.concat("\\ScreenShot\\"+ driver.getTitle().trim()+"_"+System.currentTimeMillis()+".jpg")));
				
					driver.close();
			}
			
			return(null);
			
			
		}}
	