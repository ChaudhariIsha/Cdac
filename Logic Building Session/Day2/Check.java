import java.util.Scanner;
class Check{
           public static void main(String args[]){
 Scanner scn = new Scanner(System.in);
  double num;
 System.out.println("Enter the number : ");
    num = scn.nextDouble();
 
 if(num<=0.0){
      if(num==0.0){
          System.out.println("Number is 0.0 ");
               }
       else{
        System.out.println("Number is Negative ");
            }

          }
else{
 System.out.println("Number is poisitive ");
}
}}