package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Baics5 {
	//calling the data provider by method name
	@Test(dataProvider="Demo2")
	//passing the dataprovider method by passing number of values returned
	public void Demo1(String urlname,String pwd) {
		System.out.println(urlname);
		System.out.println(pwd);
	}

	@DataProvider
	public Object[][] Demo2(){
		//Passing 3 times 2 data
		//Declaring multi dimensional array
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]="firstuname";
		data[0][1]="firstpwd";
		//2nd set
		data[1][0]="seconduname";
		data[1][1]="fsecondpwd";
		//3rd Set
		data[2][0]="thirduname";
		data[2][1]="thirdpwd";
		return data;
	}
		
	}
	

