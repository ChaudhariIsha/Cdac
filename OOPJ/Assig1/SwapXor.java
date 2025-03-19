import java.util.*;
class SwapXor{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
   
   System.out.println("Enter two number:");
   
   int x = scn.nextInt(); 
   int y = scn.nextInt();
   
   System.out.println("Before Swapping:");
   System.out.println("x = "+x);
   System.out.println("y = "+y);
   
   x = x^y;
   y = x^y;
   x = x^y;
   
   System.out.println("Afer Swapping:");
   System.out.println("x = "+x);
   System.out.println("y = "+y);
   
  
 }}