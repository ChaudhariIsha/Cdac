import java.util.Scanner;

class Check{
public static void main(String args[]){

Scanner scn = new Scanner(System.in);
  int a;
 
System.out.println("Enter the number");
   a = scn.nextInt();

if(a % 2 == 0){
System.out.println("The number" + a +" is Even");
}
else
{
System.out.println("The number"+ a + " is Odd");
};
}}