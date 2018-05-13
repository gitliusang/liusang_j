package biancheng;

public class ChaChongFuZiFuChuan {

	public static void main(String[] args) {
		String str = "123wabdsafffrrrtttlkjhy";
		ChaChongFuZiFuChuan d = new ChaChongFuZiFuChuan();
		int p = d.Method(str);
		String result = str.charAt(p) + "";
		System.out.println(result);
	}

	public int Method(String str) {
		int position = -1;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if ((str.indexOf(str.charAt(i), i + 1)) != -1) {
				position = i;
				break;
			}
		}
		return position;
	}

}