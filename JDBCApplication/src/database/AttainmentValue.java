package database;

import java.util.ArrayList;

public class AttainmentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create readfromcsvfile object
		ReadFromCSVFile f = new ReadFromCSVFile();
		// call readfromcsvfile() and get arraylist object
		ArrayList<student> res = f.readFromCSV();		
		// create object from dboperation object
		DBOOperations db = new DBOOperations();		
		// call insertRows() by passing arraylist object and get integer and display no of rows inserted done.
		/*int r = db.insertRows(res);
		System.out.println("Rows inserted !!");
		// call selectquery() to display query results*/
		db.attainmentValue1();
		db.attainmentValue2();
		db.attainmentValue3();
		db.attainmentValue4();
		db.attainmentValue5();
		db.attainmentValue6();
	}

}
