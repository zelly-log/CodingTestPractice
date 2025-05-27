package leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제 설명:
 주어진 문자열 s는 '(', ')', '{', '}', '[', ']' 문자만 포함한다.
 괄호들이 올바르게 짝지어져 있고, 올바른 순서로 닫혀 있다면 true를 반환, 그렇지 않으면 false를 반환한다.
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		// 1. 문자가 들어갈 스택 생성
		Deque<Character> stack = new ArrayDeque<>();

		// 2. 순회하며 c에 한 글자씩 글자를 담음
		for (char c : s.toCharArray()) {

			// 3. 열린 괄호인지 판단
			if (c == '(' || c == '[' || c == '{') {
				// 3-1. 열린 괄호일 때 stack에 push
				stack.push(c);
			}

			// 4. 닫힌 괄호인지 판단
			else if (c == ')' || c == ']' || c == '}') {

				// 4-1. stack이 비어 있을 경우 검증할 괄호가 없기 때문에 false 반환
				if (stack.isEmpty())
					return false;

				// 4-2. stack이 비어 있지 않을 때 stack 마지막 값 꺼내기
				char lastOpen = stack.pop();

				// 4-3. 꺼낸 값과 닫힌 괄호가 짝이 맞는지 검증
				if (c == ')' && lastOpen != '(') {
					return false;
				}
				if (c == ']' && lastOpen != ']') {
					return false;
				}
				if (c == '}' && lastOpen != '}') {
					return false;
				}
			}
		}
		// 5. stack에 남은 게 있는지 검증
		return stack.isEmpty();
	}
}
