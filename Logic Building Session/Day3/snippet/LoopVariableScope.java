public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x); // Error: 'x' is not accessible here
}
}
/* x is declare in for loop so we don't access out loop*/