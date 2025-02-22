public class UninitializedWhileLoop {
public static void main(String[] args) {
int count;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
/* Because while loop take boolean as argument therefore we need to initialize the loop*/