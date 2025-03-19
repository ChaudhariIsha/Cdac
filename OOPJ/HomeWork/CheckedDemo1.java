import java.io.*;

class CheckedDemo1{
	public static void main(String args[])throws IOException{
		
		System.out.println("Enetr a character");
		int j = System.in.read();
		System.out.println("Enter char = "+ (char)j);
	}
}
