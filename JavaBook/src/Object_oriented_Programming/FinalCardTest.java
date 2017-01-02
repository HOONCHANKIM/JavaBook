package Object_oriented_Programming;



class CardF {
	final int NUMBER;			//������� ����� ���԰� �ʱ�ȭ ���� �ʰ�
	final String KIND;			//�����ڿ��� �� �ѹ��� �ʱ�ȭ �� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	CardF(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	CardF() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String args[]) {
		CardF c = new CardF("HEART", 10);
	//	c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}
