public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <=5 );
}
}
/* we need to change num-- to num++ oor change to num greater than o to num smaller than equals to 5 to print 1  to 5*/