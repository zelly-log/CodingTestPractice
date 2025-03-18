package programmers.level1;

public class SumOfDivisors {

	public static void main(String args[]) {
		SumOfDivisors sol = new SumOfDivisors();
		System.out.println(sol.solution(4));
	}

	private int solution(int s) {
		int result = 0;
		for (int i = 1; i <= s; i++) {
			if (s % i == 0) {
				result += i;
			}
		}
		return result;
	}
}
