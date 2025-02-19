
public class Recursion00 {

		public static int factorial(int n) {
			if(n==1) return 1; //기본조건
			return n * factorial(n-1); // 재귀 호출 (Recursive Case)
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
