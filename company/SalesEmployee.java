package edu.uprb.company;

public class SalesEmployee extends Employee {
	
	public double salesAmount;
	
	public double commissionRate; 
	
	public SalesEmployee(int id) {
		super (id);
		salesAmount = 0.00;
		commissionRate = 0.10;
	}
	
	public SalesEmployee(int id,  String firstName, String lastName, Department department,
			double salesAmount, double commissionRate) {
			
		super (id, firstName,lastName,department); 
		setsalesAmount(salesAmount);
		setcommissionRate(commissionRate);
	}
	
	public double getsalesAmount() {
		
		return salesAmount;
	}
	
	public double getcommissionRate() {
		
		return commissionRate;
	}
	
	public void setsalesAmount(double salesAmount) {
		 if (salesAmount < 0.00)
			 throw new IllegalArgumentException("Invalid Sales amount. Try again");
		 
			 this.salesAmount = salesAmount;
	}
	
	public void setcommissionRate(double commissionRate) {
		if (commissionRate > 1.00 || commissionRate < 0.00)
			throw new IllegalArgumentException("Invalid Commission rate. Try again");
		
		this.commissionRate = commissionRate;
		
	}
	
	public double weeklySalary() {
		double tsales = salesAmount * commissionRate;
		return tsales;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Sales amount: " + salesAmount + "\n" +
		"Commission rate: " + commissionRate + "\n" + "Weekly salary(sales and commission included): " + weeklySalary(); 
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
