interface A{
	default void printA(){
		System.out.println("A interface");
}}
interface B extends A{
	default void printB(){
		System.out.println("B interface");
	}
}
interface C extends A{
	default void printC(){
		System.out.println("C interface");
	}
}
class D implements B,C{
	void printD(){
		System.out.println("D interface");
	}
}

class MultipleDemo{
public static void main(String args[]){
	
	D d1 = new D();
	d1.printD();
	
}
}