package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		// 여기까지 한 것을 '깊은 복사'라고 한다. 얕은 복사 와는 달리 주소 값이 아닌, 해당 인덱스의 값을 복사하는 것이므로 
		// 복사하는 쪽의 값이 후에 바뀌어도 값을 수정하지 않는 한 수정 전에 복사했던 값이 저장된다.
	}

}
