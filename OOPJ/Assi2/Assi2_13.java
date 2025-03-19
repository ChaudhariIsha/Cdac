import java.util.*;
class Assi2_13{
 public static void main(String args[]){
 
   Scanner scn = new Scanner(System.in);
   System.out.println("Enter number: ");
    int n = scn.nextInt();
	
	int mask = n >> 31;
	int abs = (n + mask) ^ mask;
	
	  System.out.println("Absolute value: "+abs);
   }}