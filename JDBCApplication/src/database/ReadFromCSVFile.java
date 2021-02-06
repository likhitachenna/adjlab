package database;

import java.io.FileReader;
import java.util.ArrayList;

import au.com.bytecode.opencsv.CSVReader;

public class ReadFromCSVFile {
	public static ArrayList<student> readFromCSV(){
		
		
		CSVReader reader;
		
		ArrayList<student> stlist = new ArrayList<student>(); 
		
		try{
			reader = new CSVReader(new FileReader("./students.csv"));
			String[] row;
			reader.readNext();
			while((row=reader.readNext())!=null){
				// Declare object from POJO class
				student st = new student();
				// call setter methods for each corresponding column index of CSV file. example in the next comment
				st.setRegNo(row[0]);
				st.setQ1(row[1]);
				st.setQ2(row[2]);
				st.setQ3(row[3]);
				st.setQ4(row[4]);
				st.setQ5(row[5]);
				st.setQ6(row[6]);
				// user.setName(newRow[0]);
				stlist.add(st);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return stlist;
	}
	public static void main(String[] args) {
		ArrayList<student> stlist1 = new ArrayList<student>(); 
		stlist1 = readFromCSV();
		/*for(student v : stlist1) {
			String s = v.getRegNo();
			System.out.println(s);
		}*/
	}	
}

