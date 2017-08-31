package Jibe_Menu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import common_Function.RW;

public class MenuList extends RW {
	
       
	public void Sub_SubMenu(WebDriver driver1) throws Exception { 

		WebDriver driver=driver1;
	
		 ArrayList<Row> row= OR_menu.searchSheet("Sub_SubMenu",0,0);//Functn key,sheetNo.,Column no.// Xpath locator
		
		try {
			for (int i = 0; i < row.size(); i++) {
				
				
				if (row.get(i).getCell(3) != null) {
					
				String menu = row.get(i).getCell(1).toString();		
				WebElement ele = driver.findElement(By.xpath(menu));   // Menu
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				Thread.sleep(100);

				String submenu = row.get(i).getCell(2).toString();
				WebElement ele2 = driver.findElement(By.linkText(submenu));       // SubMenu
				action.moveToElement(ele2).build().perform();
				Thread.sleep(100);
							
				
				String sub_submenu = row.get(i).getCell(3).toString();
				WebElement ele3 = driver.findElement(By.linkText(sub_submenu));     // Sub-SubMenu
				ele3.click();
				Thread.sleep(100);
				
	
				
				// Write Title in excel
				String title=driver.getTitle();
				System.out.println(title);
				write_data.writedata(0, i+1, 6, title);
		
				
				//Write Page loading time into excel
				long LoadingStart = System.currentTimeMillis();   //take system(PC) current time in millisecond				  
				List<WebElement> allLinks = driver.findElements(By.xpath("//*"));  //Find xpath of all element for opened page. 
				long Loadingstop = System.currentTimeMillis();  //take system(PC) current time in millisecond				  
				double TotalTime = (Loadingstop-LoadingStart);				  
				String Result  =  Double.toString(TotalTime);
				  
				
				write_data.writedata(0, i+1, 5, Result);
				  
				  //Write Status into excel
				write_data.writedata(0, i+1, 7, pass);
				}
				
						
				else if (row.get(i).getCell(3) == null) {
					
					
				String menu = row.get(i).getCell(1).toString();
				WebElement ele = driver.findElement(By.xpath(menu));
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				Thread.sleep(100);

				String submenu = row.get(i).getCell(2).toString();
				WebElement ele2 = driver.findElement(By.linkText(submenu));
				ele2.click();		
					
				Thread.sleep(100);
					
				// Write Title in excel
				String title=driver.getTitle();
				System.out.println(title);
				write_data.writedata(0, i+1, 6, title);
								
					
				//Write Page loading time into excel
			
				
				long LoadingStart = System.currentTimeMillis();                    //take system(PC) current time in millisecond			  
				List<WebElement> allLinks = driver.findElements(By.xpath("//*"));    //Find xpath of all element for opened page. 
				long Loadingstop = System.currentTimeMillis();                      //take system(PC) current time in millisecond			  
				double TotalTime = (Loadingstop-LoadingStart);			  
				String Result  =  Double.toString(TotalTime);
					  
				 	
				write_data.writedata(0, i+1, 5, Result);
					  
				 //Write Status into excel
				write_data.writedata(0, i+1, 7, pass);
							
				}
			}}
		catch(Exception e){
			int i=0;
				e.getMessage();
				System.out.println("Exception is" +e);
				write_data.writedata(0, i+1, 7, fail);  // write status_Fail into excel
				SShot(driver);
				
				
			}
		}
	
	
	public String SShot ( WebDriver driver1) throws IOException
	{
		
		 WebDriver driver=driver1;
		
	     Boolean LOGO=driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[2]/div[1]/div[1]/img")).isDisplayed();
         System.out.println(LOGO);
		
		
		if(LOGO.FALSE)
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(scrFile, new File(path.concat("\\ScreenShot\\"+ driver.getTitle().trim()+"_"+System.currentTimeMillis()+".jpg")));
		
			//driver.close();
			
		}	
		else
		{
		System.out.println("Page is open");
				
		}
		return url;
						
	
}
	}


