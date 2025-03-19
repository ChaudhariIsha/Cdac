import java.util.*;
class Bool3{
 public static void main(String args[]){
  
   Scanner scn = new Scanner(System.in);
  
     boolean a = scn.nextBoolean();
	 boolean b = scn.nextBoolean();
	 boolean c = scn.nextBoolean();
     

    String s = (a && b || c) ? "2 true 1 false": a+" 1 true 2 false";
	
	 
	 
	  System.out.println(s);

}} 