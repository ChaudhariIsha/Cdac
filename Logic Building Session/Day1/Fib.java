import java.util.Scanner;
class Fib{
public static void main(String args[]){

 Scanner scn = new Scanner(System.in);
  int a = 0, b = 1 , c,  n ;

System.out.println("Enter the number:");
  n = scn.nextInt();
 
    System.out.println(a);
    System.out.println(b);

 
 for(int i=0;i<10; i++)
  { 
         c = a + b ;
    System.out.println(c);
       a = b;
       b = c ;
   }
}}