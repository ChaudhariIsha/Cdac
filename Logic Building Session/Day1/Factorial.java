import java.util.Scanner;
class Factorial{
public static void main(String args[]){

Scanner scn = new Scanner(System.in);
 int a , i , n =1;
 
System.out.println("Enter the number ");
   a = scn.nextInt();
 
 for(i=1;i<=a;i++){
      
        n = n*i;}

System.out.println(" Factorial is:"+n);
}}