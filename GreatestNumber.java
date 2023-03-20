class GreatestNumber{
public static void main(String args[])
{
int a=10,b=20,c=30;
 if (a > b) // this condition is false so control goes  to the else block
 {
          	 if (a > c)
 	 {
    	      System.out.println("a is greater " +a);
                  }
	    else
                 {
                       System.out.println(" c is greater" +c);
                  }
}
else
{            
                   if(b>c)   // condtion is false so it execute the else block
                {
   	         System.out.println(" b is greater"+b);
                  }
	else
	{
	       System.out.println(" c is greater...."+c);	
	}	
 }
}
}
