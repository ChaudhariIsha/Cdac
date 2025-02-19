import java.util.Scanner;
class Dis{
public static void main(String args[]){ 

 Scanner scn = new Scanner(System.in);
 double amt , dis;
  boolean s;
  System.out.println("You have membership card True/false:");
      s = scn.nextBoolean();
 System.out.println("Enter the amount:");
  amt = scn.nextDouble(); 



  if(amt>0 && amt<=499){
             
             if(s==true){ 
                   dis = (amt*20)/100;
                   amt = amt - dis ;
                    System.out.println(amt);}
 
            else{          
            dis = (amt*5)/100;
            amt = amt - dis ;
            System.out.println(amt);}
                }
 else if(amt>=500 && amt<= 999){

                  if(s==true){ 
                              dis = (amt*35)/100;
                              amt = amt - dis ;
                              System.out.println(amt);}
              else{
                         dis = (amt*10)/100;
                        amt = amt - dis ;
                       System.out.println(amt);}
   
                 }
 else {
             if(s==true){ 
                   dis = (amt*40)/100;
                   amt = amt - dis ;
                    System.out.println(amt);}
           else{
            dis = (amt*20)/100;
            amt = amt - dis ;
            System.out.println(amt);}
      
     }


}}