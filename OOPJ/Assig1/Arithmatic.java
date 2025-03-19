import java.util.*;
class Arithmatic{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  
  int a , b ;
  System.out.println("Enter two numbers: ");
   a = scn.nextInt();
   b = scn.nextInt();
   
   int add = a+b;
   int sub = a-b;
   int mul = a*b;
   int div = a/b;
   int mod = a%b;
   
   System.out.println("Addition is:"+add);
   System.out.println("Substraction is:"+sub);
   System.out.println("Multiplication is:"+mul);
   System.out.println("Division is:"+div);
   System.out.println("Modulus is:"+mod);
 
 
 
 
 }}