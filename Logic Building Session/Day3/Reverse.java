
class Reverse{
           public static void main(String args[]){

  int  num = 12345 , rev=0, rem ;

  System.out.println("Nsumber is :"+num);
 
 while(num>0)
{
   rem = num %10 ;
   rev = (rev*10)+rem;
   num =num /10 ;
}

 System.out.println("Reverse number is :"+rev);
}}
 
