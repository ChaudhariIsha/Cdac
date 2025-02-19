import java.util.Scanner;
class Reverse{
           public static void main(String args[]){
 Scanner scn = new Scanner(System.in);
  int  num , rev=0, rem ;

 System.out.println("Enter the number : ");
    num = scn.nextInt();
 
 while(num>0)
{
   rem = num %10 ;
   rev = (rev*10)+rem;
   num =num /10 ;
}

 System.out.println("Reverse number is :"+rev);
}}
 
