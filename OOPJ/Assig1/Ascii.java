import java.util.*;
class Ascii{
 public static void main(String args[]){
 
     Scanner scn = new Scanner(System.in); 
	 
     System.out.print("Enter a character: ");
        char c = scn.next().charAt(0);
        System.out.println("Character: " + c + "  ASCII Value: " + (int) c);

        
        System.out.print("Enter a string: ");
        scn.nextLine();  
        String str = scn.nextLine();
		
        System.out.println("String: " + str);
		
        for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
            System.out.println("Character: " + ch + "  ASCII Value: " + (int)ch);
        }
 
 }}