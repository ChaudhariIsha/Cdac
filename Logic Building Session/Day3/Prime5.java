class Prime5{
public static void main(String args[]){

        int count = 0;  
        int i = 2, num = 2;            


        while (count < 5) {
            if (num % i==0 ) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    
  
}}