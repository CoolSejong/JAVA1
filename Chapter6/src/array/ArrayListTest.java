package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹ��� �迭 Ŭ���� : ArrayList
		// �ڹٿ��� �����Ǵ� ��ü �迭�� ������ Ŭ����
		// ��ü �迭�� ����ϴµ� �ʿ��� ���� �޼������ �����Ǿ� ����
//==============================================================
		// �ֿ� �޼���
		// boolean add(E e)    | ����ϳ��� �迭�� �߰��մϴ�. E�� ����� �ڷ����� �ǹ��մϴ�.
		// int size()          | �迭�� �߰��� ��� ��ü ������ ��ȯ�մϴ�.
		// E get(int index)    | �迭�� index ��ġ�� �ִ� ��� ���� ��ȯ�մϴ�.
		// E remove(int index) | �迭�� index ��ġ�� �ִ� ��� ���� �����ϰ� �� ���� ��ȯ�մϴ�.
		// boolean isEMpty()   | �迭�� ��� �ִ��� Ȯ���մϴ�.
		
		// ���콺 ���ٴ� �� F1Ű�� ���� help�� �̿��� javaDoc �̿� �����ϴ�.
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
