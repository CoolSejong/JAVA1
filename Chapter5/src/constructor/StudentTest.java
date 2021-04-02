package constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Student studentLee = new Student("이순신");
				//studentLee.studentName = ;
				studentLee.address = "서울";
				
				studentLee.showStudentInfo();
				
				Student studentKim = new Student(100, "김유신");
				//studentKim.studentName = ;
				//studentKim.address = "경주";
				
				studentKim.showStudentInfo();
				
				//System.out.println(studentLee); // 패키지.클래스@메모리(주소값) 으로 표현됨.
				//System.out.println(studentKim); 
	}

}
