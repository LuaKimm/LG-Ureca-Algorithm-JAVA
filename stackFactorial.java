import java.util.Stack;

public class stackFactorial {
	public static int factorial(int n) {
		Stack<Integer> stack = new Stack<>();
		int result = 1;
	
	for (int i = n; i > 0; i--) {
		stack.push(i); //스택에 값 추가
	}
	while(!stack.isEmpty()) {
		result *= stack.pop();
	}
	return result;
	}
	
	public static void main(String[] args) {
		
System.out.println(factorial(5));
	}

}

//자기 자신 호출하면서 문제를 가장 작은 단위로 쪼개고, 마지막에 값을 반환하면서
//최종 결과를 구하는 방식으로 동작
