import java.util.Scanner;
class Power{
public static void main(String args[]){

Scanner scn = new Scanner(System.in);
 int  a ,b  ;
double r = 1;
 
System.out.println("Enter the number ");
   a = scn.nextInt(); 

 System.out.println("Enter the Exponent number");
   b = scn.nextInt();
 
 while( b!=0)
{
   r = r * a;
   --b; 
} 
System.out.println(r);
}}