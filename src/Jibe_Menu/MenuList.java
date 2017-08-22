package Jibe_Menu;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import common_Function.RW;

public class MenuList extends RW {
	
	
	/*public void Sub_SubMenu(WebDriver driver1) throws Exception { 

		WebDriver driver=driver1;
	
		 ArrayList<Row> row= OR_menu.searchSheet("Sub_SubMenu",0,0);//Functn key,sheetNo.,Column no.// Xpath locator
		
		try {
			for (int i = 0; i < row.size(); i++) {
				String menu = row.get(i).getCell(1).toString();

				WebElement ele = driver.findElement(By.xpath(menu));
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				Thread.sleep(100);

				String submenu = row.get(i).getCell(2).toString();
				WebElement ele2 = driver.findElement(By.linkText(submenu));
				action.moveToElement(ele2).build().perform();
				Thread.sleep(100);

				String sub_submenu = row.get(i).getCell(3).toString();
				WebElement ele3 = driver.findElement(By.linkText(sub_submenu));
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
				  
				 // System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec");	
				write_data.writedata(0, i+1, 5, Result);
				  
				  //Write Status into excel
				write_data.writedata(0, i+1, 7, pass);
	
	}}catch(Exception e){
		int i=0;
			e.getMessage();
			System.out.println("Exception is" +e);
			write_data.writedata(0, i+1, 7, fail);  // write status_Fail into excel
		}

}*/
	
	
	//1
	/*public void Sub_SubMenu(WebDriver driver1) throws Exception { 

		WebDriver driver=driver1;
	
		 ArrayList<Row> row= OR_menu.searchSheet("Sub_SubMenu",0,0);//Functn key,sheetNo.,Column no.// Xpath locator
		
		try {
			for (int i = 0; i < row.size(); i++) {
				
				String menu = row.get(i).getCell(1).toString();		
				WebElement ele = driver.findElement(By.xpath(menu));   // Menu
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				Thread.sleep(100);

				String submenu = row.get(i).getCell(2).toString();
				WebElement ele2 = driver.findElement(By.linkText(submenu));       // SubMenu
				action.moveToElement(ele2).build().perform();
				Thread.sleep(100);
				
				
				if (row.get(i).getCell(3) != null) {
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
				
				else// if (row.get(i).getCell(3) == null) {.
				{	//String sub_submenu = row1.get(j).getCell(3).toString();.
					//WebElement ele3 = driver.findElement(By.linkText(sub_submenu));.
					//ele3.click();.
					Thread.sleep(100);
					
					// Write Title in excel
					String title1=driver.getTitle();
					System.out.println(title1);
					write_data.writedata(0, i+1, 6, title1);
								
					
					//Write Page loading time into excel
					
					long LoadingStart = System.currentTimeMillis();   //take system(PC) current time in millisecond			  
					List<WebElement> allLinks = driver.findElements(By.xpath("//*"));  //Find xpath of all element for opened page. 
					long Loadingstop = System.currentTimeMillis();  //take system(PC) current time in millisecond			  
					double TotalTime = (Loadingstop-LoadingStart);			  
					String Result1  =  Double.toString(TotalTime);
					  
						
					write_data.writedata(0, i+1, 5, Result1);
					  
					  //Write Status into excel
					write_data.writedata(0, i+1, 7, pass);
			}
	}}catch(Exception e){
		int i=0;
			e.getMessage();
			System.out.println("Exception is" +e);
			write_data.writedata(0, i+1, 7, fail);  // write status_Fail into excel
		}

}
}*/
	
       //2
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
				{	
					
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
							
				}}
			}}catch(Exception e){
			int i=0;
				e.getMessage();
				System.out.println("Exception is" +e);
				write_data.writedata(0, i+1, 7, fail);  // write status_Fail into excel
				
				
				
			}

		}}
















	
	
	/*public void SubMenu(WebDriver driver1) throws Exception { 

		WebDriver driver=driver1;

		 ArrayList<Row> row1= OR_menu.searchSheet("SubMenu",0,0);//Functn key,sheetNo.,Column no.// Xpath locator
		
		try {
			for (int j = 0; j < row1.size(); j++) {
				
				String menu = row1.get(j).getCell(1).toString();
				WebElement ele = driver.findElement(By.xpath(menu));
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				Thread.sleep(100);

				String submenu = row1.get(j).getCell(2).toString();
				WebElement ele2 = driver.findElement(By.linkText(submenu));
				ele2.click();
				Thread.sleep(100);
				
				
				if (row1.get(j).getCell(3) == null) {
				//String sub_submenu = row1.get(j).getCell(3).toString();
				//WebElement ele3 = driver.findElement(By.linkText(sub_submenu));
				//ele3.click();
				Thread.sleep(100);
				
				// Write Title in excel
				String title=driver.getTitle();
				System.out.println(title);
				write_data.writedata(0, j+1, 6, title);
							
				
							//Write Page loading time into excel
				
				long LoadingStart = System.currentTimeMillis();   //take system(PC) current time in millisecond			  
				List<WebElement> allLinks = driver.findElements(By.xpath("//*"));  //Find xpath of all element for opened page. 
				long Loadingstop = System.currentTimeMillis();  //take system(PC) current time in millisecond			  
				double TotalTime = (Loadingstop-LoadingStart);			  
				String Result  =  Double.toString(TotalTime);
				  
				 // System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec");	
				write_data.writedata(0, j+1, 5, Result);
				  
				  //Write Status into excel
				write_data.writedata(0, j+1, 7, pass);
				}		

	}}catch(Exception e){
		int j=0;
			e.getMessage();
			System.out.println("Exception is" +e);
			write_data.writedata(0, j+1, 7, fail);  // write status_Fail into excel
		}

	}
	}*/

/*public void SubMenu(WebDriver driver1) throws Exception { 

	WebDriver driver=driver1;

	 ArrayList<Row> row1= OR_menu.searchSheet("SubMenu",0,0);//Functn key,sheetNo.,Column no.// Xpath locator
	
	try {
		for (int i = 0; i < row1.size(); i++) {
			//if (row.get(i).getCell(0) != null) {	
			String menu = row1.get(i).getCell(1).toString();
			WebElement ele = driver.findElement(By.xpath(menu));
			Actions action = new Actions(driver);
			action.moveToElement(ele).build().perform();
			Thread.sleep(100);

			String submenu = row1.get(i).getCell(2).toString();
			WebElement ele2 = driver.findElement(By.linkText(submenu));
			ele2.click();
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
			  
			 // System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec");	
			write_data.writedata(0, i+1, 5, Result);
			  
			  //Write Status into excel
			write_data.writedata(0, i+1, 7, pass);
		

}}catch(Exception e){
	int i=0;
		e.getMessage();
		System.out.println("Exception is" +e);
		write_data.writedata(0, i+1, 7, fail);  // write status_Fail into excel
	}

}
}*/

		
		
		
	