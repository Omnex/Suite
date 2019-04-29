package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.Base;

import cucumber.api.Scenario;

public class Screenshot extends Base {

	
	public Screenshot() throws Exception {
		super();
		
	}

	public static void failedScreenshots(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			
			Date d1 = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
			
			String str = sdf.format(d1);
			
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(f, new File("G:\\Selenium tools\\EWQIMSProductBDD\\Failed Screenshots\\"+str+"\\"+scenario+".jpg"));

			
		}

	}

			
			
			
		
		
		
		
	}
	
	
	
	
	

