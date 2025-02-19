import java.util.Scanner;
class Count{
public static void main(String args[]){

Scanner scn = new Scanner(System.in);
 int  a ,count= 0 , i  ;

 
System.out.println("Enter the number ");
   a = scn.nextInt(); 
  
 while(a!=0){
   a = a/10;
      count++;
   }
System.out.println("Digit in number:" + count);

}}