import java.util.*;
class Assi2_17{
 public static void main(String args[]){
 
 Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter 4 numbers: ");
   int a = scn.nextInt();
   int b = scn.nextInt();
   int c = scn.nextInt();
   int d = scn.nextInt();

  int min = (a < b ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) 
                         : (b < c ? (b < d ? b : d) : (c < d ? c : d)));
   System.out.println("Minimum is: "+min);
 
 
 
  
 
 }}