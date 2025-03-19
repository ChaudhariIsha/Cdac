import java.util.*;
class Cmdargs{
 public static void main(String args[]){
  
   String s = args[0];
    
	int a = Integer.parseInt(s);
   
   String res = (a%2==0)? "is Even" : "is Odd";
   System.out.println(a +" "+res);
 }}