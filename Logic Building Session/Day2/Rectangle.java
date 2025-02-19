import java.util.Scanner;
class Rectangle{
public static void main(String args[]){
 
 Scanner scn = new Scanner(System.in);
 double l , w , area;
   
 System.out.println("Enter length :");
     l = scn.nextDouble();
 System.out.println("Enter width :");
     w = scn.nextDouble();

 area = l*w ;
 System.out.println("Area is:" + area);
}}