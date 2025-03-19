package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 설명: 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
 * ex) n이 12345일 때 [5,4,3,2,1]을 리턴
 */
public class ReverseNumberToArray {
	public static void main(String args[]) {
		ReverseNumberToArray sol = new ReverseNumberToArray();
		System.out.println(Arrays.toString(sol.solution(12345)));
	}

	public int[] solution(long n) {
		List<Integer> answer = new ArrayList<>(); // 리스트 생성(가변)

		while (n > 0) {
			answer.add((int)(n % 10)); // 끝자리를 배열에 첫 번째부터 순차적으로 저장
			n /= 10; // 다음 자릿수로 이동
		}
		return answer.stream().mapToInt(i -> i).toArray(); // int 배열로 변환
	}
}
