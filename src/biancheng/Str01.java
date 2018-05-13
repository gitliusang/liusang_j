package biancheng;

public class Str01 {

	
	public static void main(String[] args) {
		String str1 = "1232westrf";
		str1.charAt(5);
		System.out.println(str1.charAt(5));
//		str1.indexOf(str1, 5);
		System.out.println(str1.indexOf("2"));
		System.out.println(str1.indexOf(0));
		System.out.println(str1.indexOf("w", 3));
	}
}
