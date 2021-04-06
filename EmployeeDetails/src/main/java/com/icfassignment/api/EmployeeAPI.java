package com.icfassignment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.service.EmployeeService;

@RestController
@RequestMapping(value="/icf")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value = "/employees")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() throws EmployeeDetailsException{
		List<EmployeeDTO> list = empService.getAllEmployees();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
}
