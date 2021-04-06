package com.icfassignment.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.icfassignment.dto.EmployeeDTO;

@Repository(value="employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	
	@Override
	public List<EmployeeDTO> getAllEmployees() {
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setId(588);
		empDTO.setFirstName("Parundeep");
		empDTO.setLastName("Singh");
		empDTO.setBloodGroup("B+");
		empDTO.setDesignation("Student");
		empDTO.setAddress("234-5, ABC Area, India");
		empDTO.setDob(LocalDate.of(1998, 07, 14));
		empDTO.setReportingManager("Not Available");
		empDTO.setEndDate(null);
		
		
		
		EmployeeDTO empDTO2 = new EmployeeDTO();
		empDTO2.setId(5605);
		empDTO2.setFirstName("XYZ");
		empDTO2.setLastName("Person");
		empDTO2.setBloodGroup("A+");
		empDTO2.setDesignation("Working Professional");
		empDTO2.setAddress("229-5, XYZ Area, India");
		empDTO2.setDob(LocalDate.of(1967, 9, 18));
		empDTO2.setReportingManager("PQS Person");
		empDTO2.setEndDate(null);
		List<EmployeeDTO> list = new ArrayList<>();
		list.add(empDTO);
		list.add(empDTO2);
		
		
		return list;
	}
	
}
