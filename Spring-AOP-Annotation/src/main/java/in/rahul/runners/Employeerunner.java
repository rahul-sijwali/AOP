package in.rahul.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.rahul.dao.EmployeeDao;

@Component
public class Employeerunner implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;

	@Override 
	public void run(String... args) throws Exception {
		dao.saveEmployee();	
	}

}
