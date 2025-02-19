package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Main_1141_G5_불쾌한_날_김민선 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 소의 수 입력받기
		int n = sc.nextInt();
		int[] cow = new int[n];
		
		for (int i = 0; i < n; i++) {
		    cow[i] = sc.nextInt(); 
		}

		
		//스택을 준비한다.
		Stack<Integer> stack = new Stack<>();
		
		 long count = 0;
		 
		 for(int i = 0; i<n; i++) {
		
		//모든 소(i)에 대해: 
		//- 스택에 있는 소들 중에서 현재 소보다 작은 소들을 모두 제거 (볼 수 있는 소들을 센다).
			 int bigCow = cow[i];
		while (!stack.isEmpty() && stack.peek() <= bigCow) {
		    stack.pop();
		}
		
		//- 현재 소를 스택에 추가한다.
		count += stack.size();
		
		stack.push(bigCow);
		 }   
		// 4. 결과를 출력한다.
		System.out.println(count);	

	}

}