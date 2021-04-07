package edu.uprb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.uprb.company.Department;
import edu.uprb.company.Employee;
import edu.uprb.company.HourlyEmployee;

class HourlyEmployeeTest {
	
	private  HourlyEmployee firsemployee;
	
	@BeforeEach
	public void setUp() {
		firsemployee = new HourlyEmployee (1000, "John", "Doe",Department.FINA, 40, 7.50);
	}
	
	
	
	
	
	@Test
	public void testToString() {
		assertEquals("Employee Id: " + firsemployee.getemployeeId() + "\n" + "First name: " + firsemployee.getfirstName() + "\n" + "Last name: " + firsemployee.getlastName() + "\n" +
				"Department: " + firsemployee.getdepartment() + "\n" +"Hours worked: " + firsemployee.gethoursWorked() + "\n" + "Pay rate: " +
				firsemployee.getpayRate() + "\n" + "Weekly salary: " + firsemployee.weeklySalary(), firsemployee.toString());
	}
	
	
	
	
	@Test
	public void testEmployeeId() {
		assertEquals(1000, firsemployee.getemployeeId());
		
	}
	
	@Test 
	public void testfirstName() {
		assertEquals("John", firsemployee.getfirstName());
	}
	
	@Test
	public void testlastName() {
		assertEquals("Doe", firsemployee.getlastName());
		
	}
		
	@Test
	public void testdepartment() {
			assertEquals(Department.FINA, firsemployee.getdepartment());
		}
	@Test
	public void testhoursWorked() {
		assertEquals(40, firsemployee.gethoursWorked());
	}
	
	@Test
	public void testpayRate() {
		assertEquals(7.50, firsemployee.getpayRate());
	}
	
	@Test 
	public void testweeklySalary() {
		assertEquals(300.00, firsemployee.weeklySalary());
	}
	
	@Test
	public void test1employeeitequal() {
		assertTrue(firsemployee.equals(firsemployee));
	}
	
	@Test
	public void test1employeecopy() {
		Employee copy = new HourlyEmployee (1000, "John", "Doe", Department.FINA, 40, 7.50);
		assertTrue(firsemployee.equals(copy));
	}
	
	@Test 
	public void test1employeediff() {
		Employee diff = new HourlyEmployee(3000, "Joe", "Doe", Department.MKTG, 40, 7.50);
		assertFalse(firsemployee.equals(diff));
	}
	
	@Test
	public void testfirstNamevalidCH() {
		firsemployee.setfirstName("Will");
		assertEquals("Will", firsemployee.getfirstName());
		
	}
	
	@Test
	public void test1invalidfirstName() {
	try {
		firsemployee.setfirstName("brigitte");
		fail("Failed attempt.First name must contain capital letters.: " + firsemployee.getfirstName());
	}
	catch(IllegalArgumentException err) {
		assertEquals("Invalid First name. Try again",
				err.getMessage());
	}
	
}
	
	@Test
	public void test1validlastName() {
		firsemployee.setlastName("Smith");
		assertEquals("Smith", firsemployee.getlastName());
	}
	
	@Test
	public void test1invalidLastName() {
		try {
			firsemployee.setlastName("jackson");
			fail("Failed attempt.Last name must contain capital letters: " + firsemployee.getlastName());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Last name. Try again",
					err.getMessage());
		}
	}
	
	@Test
	public void test1validhoursWorked() {
		firsemployee.sethoursWorked(60);
		assertEquals(60, firsemployee.gethoursWorked());
	}
	
	@Test
	public void test1invalidhoursWorked() {
		try {
			firsemployee.sethoursWorked(-8);
			fail("Failed attempt. Worked hours should be between 0 and 60. " + firsemployee.gethoursWorked());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid worked hours. Try Again",err.getMessage());
		}
	}
	
	@Test
	public void test1validpayRate() {
		firsemployee.setpayRate(9.50);
		assertEquals(9.50, firsemployee.getpayRate());
	}
	
	@Test
	public void test1invalidpayRate() {
		try {
			
			firsemployee.setpayRate(0.50);
			fail("Failed attempt. Pay rate must be greater than  7.00 and up until 50.00 " + firsemployee.getpayRate());
			
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Pay Rate. Try Again", err.getMessage());
			
		}
	}
	
	@Test
	public void test1overtime() {
		Employee overt = new HourlyEmployee(1000, "John","Doe",Department.FINA, 50, 7.50);
		assertEquals("Employee Id: " + overt.getemployeeId()+ "\n" + "First name: " + overt.getfirstName()+ "\n" + "Last name: " + overt.getlastName() + "\n"
				+ "Department: " + overt.getdepartment()+"\n" +"Hours worked: " + ((HourlyEmployee)overt).gethoursWorked() + "\n" + "Pay rate: " +
				((HourlyEmployee) overt).getpayRate() + "\n" + "Weekly salary: " + overt.weeklySalary(), overt.toString());
		assertEquals(412.50, overt.weeklySalary());
	}
	
	@Test
	public void test1Idonly() {
		Employee onlyI = new HourlyEmployee(3497);
		assertEquals("Employee Id: " + onlyI.getemployeeId()+ "\n" + "First name: " + onlyI.getfirstName() + "\n" + "Last name: " + onlyI.getlastName() + "\n"
				+ "Department: " + onlyI.getdepartment()+ "\n" +"Hours worked: " + ((HourlyEmployee) onlyI).gethoursWorked() + "\n" + "Pay rate: " +
				((HourlyEmployee) onlyI).getpayRate() + "\n" + "Weekly salary: " + onlyI.weeklySalary(), onlyI.toString());
		assertEquals(400, onlyI.weeklySalary());
	}
	
	@Test
	public void test1newivnalidId() {
		try {
		Employee newinv = new HourlyEmployee(55);
		fail("Failed attempt. Emplyee Id must be between 1000 and 9999." + newinv.getemployeeId());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Employee Id. Try again", err.getMessage());
		}
	}
	

}
