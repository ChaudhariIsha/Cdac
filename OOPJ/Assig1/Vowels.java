import java.util.*;
class Vowels{
 public static void main(String args[]){
    
	Scanner scn = new Scanner(System.in);
	
    System.out.println("Enter the Character:");
	char c = scn.next().charAt(0);
	
	if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c == 'I' ||c == 'O' || c == 'U' ){
	   System.out.println(c+" is a vowel.");
	   
	}
  else{
    System.out.println(c+"is a consonant");}
  
 
 
 }}