package in.rahul.dao;

import org.springframework.stereotype.Component;

import in.rahul.annotation.MyTransaction;

@Component
public class EmployeeDao {
	
	@MyTransaction
	public void saveEmployee() {
		System.out.println("Employee Object is saved...");
	}

}
