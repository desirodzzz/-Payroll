package edu.uprb.company;

/**
 * This is the class HourlyEmployee that extends Employee abstract class
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * @author Desiree Rodriguez Rivera 841-19-2316
 * Prof. Juan M Solá Sloan
 * @version 1.0
 *
 */

public class HourlyEmployee extends Employee {
	
	/**
	 *  This is the hours worked by the employee
	 */
	
	public int hoursWorked;
	
	/**
	 * This is the pay rate of the employee
	 */
	
	public double payRate;
	
	/**
	 * This is a constructor that only receives the Employee Id via the super class Employee extension
	 * @param id 
	 */
	
	public HourlyEmployee(int id) {
		super(id);
		hoursWorked = 40;
		payRate = 10.00; 
	}
	
	/**
	 * This is a fully parameterized constructor extended via the super clas Employee
	 * @param id 
	 * @param firstName 
	 * @param lastName 
	 * @param department 
	 * @param hoursWorked 
	 * @param payRate 
	 */
	
	public HourlyEmployee( int id, String firstName, String lastName, Department department,
			int hoursWorked, double payRate) {
		
		super(id, firstName, lastName, department);
		sethoursWorked(hoursWorked);
		setpayRate(payRate);
	}
	
	/**
	 * Returns the hours worked by the employee
	 * @return returns hours worked (hoursWorked)
	 */
	
	public int gethoursWorked() {
		
		return hoursWorked; 
	} 
	
	/**
	 * Returns the employee's pay rate
	 * @return returns pay rate(payRate)
	 */
	
	public double getpayRate() {
		
		return payRate;
	}
	
	/**
	 * Sets the hours worked by the employee
	 * The employees worked hours bust be between 0 and 60
	 * @param hoursWorked set hoursWorked
	 */
	
	public void sethoursWorked(int hoursWorked) {
		if (hoursWorked < 0 || hoursWorked > 60)
			throw new IllegalArgumentException("Invalid worked hours. Try Again");
		this.hoursWorked = hoursWorked;
	}
	
	/**
	 * Sets the pay rate of the employee
	 * The pay rate must be between 7.00 and 50.00
	 * @param payRate set payRate
	 */
	
	public void setpayRate(double payRate) {
		if(payRate < 7.00 || payRate > 50.00)
			throw new IllegalArgumentException("Invalid Pay Rate. Try Again");
		this.payRate = payRate; 
		
	}
	
	/**
	 * The weekly salary method. Calculates the weekly salary
	 *  that of the hourly employee as the product of the hours worked and the pay rate. 
	 *   If the number of hours worked is greater than 40, an overtime rate of 1.5 should be applied.
	 *   @return return weekly salary
	 */
	
	public double weeklySalary() {
		double wesalary = 0;
		int overtime = 40;
		
		if( hoursWorked > 40)
			wesalary = (overtime * payRate) + (payRate * 1.5 * (hoursWorked - 40));
		else
			wesalary = hoursWorked * payRate;
		return wesalary;
	}
	
	/**
	 * Returns the string representation of employee's information plus the hours worked , pay rate
	 *  and weekly salary of the employee.
	 * @returns the string representation of the employee's information and hours worked, pay rate 
	 * and weekly salary
	 */
	
	@Override
	public String toString() {
		return super.toString() +"Hours worked: " + hoursWorked + "\n" + "Pay rate: " +
				payRate+ "\n" + "Weekly salary: " + weeklySalary();
	}
	
	
	
	
	
	
	
	

	
}
