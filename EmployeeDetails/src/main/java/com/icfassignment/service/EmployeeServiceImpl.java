package com.icfassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.repository.EmployeeRepository;


@Service(value="employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRespository;

	@Override
	public List<EmployeeDTO> getAllEmployees() throws EmployeeDetailsException{
		List<EmployeeDTO> list = empRespository.getAllEmployees();
		

//		list.clear(); // Just to check if it throws Exception
		if(list.size() == 0)
			throw new EmployeeDetailsException("Employees Doesn't Exist");
		return list;
	}
	
}
