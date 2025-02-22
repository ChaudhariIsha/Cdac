class Largestno{
public static void main(String args[])
{
 int no=4825 , l=0 ;
while (no> 0) {
            int digit = no % 10; 
            if (digit > l) {
                l = digit; 
            }
            no = no / 10; 
        }
     System.out.println(l);



}}