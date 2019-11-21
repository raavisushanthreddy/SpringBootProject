package io.infy.springbootstarter.maincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
@CrossOrigin
public class TopicController{
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/Fibonacci")
	public ResponseEntity<Long> topics(@RequestParam("n") long n) {
		
		long fibonacci = topicService.getAllTopics(n);
		return ResponseEntity.ok().body(fibonacci);
	}
	
	@RequestMapping(value="/ReverseWords")
	public ResponseEntity<String> topics(@RequestParam("sentence") String sentence) {
		
		String reverseWords = topicService.reverseWords(sentence);
		return ResponseEntity.ok().body(reverseWords);
	}
	
	@RequestMapping(value="/TriangleType")
	public ResponseEntity<String> topics(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {
		
		String triangleType = topicService.traiangleType(a,b,c);
		return ResponseEntity.ok().body(triangleType);
	}
	
	@PostMapping(path = "/save-cust-info")
    public int[] customerInformation(@RequestBody String[] cust) {

        int[] i = {1,2,3,4};

        return i;
    }

}

