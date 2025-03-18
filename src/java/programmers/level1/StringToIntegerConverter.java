package programmers.level1;

public class StringToIntegerConverter {

	public static void main(String args[]) {
		StringToIntegerConverter sol = new StringToIntegerConverter();
		System.out.println(sol.solution("-1234"));
	}

	private int solution(String s) {
		return Integer.parseInt(s);
	}
}
