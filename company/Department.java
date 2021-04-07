package edu.uprb.company;

/**
 * This is the enum class Department
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * @author Desiree Rodriguez Rivera 841-19-2316
 * Prof. Juan M Solá Sloan
 * @version 1.0
 *
 */

public enum Department {
	/** This is the Sales department*/
		SALES,
		/** This is the Marketing department*/
		MKTG,
		/** This is the Human Resources department*/
		HMRS,
		/** This is the Finance department */
		FINA,
		/** This is the Information Technology */
		INTE;
	
	/** This is the string representation of this department
	 * @return the string representation for this department 
	 */
	
		
	@Override
		public String toString() {
			switch(this) {
			case SALES: return "Sales";
			case MKTG: return "Marketing";
			case HMRS: return "Human Resources";
			case FINA: return "Finance";
			case INTE: return "Information Tecnology";
				default: return "Unknown Department"; 
			
			
			}
		}


}
