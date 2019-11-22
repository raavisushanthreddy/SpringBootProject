package com.infy.maincontroller.apicontroller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
@CrossOrigin
public class ApplicationController{

	@Autowired
	private ApplicationService applicationService;

	@RequestMapping(value="/Fibonacci", produces="application/json")
	public ResponseEntity<Long> topics(@RequestParam("n") long n) throws Exception{
		long fibonacci =0;
		try {
			fibonacci = applicationService.getnthFibonacciElement(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return ResponseEntity.ok().body(fibonacci);

	}

	@RequestMapping(value="/ReverseWords", produces="application/XML")
	public ResponseEntity<String> topics(@RequestParam("sentence") String sentence) {

		String reverseWords = applicationService.reverseWords(sentence);

		return ResponseEntity.ok().body(reverseWords);

	}

	@RequestMapping(value="/TriangleType", produces="application/XML")
	public ResponseEntity<String> topics(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {

		String triangleType = applicationService.traiangleType(a,b,c);

		return ResponseEntity.ok().body(triangleType);

	}

	@PostMapping(path = "/makeOneArray", produces="application/json")
	public ResponseEntity<Set<Integer>> customerInformation(@RequestBody CountArray count) {
		
		 Set<Integer> sortedSet = applicationService.sortArrays(count);

		 return ResponseEntity.ok().body(sortedSet); 

	}

}