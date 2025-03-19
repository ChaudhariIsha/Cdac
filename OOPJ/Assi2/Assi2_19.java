import java.util.*;
class Assi2_19{
 public static void main(String args[]){
 
  Scanner scn = new Scanner(System.in);
  
  System.out.println("Enter Character");
   char c = scn.next().charAt(0);
   
  String s = Character.isUpperCase(c)? c+" is Uppercase" : c+" is Lowercase";
  System.out.println(s);
 
 }}