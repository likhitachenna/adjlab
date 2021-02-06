package exp1_collection;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1297,"likhita");  
		  hm.put(1201,"ratna");  
		  hm.put(1204,"nikhita");  
		  hm.put(1203,"tabassum");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
