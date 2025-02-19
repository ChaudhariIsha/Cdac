import java.util.Scanner;
class Cal{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  char op;
  double a , b;

 System.out.println("Enter the operands:");
    a = scn.nextDouble();
    b = scn.nextDouble();
 System.out.println("Enter the operator + - * / :");
    op=scn.next().charAt(0);

switch(op){

 case '+':
          System.out.println(a+b);
          break;

 case'-': 
          System.out.println(a-b);
           break;
 case'*':
          System.out.println(a*b);
           break;
 case'/': 
          System.out.println(a/b);
           break;
}
}};