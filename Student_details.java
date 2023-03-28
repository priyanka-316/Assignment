package Class_Assignment;

public class Student_details {


		String name= "Ram", name1 = "Riya", name2 = "Neha";
		
		int age= 10,age1=15,age2=11;
		
		String add= "Soalpur",add1 = "Pune", add2= "Mumbai1";
			
		public static void main(String[] args) {
			

				Student_details  obj = new Student_details() ;
		
				// accesssing feild with the help of ref variable object
				
		            System.out.println(obj.name +"  " +obj.age+" "+obj.add); 
		            
		            System.out.println(obj.name1 +"  " +obj.age1+" "+obj.add1); 
		            
		            System.out.println(obj.name2 +"  " +obj.age2+" "+obj.add2); 
		           
		           
	}

}
