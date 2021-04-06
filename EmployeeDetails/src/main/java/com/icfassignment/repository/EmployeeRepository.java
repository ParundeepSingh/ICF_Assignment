package com.icfassignment.repository;

import java.util.List;

import com.icfassignment.dto.EmployeeDTO;

public interface EmployeeRepository {
	public List<EmployeeDTO> getAllEmployees();
}
