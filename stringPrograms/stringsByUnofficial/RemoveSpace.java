 package stringsByUnofficial;

public class RemoveSpace {

	public static void main(String[] args) {

		String s = "Mayur Anand Salunke";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
