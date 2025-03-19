import java.util.*;
class Assi2_22{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter a number");
   int a = scn.nextInt();
   int b = scn.nextInt();
  System.out.println("Which operation do you want to perform + - / %"); 
   char s = scn.next().charAt(0);
   
    switch(s){
		
		case '+' :
		           System.out.println(a+b);
				   break;
		case '-' :
		           System.out.println(a-b);
				   break;
		case '*' :
		           System.out.println(a*b);
				   break;
		case '%' :
		           System.out.println(a%b);
				   break;
		case '/' :
		           System.out.println(a/b);
				   break;
        default :
		         System.out.println("Sorry ");
				   break;
 		
	}
   
   
   
  }}