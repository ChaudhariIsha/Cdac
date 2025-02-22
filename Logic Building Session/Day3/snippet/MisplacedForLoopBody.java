public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}
/* because for loop doesnot have body i mean for loop sta	tment is not in {}*/
