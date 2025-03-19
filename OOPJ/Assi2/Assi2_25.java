import java.util.*;
class Assi2_25{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
   int rev =0;
  System.out.println("Enter a number");
   int a = scn.nextInt();
   
   while(a != 0){
	   rev = rev * 10 + a % 10; 
	
		a /= 10;
   }
    System.out.println("Reverse: "+rev);
    
  
 
 }}