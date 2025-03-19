import java.util.*;
class Example{
 public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 
	 int a = scn.nextInt();
	 int b = scn.nextInt();
	 
	 try{
		 int k = a/b;
		 System.out.println(k);
		 
	 }catch(InputMismatchException e){
		 System.out.println("InputMismatchException");
	 }
 }

}