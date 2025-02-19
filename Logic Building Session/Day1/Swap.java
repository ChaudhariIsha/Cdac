import java.util.Scanner;
class Swap{
public static void main(String args[]){
    
Scanner scn = new Scanner(System.in);
int a, b;

System.out.println("Enter first number");
  a = scn.nextInt();
 
System.out.println("Enter second number");
  b = scn.nextInt();

System.out.println("Before Swap");

 System.out.println("a :"+a);
 System.out.println("b: "+b);


 a = a + b ;
 b = a - b;
 a = a - b ;
  
System.out.println("Afer Swap");
System.out.println("a :"+a);
System.out.println("b :"+b);









}}