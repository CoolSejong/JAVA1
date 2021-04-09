package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 배열 클래스 : ArrayList
		// 자바에서 제공되는 객체 배열이 구현된 클래스
		// 객체 배열을 사용하는데 필요한 여러 메서드들이 구현되어 있음
//==============================================================
		// 주요 메서드
		// boolean add(E e)    | 요소하나를 배열에 추가합니다. E는 요소의 자료형을 의미합니다.
		// int size()          | 배열에 추가된 요소 전체 개수를 반환합니다.
		// E get(int index)    | 배열의 index 위치에 있는 요소 값을 반환합니다.
		// E remove(int index) | 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다.
		// boolean isEMpty()   | 배열이 비어 있는지 확인합니다.
		
		// 마우스 갖다댄 후 F1키룰 눌러 help를 이용해 javaDoc 이용 가능하다.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
