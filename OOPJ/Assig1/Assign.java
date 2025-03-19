import java.util.*;
class Assign{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter  number :"); 
   
    int a = 12;
	int b = 8;
	int c =4 ;
	int d =10;
	int e = 12;
	
	System.out.println("Number are a="+ a +" b= "+b+" c="+c +" d="+d+" e="+e);
	System.out.println("Number is Assign to a "+a);
	a += a;
	System.out.println("For += value of a is "+ a);
	b -= b;
	System.out.println("For -= value of a is "+ b);
	
	c *= c;
   System.out.println("For *= value of a is "+ c); 
   d /= d;
   System.out.println("For /= value of a is "+ d);
   e %= e;
   System.out.println("For %= value of a is "+ e);
	
 
 
 }}