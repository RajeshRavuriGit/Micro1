package com.example.FrontEnd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/")
public class FrontController {

	
	@Autowired
	RestTemplate temp;
	  
	  
	@RequestMapping("/userRating")
	public ModelAndView getUserRating() {
		System.out.print("in userRating----------------------------------------------------");
		
		   Map<Integer,Movies> mvs=  temp.getForObject("http://CLIENT11/movies", Map.class);
		   Map<Integer,User> users=  temp.getForObject("http://CLIENT22/users",Map.class);
			
		   
		
		
		
		
	return new ModelAndView("userRating").addObject("movies", mvs).addObject("users",users);	
	}
	
	@RequestMapping("/givenRating")
	public ModelAndView givenRating(@RequestParam("mid") int mid) {
	
		System.out.println("i am in givenRating------------"+mid);
		

		/*
		  List<User> users=  temp.getForObject("http://CLIENT22/users", List.class);
		  
		  ResponseEntity<Map<Integer, Movies>> response = temp.exchange(
					 "http://CLIENT11/movies",
					  HttpMethod.GET,
					  null,
					  new ParameterizedTypeReference<Map<Integer,Movies>>(){});
		  
			
		 
		 
		 Map<Integer, Movies> hms=response.getBody();
		 
		 System.out.println("hms---------------"+hms);
		  Movies m=hms.get(mid);
          
          System.out.println("m-----------"+m);
              m.setRating(m.getRating()+1);
		 hms.put(mid, m);
              
              
	//	return "redirect:/userRating";
		
		
		return new ModelAndView("userRating").addObject("movies", hms).addObject("users",users);	
		*/
		
		
		
		Map<Integer,Movies> hms=  temp.getForObject("http://CLIENT11/addRatings?mid="+mid+"&rating=1", Map.class);
		   
		
				return new ModelAndView("userRating").addObject("movies", hms);	
	
		
	}
	
	
	
}
