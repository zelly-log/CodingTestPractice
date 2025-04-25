package programmers.level1;

/*
정수 x와 자연수 n을 입력받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
 */
public class ArithmeticSequenceGenerator {
	public static void main(String[] args) {
		ArithmeticSequenceGenerator sol = new ArithmeticSequenceGenerator();
		System.out.println(sol.solution(2, 5));
	}

	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			answer[i] = (long)x * (i + 1);
		}
		return answer;
	}
}
