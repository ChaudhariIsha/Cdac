import java.util.Scanner;
class Mark{
public static void main(String args[]){

 Scanner scn = new Scanner(System.in);
 int m ;
  
 System.out.println("Enter the marks");
  m = scn.nextInt();

 if(m<60)
{ 
   System.out.println("Grade F");
}
else if(m>=60 && m<=69) 
{
  System.out.println("Grade D");}

 else if(m>=70 && m<=79) 
{
  System.out.println("Grade C");}
  
else if(m>=80 && m<= 89)
{
  System.out.println("Grade B");}

else{
 System.out.println("Grade A");}



}}