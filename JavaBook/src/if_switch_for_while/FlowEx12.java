package if_switch_for_while;

public class FlowEx12 {
	public static void main(String[] args) {
		int sum = 0;		//합계를 저장하기 위한 변수
		
		for (int i = 1; i <= 10; i++) {
			sum += i;			//sum = sum + i;
			System.out.println(i + " 까지의 합 : " + sum);
		}
	}
}
