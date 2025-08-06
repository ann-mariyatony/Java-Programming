package Ann;
class Studentinfo{
	String name;
	int studentNumber;
	static int studentCount=0;
	Studentinfo(String name){
		this.name=name;
		studentNumber=++studentCount;
	}
public static int getStudentCount() {
	return studentCount;
}
public void getStudentDetails() {
	System.out.println("Student Number:"+studentNumber);
	System.out.println("Name:"+name);
}
public class Student {
	public static void main(String[] args) {
		Studentinfo S1 = new Studentinfo("ann");
		Studentinfo S2 = new Studentinfo("mariya");
		Studentinfo S3 = new Studentinfo("tony");
	 S1.getStudentDetails();
     S2.getStudentDetails();
     S3.getStudentDetails();
     System.out.println("Total Students: " + Studentinfo.getStudentCount());
}
}
}
