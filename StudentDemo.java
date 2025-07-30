package ann;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollNumber,String name,int m1, int m2,int  m3){
		this.rollNumber=rollNumber;
		this.name = name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
public void calaculateAverage() {
	avg=(m1+m2+m3)/3;
}
public void displayDetails() {
	System.out.println("Roll Number:"+ rollNumber);
	System.out.println("Name:"+ name);
	System.out.println(" Mark 1 : "+ m1  +"\t Mark 2:"+m2+"\t Mark 3:"+m3);
	System.out.println("Average:"+ avg);
}
public class StudentDemo {
 public static void main(String[] args) {
	 Student s1=new Student(12,"Demo",22,42,41);
	s1.calaculateAverage();
	s1.displayDetails();
	Student s2=new Student(2,"Try",4,4,1);
	s2.calaculateAverage();
	s2.displayDetails();
			 
 }
}
}