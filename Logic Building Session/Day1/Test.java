import java.util.Scanner;
class Test{
public static void main(String args[])
{
  int a , b ,sum , mul , sub ,div, mod;

   Scanner scn = new Scanner(System.in);
    
   System.out.println("Enter first number");
     a =scn.nextInt();
   System.out.println("Enter second number");
     b = scn.nextInt();
 
     sum = a+b;
     mul = a*b;
     sub = a-b;
     div = a/b;
     mod = a%b;

 System.out.println("Addition is\t"+sum);
 System.out.println("Substraction is\t"+sub);
 System.out.println("Multication is\t"+mul);
 System.out.println("Division is\t"+div);
 System.out.println("Modulo is\t"+mod);
  

}}