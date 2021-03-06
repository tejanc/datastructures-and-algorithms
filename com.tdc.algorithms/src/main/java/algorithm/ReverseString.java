package algorithm;

public class ReverseString {

	public String reverse(String s) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}
}
