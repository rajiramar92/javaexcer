package test.org;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.w3c.dom.stylesheets.LinkStyle;

public class demo  {
	
	public static void main(String[] args) {
		
		
		String s="gai klhfdh";
		char c[]=s.toCharArray();

		Map<Character,Integer> m=new HashMap<Character,Integer>();
		int count=0;
		for(char x:c){
		           if(m.containsKey(x))
		           {

		                    count =m.get(x);
		                     m.put(x,count+1);
		          }
		else{

		    m.put(x,1);
		
	
	}
	
		
		}
		
		String rev=" ";
		Set<Entry<Character,Integer>> a=m.entrySet();
		for(Entry<Character,Integer> x:a){

			rev=rev+x.getKey()+x.getValue();


			


		
	}
			
		System.out.println(rev);

	
	}
	
}
		

		
	
	  
		
	
		
		

		
		
	







          
		
		
		
		
		
	
	

	


	
	
	
	
		
	

	


		
	

		
			
			
	
			
		
		
		
		
		
		
			

				
				
			
	
	


			
		
			
			
		
		
		
	
	
	
	
	
		


	
	
		
	
	
	
	

	
	
	
	
	
	
	
		
		
		
	
	

	
	
	
	
		
		
		
		
	
		
		





	
	
	



		


	
	
	
	
		
	

	
	

	

