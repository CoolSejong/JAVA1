package constructor;

public class Student {
	// public �� : ���� ������
	
	public int studentID;
	public String studentName;
	public String address;

	public Student(String name) {
		this.studentName = name;
	}
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;
	}
	
	public Student() {
		
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		
		Student studentKim = new Student();
		studentKim.studentName = "�輼��";
		studentKim.showStudentInfo();
	}
}
