package Variable;

public class SpecialChar {
	public static void main(String[] args) {
		char single = '\''; 			// single = '''; 와 같이 할 수 없다.
		String dblQuote = "\"Hello\"";  // 큰따옴표를 출력하여면 이렇게 한다.
		String root = "C:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
	}
}
