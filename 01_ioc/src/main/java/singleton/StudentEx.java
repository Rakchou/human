package singleton;

public class StudentEx {
	public static void main(String[] args) {
//		Student stu = new Student();
		
//		System.out.println(stu);
		
		//Factory pattern > prototype
		
		Student student = Student.getInstance();
		Student student2 = Student.getInstance();
		
		System.out.println(student);
		System.out.println(student2);
		
		//Factory > singleton
		Student student3 = Student.getInstance2();
		Student student4 = Student.getInstance2();
		
		System.out.println(student3);
		System.out.println(student4);
	}
}
