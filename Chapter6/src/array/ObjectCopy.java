package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		// 자바에서의 또 다른 반복문 선언 방법
		// 향상된 for문
		// for('개체의 타입' '변수')
		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
		// library의 0번째 값을 수정하기 전을 출력한다.
		System.out.println("================");
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		// library의 0번째 값을 수정한 것을 출력한다.
		System.out.println("================");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		// 여기까지 한 것을 '얕은 복사'라고 한다. 얕은 복사는 주소값을 복사하는 것을 의미한다.
	}

}
