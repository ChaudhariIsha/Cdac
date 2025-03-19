import java.util.*;
class SwapBit{

 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter two numbers:");
  int a = scn.nextInt();
  int b = scn.nextInt();
  
  System.out.println("Before Swapping:");
  System.out.println("a = "+a);
  System.out.println("b = "+b);

       a +=b;
	   b = a-b;
	   a -=b;


  
  System.out.println("Afer Swapping:");
  System.out.println("a = "+a);
  System.out.println("b = "+b);
 }}