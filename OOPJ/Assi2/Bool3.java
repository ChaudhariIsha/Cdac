import java.util.*;
class Bool3{
 public static void main(String args[]){
  
   Scanner scn = new Scanner(System.in);
  
     boolean a = scn.nextBoolean();
	 boolean b = scn.nextBoolean();
	 boolean c = scn.nextBoolean();
     

    String s = (a &&b )||(a && c) || (b && c) ? "2 true 1 false": " 1 true 2 false";
	
	 
	 
	  System.out.println(s);

}} 