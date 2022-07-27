package string.reverse;

public class ReverseString {
	public static void main(String[] args) {
		
		String s = "Vishal";
		
		StringBuilder stringBuilder = new StringBuilder(s);
		String reverse = stringBuilder.reverse().toString();
		
		System.out.println(reverse);
		
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
	}

}
