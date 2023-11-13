package com.study.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class usersController {
	
	@GetMapping()
	public List<?> threadSafeArray() {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("practice");
        list.add("code");
        list.add("quiz");
        
        Iterator<String> it = list.iterator();
        synchronized(list) {
        	 while (it.hasNext()) {
//            	 it.remove();
            	 System.out.println(it.next());
            }
        }
       
           
//			System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqq");
		return null;
	}
	
	@GetMapping("/copyonarraylist")
	public List<?> copyonarraylist() {
		CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<String>();
		cwal.add("aa");
		cwal.add("ssss");
        Iterator<String> it = cwal.iterator();
        	 while (it.hasNext()) {
//            	 it.remove();
            	 System.out.println(it.next());
            }
           
//			System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqq");
		return null;
	}
	
	@GetMapping("/arraylist")
	public List<?> arraylist() {
		List<String> cwal = new ArrayList<String>();
		cwal.add("aa");
		cwal.add("ssss");
        Iterator<String> it = cwal.iterator();
        	 while (it.hasNext()) {
        		 it.remove();
            	 System.out.println(it.next());
            }
           
		return null;
	}
	
	@GetMapping("/hashMap")
	public List<?> hashMap() {
		Map<Integer, String> map = new HashMap();
		map.put(1, "ashish");
		map.put(2, "Lakshimi");
		map.put(3, "ashu");
		map.put(4, "Poonam");
		map.put(5, "Poonam");
		
		System.out.println("map.containsKey(4)" + map.containsKey(4));
		System.out.println("map.containsKey(4)" + map.containsValue("Poonam"));
		System.out.println("map.containsKey(4)" + map);
		System.out.println("map.containsKey(4)" + map.values());
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("aaaaaaaaaaaaaaaaaaaaa Key==" + entry.getKey() + "     " + "Value==" + entry.getValue());
		}
		
		return null;
	}
	
}
