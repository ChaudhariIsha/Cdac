public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count = 0) {
System.out.println(count);
count--;
}
}
}
/* Because while loop take boolean as argument we want to change count ==0*/