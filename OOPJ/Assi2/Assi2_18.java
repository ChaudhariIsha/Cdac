import java.util.*;
class Assi2_18{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter Percentage");
   int n = scn.nextInt();
   
  String s = n>=40? n+" Pass" : n+" Fail";
  System.out.println(s);
 
 }}