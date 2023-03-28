package Class_Assignment;
import java.util.Scanner;
public class Sum_and_Average {
	
	  public static void sum_avg(int num, int num1,int num2)
	  {
	  int sum=(num+num1+num2);
	  System.out.println("Sum is:- " +sum);
	  float avg=sum/3;
	  System.out.println("Average is:- " +avg);
	  
	  }
		
		  public static void main(String args[]) 
		  
		 {
			 
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter numbers:-");
			  int num = sc.nextInt();
			  int num1=sc.nextInt();
			  int num2=sc.nextInt();
			  sum_avg(num,num1,num2);
			  
		   
		 
	}


		  }

