import java.util.Scanner;
class Ctof{
public static void main(String args[]){

Scanner scn = new Scanner(System.in);
 int c;
double f  ;
 
System.out.println("Enter the temperature in Celsius: ");
   c = scn.nextInt(); 
 
  f = (c*9/5)+32 ;
 
 System.out.println(c +"C is equals to"+ f +"f" );
}}