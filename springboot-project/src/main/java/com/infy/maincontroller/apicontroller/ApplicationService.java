package com.infy.maincontroller.apicontroller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.springframework.stereotype.Service;



@Service
public class ApplicationService{

public long getnthFibonacciElement(long n) throws Exception{
		
		int a = 0, b = 1, c;
	try {
		if(n<0) {
				for (int i = 2; i <= -(n); i++){ 
				c = a + b; 
				a = b; 
				b = c;
			} 
				return -(b);
		}
		else if(n == 0) {
			return a; 
		}
		
		else {
			
			for (int i = 2; i <= n; i++){ 
				c = a + b; 
				a = b; 
				b = c; 
			}
			return b; 
		}
	}
		catch(Exception e){
			
			throw e;
		}
	}

 public String reverseWords(String sentence) {

		String words[]=sentence.split("\\s");  
		String reverseWord="";  

	    for(String w:words){  

	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    
	   return reverseWord.trim();  
 }



	public String traiangleType(int a, int b, int c) {
	
		String type = null;
		
		if (a + b <= c || a + c <= b || b + c <= a) {
			
			type ="Invalid Traingle";
		}
		
		else {
			if(a==b&&b==c) {
				type= "Equilateral";

			}

			else if(a==b||b==c||c==a){
				type= "Isosceles";

			}else{
				type ="Scelen";

				 }
		}

		return type;

	}


	@SuppressWarnings("rawtypes")
	public Set<Integer> sortArrays(CountArray cust) {
		
		int[] result = Arrays.copyOf(cust.getArray1(), cust.getArray1().length + cust.getArray2().length);
		System.arraycopy(cust.getArray2(), 0, result, cust.getArray1().length, cust.getArray2().length);
		
		int[] result1 = Arrays.copyOf(result, result.length + cust.getArray3().length);
		System.arraycopy(cust.getArray3(), 0, result1, result.length, cust.getArray3().length);
		
		Arrays.sort(result1);
		
		int length = result1.length;
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i = 0; i < length; i++){
			  set.add(result1[i]);
			}
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
		  set1.add((Integer) it.next());
		}
		
		return set1;
	}
}