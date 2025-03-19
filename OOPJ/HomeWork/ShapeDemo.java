abstract class Shape{
	protected String shapeName;
	
	Shape(String name){
		this.shapeName = name ;
		
		
	}
	
	String Getshapename(){
		return this.shapeName;
		
	}
	
	abstract void CalculateArea();
	
}
class Circle extends Shape{
	private double radius; 
	
	Circle(double r){
		super("Circle");
		this.radius = r;
    }
    
    void CalculateArea(){
		double area = 3.14 *radius*radius;
	
	  System.out.println("Area of circle: "+area);
	}	
		
}
class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	Rectangle(double length , double breadth){
		super("Rectangle");
		this.length = length ;
		this.breadth = breadth ;
	}
    
     void CalculateArea(){
	    
		 double area = length*breadth ;
		 System.out.println("Area of Rectangle: "+area);
	
    }
}
class ShapeDemo{
	public static void main(String args[]){
		Circle c = new Circle(5.0);
		Rectangle r = new Rectangle(4.0,6.0);
	
       Shape s1 = new Circle(8.0);
       Shape s2 = new Rectangle(2.0,5.0);	   
		
		c.CalculateArea();
		r.CalculateArea();
		
		s1.CalculateArea();
		s2.CalculateArea();
	
	}
}