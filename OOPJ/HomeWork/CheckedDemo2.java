import java.io.*;

class CheckedDemo2{
	public static void main(String args[]){
		File f = new File("abc.txt");
	
	try{
     FileReader fr = new FileReader(f); // checked exception
	}catch(FileNotFoundException e){
		System.out.println("File not exists..!");
	}
	}
		
}
