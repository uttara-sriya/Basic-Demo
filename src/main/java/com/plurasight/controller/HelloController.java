package com.plurasight.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.Api;

//import com.plurasight.resource.Data;
@RestController
@RequestMapping(value ="/service/greeting")
public class HelloController {

//	@RequestMapping(value ="/service/greeting")
//	public String sayHello (Model model) {
//		
//		model.addAttribute("greeting", "This is a new greeting");
//		
//		return "hello";
//	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET,headers="Accept=Application/json")
	public String getString(@PathVariable String name){
		String result="hello"+name;
		return result;	
		
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST,headers="Accept=Application/json")
	public String addMessage(){
		return "This is new data!";
	}
	
	
	/*private List<String> dList=new ArrayList<String>(Arrays.asList("html","css","js"));
	@RequestMapping("/getData/{id}")
	@ResponseBody
	public Data getData(@RequestParam(value="id", defaultValue="0")Integer id){
		return new Data(id,dList.get(id));
		
	}*/
	
}
