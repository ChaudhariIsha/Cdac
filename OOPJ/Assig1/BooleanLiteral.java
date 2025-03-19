import java.util.*;
class BooleanLiteral{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter true or false");
  boolean t = scn.nextBoolean();
 
  
  if(t == true){
  System.out.println("if condition is for boolean true literal.");}
  
  if(t == false){
  System.out.println("if condition is for boolean false literal.");}
 
 }}