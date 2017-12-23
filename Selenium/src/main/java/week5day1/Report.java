package week5day1;

import java.io.File;

import org.testng.annotations.Test;

//import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	
	@Test
	public void result()
	{
		ExtentReports report=new ExtentReports("./Reports/samplereport.html", false);
		report.loadConfig(new File("./Extentsconfig.xml"));
		 ExtentTest test=report.startTest("Create Lead", "To create a new Lead");
		 
		test.log(LogStatus.PASS, "Launch Browser", "Browser launched successfully");
		test.assignAuthor("DJ");
		test.log(LogStatus.FAIL, "Failed", "Browser failed to launch");
		report.endTest(test);
		report.flush();
		
		
		
	}

}
