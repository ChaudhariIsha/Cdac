import java.util.*;
class Swap2{
 public static void main(String args[]){
  
  Scanner scn = new Scanner(System.in);
  int a = scn.nextInt();
  int b = scn.nextInt();
  
  System.out.println("Before Swapping");
  System.out.println("a ="+a);
  System.out.println("b ="+b);
  
  a = a + b;
  b = a - b;
  a = a - b;  
  
  System.out.println("Afer  Swapping");
   System.out.println("a ="+a);
   System.out.println("b ="+b); 
 
 
 }}