public class IncorrectWhileLoopControl{
public static void main(String[] args) {
int num = 10;
while (num = 10) {
System.out.println(num);
num--;
}
}
}
/* while loop take boolean as argument therefore loop is not excuted error show incompatible type*/