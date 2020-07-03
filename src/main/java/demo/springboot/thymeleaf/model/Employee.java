package demo.springboot.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	
}
