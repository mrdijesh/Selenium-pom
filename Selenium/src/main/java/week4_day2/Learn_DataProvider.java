package week4_day2;

import org.testng.annotations.DataProvider;

public class Learn_DataProvider {
	
	
@DataProvider(name="fetchData")	
	public static Object[][] getData(){
		
		Object[][] data= new Object[2][5];
		data[0][0]="Cognizant";
		data[0][1]="Adi";
		data[0][2]="Swain";
		data[0][3]=2;
		data[0][4]="Catalog Generating Marketing Campaigns";	
		
		data[1][0]="HCL";
		data[1][1]="DJ";
		data[1][2]="Mishra";
		data[1][3]=3;
		data[1][4]="Catalog Generating Marketing Campaigns";
		return data;
	}

}
