import java.util.*;
class Assi2_23{
 public static void main(String args[]){
 
 
  Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter a number");
   int a = scn.nextInt();
   int b = a & 1;
    
  String s = b==0? "Even" : "odd";
  System.out.println(s);
  
		
 
 }}