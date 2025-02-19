import java.util.Scanner;
class Cir{
public static void main(String args[]){

 int a;
double pi = 3.142 , area;
 
Scanner scn = new Scanner(System.in);

System.out.println("Enter radius of circle");
 a = scn.nextInt();

area = pi*a*a;
System.out.println("Area of circle is :"+area );



}}