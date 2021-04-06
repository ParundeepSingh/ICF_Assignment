package com.icfassignment.service;

import java.util.List;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;

public interface EmployeeService {
	List<EmployeeDTO> getAllEmployees() throws EmployeeDetailsException;
}
