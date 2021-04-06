package com.icfassignment.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.repository.EmployeeRepository;
import com.icfassignment.service.EmployeeService;
import com.icfassignment.service.EmployeeServiceImpl;

@SpringBootTest
public class EmployeeDetailsApplicationTests {
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@InjectMocks
	EmployeeService emploService = new EmployeeServiceImpl();
	
	@Test
	public void checkNotEmptyGetEmployeeDetails() throws EmployeeDetailsException{
		List<EmployeeDTO> list = new ArrayList<>();
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setId(588);
		empDTO.setFirstName("Parundeep");
		empDTO.setLastName("Singh");
		empDTO.setBloodGroup("B+");
		empDTO.setDesignation("Student");
		list.add(empDTO);
		Mockito.when(employeeRepository.getAllEmployees()).thenReturn(list);
		Assertions.assertTrue(!list.isEmpty());
	}
	
	@Test
	public void checkEmptyGetEmployeeDetails() throws EmployeeDetailsException{
		List<EmployeeDTO> list = new ArrayList<>();
		Mockito.when(employeeRepository.getAllEmployees()).thenReturn(list);
		Assertions.assertTrue(list.isEmpty());
	} 
	
}
