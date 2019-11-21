package io.infy.springbootstarter.maincontroller;



import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	public long getAllTopics(long n){
		
	int a = 0, b = 1, c; 
		if (n == 0) 
			return a; 
	for (int i = 2; i <= n; i++){ 
        c = a + b; 
        a = b; 
        b = c; 
		} 
    		return b; 
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
		
		if(a==b&&b==c) {
			type= "Equilateral";
		}
		else if(a==b||b==c||c==a){
			type= "Isosceles";
		}else{
			type ="Scelen";
			 }
		
		return type;
	}

}

