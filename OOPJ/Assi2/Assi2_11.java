import java.util.*;
class Assi2_11{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);

   System.out.println("Enter number: ");
    int n = scn.nextInt();
  int b  = (n & (n-1));
	
	if( b== 0)
	{
		System.out.println(n+" is power of 2");
		
	}
	else{
		System.out.println(n+" is not power of 2");
	}
 }}