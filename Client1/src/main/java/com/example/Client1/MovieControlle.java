package com.example.Client1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MovieControlle {

    @Autowired
	private TestConfig properties;
    @Value("${some.other.property}")
    private String someOtherProperty;
	Map<Integer,Movies>  movies=new HashMap();
	
	MovieControlle(){
		System.out.print("movieController const1-------------------------------------");
		
	}
	
@RequestMapping("movies")
public @ResponseBody Map<Integer,Movies> getMovies(){
	
	System.out.println("in movies1---------------------------------");
	
	Movies m1=new Movies();
	m1.setMid(1);
	m1.setMoviename("avengers");
	m1.setRating(0);
	
	Movies m2=new Movies();
	m2.setMid(2);
	m2.setMoviename("maharshi");
	m2.setRating(0);
	
	Movies m3=new Movies();
	m3.setMid(3);
	m3.setMoviename("jerrsey");
	m3.setRating(0);
	
	movies.put(1,m1);
	movies.put(2,m2);
	movies.put(3,m3);
	
	return movies;

	
}
@RequestMapping("addRatings")
public @ResponseBody Map<Integer,Movies> addRating(@RequestParam("mid") int mid,@RequestParam("rating") int rating ){

	System.out.println("i am in addRatings---------------------------");
	
	Movies mvs=movies.get(mid);
	       mvs.setRating(mvs.getRating()+1);
	movies.put(mid,mvs);
	
	return movies;
	
}


@RequestMapping("configclient1")
public @ResponseBody String configclient() {
	
	
	StringBuilder sb=new StringBuilder();
	sb.append(properties.getProperty());
	sb.append("||");
	sb.append(someOtherProperty);
	return sb.toString();
}

}
