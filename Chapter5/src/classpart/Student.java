package classpart;

public class Student {

	// public 등 : 접근 제어자
	
	public int studentID;
	public String studentName;
	public String address;

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		
		Student studentKim = new Student();
		studentKim.studentName = "김세종";
		studentKim.showStudentInfo();
	}
}
