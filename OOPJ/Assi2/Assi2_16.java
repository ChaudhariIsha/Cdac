import java.util.*;
class Assi2_16{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter a number ");
   int n = scn.nextInt();
   
  String s = n<0 ? n+" is negative" : n+" is Positive";
  System.out.println(s);
 
 }}