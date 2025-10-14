package com.example.tkrproject.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tkrproject.model.Employee;
import com.example.tkrproject.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService es;
	
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return es.addEmp(emp);
	}
	@GetMapping("/retrivaldata")
	public List<Employee> getEmployee()
	{
		return es.getEmp();
	}
	@DeleteMapping("/deletingrecord/{eid}")
	public void deleteEmp(@PathVariable int eid)
	{
		es.delEmp(eid);
	}

}
