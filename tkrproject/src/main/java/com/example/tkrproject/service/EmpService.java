package com.example.tkrproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tkrproject.model.Employee;
import com.example.tkrproject.repo.EmpRepo;

@Service

public class EmpService {
	@Autowired
	EmpRepo er;
	
	//insert
	public Employee addEmp(Employee emp)
	{
		return er.save(emp);
	}
	//select
	public List<Employee> getEmp()
	{
		return er.findAll();
	}
	//delete
	public void delEmp(int eid)
	{
		er.deleteById(eid);
	}

}
