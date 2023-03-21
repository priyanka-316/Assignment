class Primenumber{
public static void main(String args[]){
int num = 23;
boolean flag = false;
for(int i=2; i<=num/2;++i) 
{
// Condition for non prime number

 if(num%i==0)
{
flag=true;
break;
}
}
 if(!flag)
System.out.println(num +"is prime");
else
System.out.println(num +"is not prime");
}
}