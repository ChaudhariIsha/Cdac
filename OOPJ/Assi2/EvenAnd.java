import java.util.*;
class EvenAnd{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  int a = scn.nextInt();
  
  int b = a&1;
 String s = b == 0 ? "Even" : "Odd";
 
   System.out.println(s);
 }}