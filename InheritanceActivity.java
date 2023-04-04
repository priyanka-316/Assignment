package Inheritance;

class Employee 
{
 long employeeid;
 String employeename;
 String employeeaddress;
 long employeephone;
 double basicSalary;
 double specialAllowance=250.80;
 double Hra=1000.50;
 
 Employee(long id,String name,String address,long phone)
 {
	 this.employeeid=id;
	 this.employeename=name;
	 this.employeeaddress=address;
	 this.employeephone=phone;	 
 }
 
 void calculateSalary()
 {
	double salary;
	salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
	System.out.println("The salary is "+salary);
 }
}

class Manager extends Employee
{
	Manager(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
}

public class InheritanceActivity
{
	public static void main(String[] args) 
	{
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		m.calculateSalary();
	}
}