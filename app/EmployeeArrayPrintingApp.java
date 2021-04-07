package edu.uprb.app;

import edu.uprb.company.Department;
import edu.uprb.company.Employee;
import edu.uprb.company.HourlyEmployee;
import edu.uprb.company.SalesEmployee;


import edu.uprb.company.Employee;
import edu.uprb.company.HourlyEmployee;
import edu.uprb.company.SalesEmployee; 

public class EmployeeArrayPrintingApp {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] expemployees = {
				new HourlyEmployee(4206, "Richard", "Watterson", Department.HMRS, 35,8.50),
				new SalesEmployee(3030,"Eric","Lopez", Department.MKTG,5500, 0.40 ),
				new HourlyEmployee(9614,"Wanda", "Vision", Department.INTE,60, 15.00),
				new SalesEmployee(6588, "Abel", "Tesfaye", Department.SALES,300, 0.11),
				new HourlyEmployee(2201, "Natalia", "Matias", Department.FINA, 25, 9.00)
        };

        System.out.println("Top Employees ");
        for (Employee femp :expemployees) {  
            System.out.println("type: " + femp.getClass());
            System.out.println(femp);
            System.out.println("");

        }

    }

}

		
		
	


	
	

