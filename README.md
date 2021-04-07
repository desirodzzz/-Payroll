# -Payroll
Payroll program for the course SICI 4036: Data Structure

Full instructions for the asignment: 

Requirements for an Employee Class Hierarchy:
1. In package edu.uprb.company place an enumerated type named Department with the following values and corresponding toString method:
•	SALE – for Sales
•	MKTG – for Marketing
•	HMRS – for Human Resources
•	FINA – for Finance
•	INTE – for Information Technology

2. In package edu.uprb.company place an abstract class named Employee that holds the following data for a company employee:
•	employeeId – an integer between 1000 and 9999.  This should be a final field.
•	firstName – a string with one uppercase letter and, at most, nine more lowercase letters.
•	lastName – a string with one uppercase letter and, at most, nine more lowercase letters.
•	department – a Department.

This class must have the following methods:
•	A fully parameterized constructor and a constructor that receives only the employee ID.  
•	Setters and getters for each field.  Since the employee ID is final, only a getter must be provided for this field.
•	Constructors and setters must not allow an invalid ID value or an invalid name format by throwing an IllegalArgumentException with the appropriate message.
•	A weeklySalary abstract method that, when implemented by a subclass, returns the weekly salary of the employee.
•	An equals methods that allow comparison based only on the employee ID.
•	A toString method that returns a string representation of the employee.  Each field should have the appropriate label and format.

3. In package edu.uprb.company place a class named HourlyEmployee that extends the Employee class and holds the following additional data:
•	hoursWorked during the week – an integer between 0 and 60; default value = 40
•	payRate – a double floating-point number between 7.00 and 50.00; default value = 10.00
This class must have the following methods:
•	A fully parameterized constructor and a constructor that receives only the employee ID.  The superclass constructor must be called when appropriate.  
•	Setters and getters for each field.
•	The constructor and setters must not allow an invalid number of hours or an invalid pay rate by throwing an IllegalArgumentException with the appropriate message.
•	A weeklySalary method that returns the weekly salary of the hourly employee as the product of the hours worked and the pay rate.  If the number of hours worked is greater than 40, an overtime rate of 1.5 should be applied.
•	A toString method that returns a string representation of the hourly employee by calling the superclass method and concatenating the new fields with the appropriate labels and format.

4. (15 points) In package edu.uprb.company place a class named SalesEmployee that extends the Employee class and holds the following data:
•	salesAmount – a double floating-point number >= 0.00; default value = 0.00
•	commissionRate – a double floating-point number between 0.00 and 1.00; default value = 0.10

This class must have the following methods:
•	A fully parameterized constructor and a constructor that receives only the employee ID.  The superclass constructor must be called when appropriate.  
•	Setters and getters for each field.
•	The constructor and setters must not allow an invalid sales amount or an invalid commission rate by throwing an IllegalArgumentException with the appropriate message.
•	A weeklySalary method that returns the weekly salary of the sales employee as the product of the sales amount and the commission rate.
•	A toString method that returns a string representation of the sales employee by calling the superclass method and concatenating the new fields with the appropriate labels and format.

5. In package edu.uprb.app place an application EmployeeArrayPrintingApp that creates an array of at least five employees of different classes and displays their data with the appropriate format, including their weekly salary.
6. In package edu.uprb.test place the JUnit test classes for each concrete employee subclass.  These will be called HourlyEmployeeTest and SalesEmployeeTest. Follow the supplied test plans.

5. Include the UML class diagram generated using ObjectAid UML Explorer in png format.
Test Plan for Hourly Employees
1.	Create the main testing hourly employee using the fully parameterized constructor and with the following data:
a.	Employee Id: 1000
b.	First Name: John
c.	Last Name: Doe
d.	Department: Finance
e.	Hours Worked: 40
f.	Pay Rate: $7.50
2.	Test that this employee has the expected string representation.
3.	Test that this employee has the expected id.
4.	Test that this employee has the expected first name.
5.	Test that this employee has the expected last name.
6.	Test that this employee has the expected department.
7.	Test that this employee has the expected hours worked.
8.	Test that this employee has the expected pay rate.
9.	Test that the weekly salary for this employee is computed as expected.
10.	Test that this employee is equal to itself.
11.	Test that this employee is equal to a copy.
12.	Test that this employee is not equal to a different one.
13.	Test that the first name of this employee can be changed with a valid value.
14.	Test that the first name of this employee cannot be set to an invalid value.
15.	Test that the last name of this employee can be changed with a valid value.
16.	Test that the last name of this employee cannot be set to an invalid value.
17.	Test that the number of hours worked of this employee can be changed with a valid value.
18.	Test that the number of hours worked of this employee cannot be set to an invalid value.
19.	Test that the pay rate of this employee can be changed with a valid value.
20.	Test that the pay rate of this employee cannot be set to an invalid value.
21.	Create a new employee with overtime and test that this employee has the expected string representation and weekly salary.
22.	Create a new employee with the constructor that only receives the id and test that this employee has the expected string representation and weekly salary.
23.	Test that a new employee with an invalid id cannot be created.
Test Plan for Sales Employees
1.	Create the main testing sales employee using the fully parameterized constructor and with the following data:
a.	Employee Id: 2000
b.	First Name: Jane
c.	Last Name: Doe
d.	Department: Sales
e.	Sales Amount: $4,000.00
f.	Commission Rate: 12.5%
2.	Test that this employee has the expected string representation.
3.	Test that this employee has the expected id.
4.	Test that this employee has the expected first name.
5.	Test that this employee has the expected last name.
6.	Test that this employee has the expected department.
7.	Test that this employee has the expected sales amount.
8.	Test that this employee has the expected commission rate.
9.	Test that the weekly salary for this employee is computed as expected.
10.	Test that this employee is equal to itself.
11.	Test that this employee is equal to a copy.
12.	Test that this employee is not equal to a different one.
13.	Test that the first name of this employee can be changed with a valid value.
14.	Test that the first name of this employee cannot be set to an invalid value.
15.	Test that the last name of this employee can be changed with a valid value.
16.	Test that the last na me of this employee cannot be set to an invalid value.
17.	Test that the amount sold by this employee can be changed with a valid value.
18.	Test that the amount sold by this employee cannot be set to an invalid value.
19.	Test that the commission rate of this employee can be changed with a valid value.
20.	Test that the commission rate of this employee cannot be set to an invalid value.
21.	Create a new employee with the constructor that only receives the id and test that this employee has the expected string representation and weekly salary.
22.	Test that a new employee with an invalid id cannot be created.

