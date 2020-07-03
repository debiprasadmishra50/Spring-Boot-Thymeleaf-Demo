package demo.springboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.springboot.thymeleaf.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	// load the Employee Data
	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		
		// create employees
		Employee emp1 = new Employee("Debi", "Prasad", "debi@mishra.com");
		Employee emp2 = new Employee("Debi", "Mishra", "prasad@mishra.com");
		Employee emp3 = new Employee("Vicky", "Prasad", "debi@vicky.com");
		Employee emp4 = new Employee("Mishra", "Prasad", "prasad@mishra.com");
		
		// create the list
		employees = new ArrayList<Employee>();
		
		// add to the list
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
	}
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model model) {
		
		model.addAttribute("employees", employees);
		
		return "list-employees"; 
	}
}
