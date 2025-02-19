import java.util.Scanner;
class Avg{
public static void main(String args[]){

 Scanner scn = new Scanner(System.in);
  int a , b , c;
   double av;


 System.out.println("Enter the three number:");
   a = scn.nextInt();
   b = scn.nextInt();
   c = scn.nextInt();
   
   av = (a+b+c) / 3 ;
System.out.println("Average is:"+av);


}}
