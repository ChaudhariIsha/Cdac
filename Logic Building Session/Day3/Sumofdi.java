class Sumofdi{
public static void main(String args[]){
  int sum=0 , no = 9876;
 
        while (no > 0) {
            sum = sum +no % 10;  
            no = no / 10;  
        }

    System.out.println(sum);


}}