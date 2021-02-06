package exp1_collection;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("size of hashmap = "+map.size());  
		   if(map.containsKey(1)){
			 String a = map.get(3);
		     System.out.println("value of key \"3\" is "+a);    
		   }  

	}

}
