package chapter10;

public class MyStringBuilder {
	private String s;

	public MyStringBuilder(String s) {
		this.s = s;
	}

	public MyStringBuilder append(MyStringBuilder s) {
		String str = this.s + s.toString();
		return new MyStringBuilder(str);
	}

	public MyStringBuilder append(int i) {
		return new MyStringBuilder(this.s + i);
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public MyStringBuilder toLowerCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (64 < s.charAt(i) && s.charAt(i) < 91) {
				str += (char) (s.charAt(i) + 32);
			} else {
				str += s.charAt(i);
			}
		}
		return new MyStringBuilder(str);
	}

	public MyStringBuilder substring(int begin, int end) {
		String str = "";
		for (int i = begin; i < end; i++) {
			str += s.charAt(i);
		}
		return new MyStringBuilder(str);
	}

	public String toString() {
		return s;
	}
}
