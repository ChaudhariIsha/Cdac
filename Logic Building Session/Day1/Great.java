import java.util.Scanner;
class Great{
public static void main(String args[]){
 
 Scanner scn = new Scanner(System.in);
 int a , b, c ;
  
 System.out.println("Enter the three number:");
   a = scn.nextInt();
   b = scn.nextInt();
   c = scn.nextInt();

 if(a>b){
        if(c>a){
            System.out.println("The greatest number is :"+ c);}
         else {
          System.out.println("The greatest number is :"+ a);}
        }
else {
       if(b>a){
               if(c>b){
                System.out.println("The greatest number is :"+c);}

             else {
                 System.out.println("The greatest number is :"+b);}
    
  }}
















}}