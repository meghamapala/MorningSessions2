package com.datadriven.test;

import java.util.ArrayList;

public class TestUtil {
	
	static Xlx_Reader reader;

	public static ArrayList<Object[]> getDatafromSpreadSheet() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xlx_Reader("/Users/meghamapalagama/"
					+ "eclipse-workspace/MorningSessions2/src/com/testdata/ExpressTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum =2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			
			String email = reader.getCellData("RegTestData", "email", rowNum);
		    String password = reader.getCellData("RegTestData", "password", rowNum);
		    
		    Object ob[] = {email, password};
		    myData.add(ob);
		    
		    
		}
		
		
		return myData;
	}

}
