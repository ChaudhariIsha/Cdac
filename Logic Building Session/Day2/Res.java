import java.util.Scanner;
class Res{
public static void main(String args[]){
 Scanner scn = new Scanner(System.in);
  double m , s ,e ;
int count;
  
 System.out.println("Enter the marks :");
   m = scn.nextDouble();
   s = scn.nextDouble();
   e = scn.nextDouble();

   count=0;
  
   if(m<40){
       count++;
    }
   if(s<40){
       count++;
    }
   if(e<40){
       count++;
    }
  
 switch(count){
     case 0: 
            System.out.println("Pass..!");
            break;
     case 1: 
            System.out.println("1 Fail and 2 pass");
            break;
     case 2: 
            System.out.println("2 Fail and 1 Pass");
            break;
      default:
            System.out.println("Fail");
            break;
       }
 








 }}