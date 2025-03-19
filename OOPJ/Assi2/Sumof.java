import java.util.*;
class Sumof{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter a number");
  int a = scn.nextInt();
  int sum=0;
  
  while(a != 0){
  
   int res = a%10;
   
   sum +=res;
   
    a = a/10;
  
  }
  System.out.println("Sum of Digits: "+sum);
 
 
 }}