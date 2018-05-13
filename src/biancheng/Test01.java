package biancheng;

public class Test01 {

	public static void main(String[] args) {
		String s1 = new String("hellow");
		StringBuffer sb = new StringBuffer("hi");
		String ss = method(s1);
		System.out.println(s1);
		System.out.println(ss);
		
	}
	
	public static String method(String s){
		s +="world";
		
		return s;
	}
}
