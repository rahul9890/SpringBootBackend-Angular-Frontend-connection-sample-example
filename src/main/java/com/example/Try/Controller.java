package com.example.Try;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
	
	@GetMapping("/client1")
	@CrossOrigin(origins = "*")
	public ArrayList<Employees> client1() {
		
	Employees employees1=new Employees();
	employees1.setEmpID(1);
	employees1.setName("Rahul");
	
	Employees employees2=new Employees();
	employees2.setEmpID(2);
	employees2.setName("Sandip");
	
	ArrayList<Employees> empList=new ArrayList<Employees>();
	empList.add(employees1);
	empList.add(employees2);
		return empList;
	}

}
