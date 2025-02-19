import java.util.Scanner;
class Prime {

  public static void main(String[] args) {

   Scanner scn = new Scanner(System.in);
    int num , i = 2;
    boolean flag = false;
    
  System.out.println("enter the number :");
   num = scn.nextInt();

    if (num == 0 || num == 1) {
        flag = true;
    }
    
    while (i <= num / 2) {

               if (num % i == 0) {
               flag = true;
                break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}