package com.example.Client1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserControlle {


	Map<Integer,User>  users=new HashMap();
	
	UserControlle(){
		System.out.print("usercontroller const-------------------------------------");
		
	}
	
@RequestMapping("users")
public @ResponseBody Map<Integer,User> getUsers(){
	System.out.println("in movies2---------------------------------");
	User m1=new User();
	m1.setUid(101);
	m1.setUname("gopi");
	
	User m2=new User();
	m2.setUid(102);
	m2.setUname("chand");
	
	User m3=new User();
	m3.setUid(103);
	m3.setUname("kumar");
	
	
	users.put(1, m1);

	users.put(2,m2);
	users.put(3,m3);
	
	return users;

	
}
}
