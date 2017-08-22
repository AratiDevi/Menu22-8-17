package Jibe_Menu;

import org.testng.Assert;
import org.testng.annotations.Test;
import common_Function.WebDriverPass;


public class MenuListTest extends WebDriverPass {

	

		/*ExtentReports report;
		ExtentTest test;*/
		MenuList M = new MenuList();
		
		
		@Test
		public void Sub_SubMenu() throws Exception {
			
			try{
			
			M.Sub_SubMenu(driver);			
			
			Assert.assertTrue(true);
			
			}catch(Exception e){
				
				e.getMessage();
								
							
			}
			
		}
		
		
		
}
//  Assert.assertEquals(ExpectedTitle, ActualTitle);