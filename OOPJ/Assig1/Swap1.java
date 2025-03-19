import java.util.*;
class Swap1{
 public static void main(String args[]){
   
   Scanner scn = new Scanner(System.in);
    int a, b, c =0;
	
	System.out.println("Enter the two numbers:");
	 a = scn.nextInt();
	 b = scn.nextInt();
	 System.out.println("Before Swapping:");
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	  //a=5 b=9 c=0
	  
	 c = a; //c =5
	 a = b ;//a=9
	 b = c ;// b=5
	 
	 
	 System.out.println("Afer Swapping:");
      System.out.println("a="+a);
	  System.out.println("b="+b);
 }}