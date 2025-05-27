package leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 설명:
 temperatures 배열은 매일의 기온을 나타낸다.
 각 날짜(i)에 대해, 더 따뜻한 날이 오기까지 며칠 기다려야 하는지를 answer[i]에 저장.
 더 따뜻한 날이 없을 때 answer[i]는 0
 */
public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		// 1. 입력 받는 배열의 크기만큼 정답 배열 생성
		int n = temperatures.length;
		int[] answer = new int[n];

		// 2. 정수형 스택 선언
		Deque<Integer> stack = new ArrayDeque<>();

		// 3. 날짜 순회하며 날짜와 기온 저장
		for (int currentDay = 0; currentDay < n; currentDay++) {
			int currentTemp = temperatures[currentDay];

			// 4-1. stack이 비어 있지 않고 현재 온도가 더 높을 때
			while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
				// 4-2. 이전 날짜 꺼내기
				int prevDay = stack.pop();
				// 4-3. 오늘 날짜 - 이전 날짜 (며칠 기다렸는지 저장)
				answer[prevDay] = currentDay - prevDay;
			}

			// 5. 아직 비교되지 않은 오늘 날짜 스택에 저장
			stack.push(currentDay);
		}

		// 6. 결과값 반환
		return answer;
	}
}
