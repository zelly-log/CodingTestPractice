package programmers.level1;

/**
 * 문제 설명:
 * 자연수 N이 주졌을 때, N의 각 자릿수의 합을 구해서 return 하는 solution 함수
 * ex) N = 123일 때, 1 + 2 + 3 = 6을 return
 */
public class SumOfDigits {
	public static void main(String args[]) {
		SumOfDigits sol = new SumOfDigits();
		System.out.println(sol.solution(10));
	}

	public int solution(int n) {
		int sum = 0;

		while (n > 0) {
			sum += n % 10; // 마지막 자릿수 더하기
			n = n / 10; // 다음 자릿수로 이동
		}
		return sum;
	}
}
