package Object_oriented;

class Tv1 {
	// Tv�� �Ӽ�(�������)
	String color;		//����
	boolean power; 		//��������(on/off)
	int channel;		//ä��
	
	// Tv�� ���(�޼���)
	void power() { power = !power; }	//TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; }		//TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } 	//TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}
class TvTest2 {
	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;	//channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}
