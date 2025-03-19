import java.util.*;
class Assi3_4{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  
  int a[]=new int[5];
  int Ecount=0;
  int Ocount=0;
  System.out.println("Enter the element: ");
  
  for(int b=0;b<5;b++){
     a[b]=scn.nextInt();
  }
  
  for(int i=0; i<5; i++){
  
    int c = a[i]%2==0? Ecount++ : Ocount++ ;
	
  }
  
  System.out.println("Even: "+Ecount+"\n Odd: "+Ocount);
  
  
  
  
  }}