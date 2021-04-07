package edu.uprb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.uprb.company.Department;
import edu.uprb.company.Employee;
import edu.uprb.company.SalesEmployee;

class SalesEmployeeTest {
private SalesEmployee secemployee;
	
	@BeforeEach
	public void setUp() {
		secemployee = new SalesEmployee(2000, "Jane", "Doe",Department.SALES ,4000.00, 0.125);
	}

	@Test
	public void testToString() {
		assertEquals("Employee Id: " + 2000 + "\n"  + "First name: "  + "Jane"
				+ "\n" + "Last name: " + "Doe" + "\n" +
				"Department: "+ "Sales"+  "\n" + "Sales amount: " + 4000.00 + "\n" + 
				"Commission rate: " + 0.125 + "\n" +  "Weekly salary(sales and commission included): " +
				secemployee.weeklySalary(),secemployee.toString());
	}
	
	@Test
	public void test2employeeId() {
		assertEquals(2000, secemployee.getemployeeId());
	}
	
	@Test
	public void test2firstName() {
		assertEquals("Jane", secemployee.getfirstName());
	}
	
	@Test
	public void test2lastName() {
		assertEquals("Doe", secemployee.getlastName());
	}
	
	@Test
	public void test2department() {
		assertEquals(Department.SALES, secemployee.getdepartment());
	}
	
	@Test
	public void test2salesAmount() {
		assertEquals(4000.00, secemployee.getsalesAmount());
	}
	
	@Test
	public void test2commissionRate() {
		assertEquals(0.125, secemployee.getcommissionRate());
	}
	
	@Test
	public void test2weeklySalary() {
		assertEquals(500, secemployee.weeklySalary());
	}
	
	@Test
	public void test2employeeequal() {
		assertTrue(secemployee.equals(secemployee));
	}
	
	@Test
	public void test2employeecopy() {
		Employee same = new SalesEmployee(2000,"John", "Doe",Department.SALES ,4000.00, 0.125);
		assertTrue(secemployee.equals(same));
	}
	
	@Test
	public void test2employeediff() {
		Employee diff2 = new SalesEmployee(4000, "Janet","Doe",Department.INTE, 5670, 0.154);
		assertFalse(secemployee.equals(diff2));
	}
	
	
	@Test
	public void test2validfirstNameCH() {
		secemployee.setfirstName("Paula");
		assertEquals("Paula", secemployee.getfirstName());
	}
	
	@Test
	public void test2invalidfirstName() {
		try {
			secemployee.setfirstName("stephanie");
			fail("Failed attempt. First name must contain capital letters.: " + secemployee.getfirstName());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid First name. Try again",
					err.getMessage());
		}
	}
	
	@Test
	public void test2validlastName() {
		secemployee.setlastName("Kepner");
		assertEquals("Kepner", secemployee.getlastName());
	}
	
	@Test
	public void test2invalidlastName() {
		try {
			secemployee.setlastName("graham");
			fail("Failed Attempt.Last name must contain capital letters: " + secemployee.getlastName());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Last name. Try again",
					err.getMessage());
		}
	}
	
	@Test
	public void test2validsaleAmount() {
		secemployee.setsalesAmount(3);
		assertEquals(3, secemployee.getsalesAmount());
	}
	
	@Test
	public void test2invalidsalesAmount() {
		try {
			secemployee.setsalesAmount(-11);
			fail("Failed attempt. Sales amount must be greater than 0 " + secemployee.getsalesAmount());
			
		}
		catch(IllegalArgumentException err){
			assertEquals("Invalid Sales amount. Try again", err.getMessage());
		}
	}
	
	@Test
	public void test2validcommissionRate() {
		secemployee.setcommissionRate(0.30);
		assertEquals(0.30, secemployee.getcommissionRate());
	}
	
	@Test
	public void test2invalidcommissionRate() {
		try {
			secemployee.setcommissionRate(10.6);
			fail("Failed attempt. Commission rate must be between 0.00 and 1.00 " + secemployee.getcommissionRate());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Commission rate. Try again", err.getMessage());
		}
	}
	
	@Test
	public void test2onlyId() {
		Employee only2 = new SalesEmployee(7050);
		assertEquals("Employee Id: " + only2.getemployeeId() + "\n"+ "First name: " + only2.getfirstName()
			+ "\n" + "Last name: " + only2.getlastName() + "\n" +
				"Department: " + only2.getdepartment() + "\n" + "Sales amount: " + 
				((SalesEmployee) only2).getsalesAmount()+ "\n" + 
				"Commission rate: " + ((SalesEmployee) only2).getcommissionRate()
				+ "\n" + "Weekly salary(sales and commission included): " 
				+ only2.weeklySalary(), only2.toString());
		assertEquals(0, only2.weeklySalary()); 
	}
	
	@Test
	public void test2newinvalidId() {
		
		try {
			Employee new2 = new SalesEmployee(23);
			fail("Failed attempt. Employee Id must be between 1000 and 9999: " + new2.getemployeeId());
		}
		catch(IllegalArgumentException err) {
			assertEquals("Invalid Employee Id. Try again", err.getMessage());
		}
		}

	

}
