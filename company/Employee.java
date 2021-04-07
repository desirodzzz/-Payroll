package edu.uprb.company;

/**
 * This is the abstract class Employee
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * @author Desiree Rodriguez Rivera 841-19-2316
 * Prof. Juan M Solá Sloan
 * @version 1.0
 *
 */

public abstract class Employee {
	
	/** This is the Employee Id*/
		final int employeeId;
		
		/** This is the first name of the employee*/
		
		public String firstName;
		
		/** This is the last name of the employee*/
		
		public String lastName; 
		
		/** This is the department where the employee works*/
		
		public Department department; 
		
		
		/**
		 * This is a fully parameterized constructor with the information of the employee
		 * @param id
		 * @param firstName
		 * @param lastName
		 * @param department
		 */
		
		public Employee(int id, String firstName, String lastName,Department department) {
			
			if(id < 1000 || id > 9999)
				throw new IllegalArgumentException("Invalid.Try again"); 
				this.employeeId = id; 
				setfirstName(firstName);
				setlastName(lastName);
				setDepartment(department);
			
			
			
		}
		
		/**
		 * A constructor that only contains the employee Id.
		 * @param id
		 */
		
		public Employee(int id) {
			
			if(id < 1000 || id > 9999)
				throw new IllegalArgumentException("Invalid Employee Id. Try again"); 
				this.employeeId = id; 
			
		}

		/**
		 * Returns the Employee Id.
		 * @return returns the Employee Id (employeeId)
		 */
		
		public int getemployeeId() {
			
			return employeeId;
		}
		
		/**
		 * Returns the employee's first name. 
		 * @return return first name (firstName)
		 */
		
		public String getfirstName() {
			
			return firstName;
			
		}
		
		/**
		 * Returns the employee's last name.
		 * @return return last name (lastName)
		 */
		
		public String getlastName() {
			
			return lastName; 
		}
		
		/**
		 * Returns the department that the employee works at.
		 * @return return department (department)
		 */
		
		public Department getdepartment() {
			
			return department;
		}
		
		/**
		 * Sets the employee's first name.
		 * The employee's first name must contain one capital letter and at least nine lowercase letters.
		 * @param firstName set first name
		 */
		
		
		public void setfirstName(String firstName) {
			int Capitol = 0;
			int lowerc = 0;
			
			char [] cl = firstName.toCharArray();
			
			for(int i = 0; i < cl.length; i++) {
				if (Character.isUpperCase(cl[i]))
					Capitol++;
				else if(Character.isLowerCase(cl[i]))
					lowerc++;
				
				if (Capitol > 1 || Capitol < 1 || lowerc > 9)
					throw new IllegalArgumentException("Invalid First name. Try again");
				
				else if(!Character.isUpperCase(cl[0]))
					throw new IllegalArgumentException("Invalid First name. Try again");
				
			}
			this.firstName = firstName;
		}
		
		/**
		 * Sets the employee's last name.
		 * The employee's last name must contain one capital letter and at least nine lowercase letters.
		 * @param lastName set last name
		 */
		
		public void setlastName(String lastName) {
			
			int Capitoll = 0;
			int lowerL = 0;
			
			char [] ln = lastName.toCharArray();
			
			for(int i = 0; i < ln.length; i++) {
				if (Character.isUpperCase(ln[i]))
					Capitoll++;
				else if(Character.isLowerCase(ln[i]))
					lowerL++;
				
				if (Capitoll > 1 || Capitoll < 1 || lowerL > 9)
					throw new IllegalArgumentException("Invalid Last name. Try again");
				
				else if(!Character.isUpperCase(ln[0]))
					throw new IllegalArgumentException("Invalid Last name. Try again");
				
			}
			
			this.lastName = lastName; 
		}
		
		/**
		 * Sets the department where the employee works at.
		 * @param department set department
		 */
		
		public void setDepartment(Department department) {
	        this.department = department;
	        }
		
		/**
		 * Return the weekly salary of the employee.
		 * @return return weekly salary
		 */
	    
		
		public abstract double weeklySalary();
		
		/**
		 * Determines whether the employee's information is equal to the information provided.
		 * @param empl the information with which to compare
		 * @return{@code true} if the information matches,
		 * 		{@code false} otherwise
		 */

		@Override
		public boolean equals (Object empl) {
			if(this == empl)
				return true;
			if (empl instanceof Employee) {
				Employee other = (Employee) empl;
				return Integer.compare(this.employeeId,  other.employeeId)== 0; 
			}
			return false;
		}
		
		/**
		 * Returns the string representation of the employee's information
		 * @returns the string representation of employee's information
		 */
		
		@Override
		public String toString() {
			
			return "Employee Id: " +  this.employeeId  + "\n" + "First name: " + this.firstName + "\n" + 
					"Last name: " + this.lastName + "\n" + "Department: " + this.department + "\n";
		}
		
		
		
		

	

}
