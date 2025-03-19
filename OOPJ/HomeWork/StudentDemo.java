class Student{
  int stuId;
  String stuName;
  
  void set(int n , String name){
    stuId = n;
	stuName = name;
	
  }
  void display(){
  System.out.println(stuId +" "+ stuName);
  }
  
  }
  class StudentDemo{
   public static void main(String args[]){
   
    Student s1 = new Student();
	
	s1.set(11,"Isha");
	s1.display();
   
   }}