import java.util.*;
class LeapLog{
 public static void main(String args[]){
  
   Scanner scn = new Scanner(System.in);
   
   System.out.println("Enter the year: ");
     int a = scn.nextInt();
     

    String s = (a%4 == 0 && a%100 != 0) || (a%400) ? a+" is Leap year : a+" is not a Leap year;
	
	 
	 
	  System.out.println(s);

}} 