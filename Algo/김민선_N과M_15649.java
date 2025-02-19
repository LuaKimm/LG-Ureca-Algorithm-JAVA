package Algo;

import java.util.Scanner;

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

public class 김민선_N과M_15649 {
	 static int N, M;
	    static int[] sequence;  // 수열을 저장할 배열
	    static boolean[] used;  // 숫자가 사용되었는지 여부를 체크할 배열

	    public static void backtrack(int depth) {
	        // 수열의 길이가 M이면 수열을 출력
	        if (depth == M) {
	            for (int i = 0; i < M; i++) {
	                System.out.print(sequence[i] + " ");
	            }
	            System.out.println();
	            return;
	        }
	     // 1부터 N까지 숫자 중에서 선택
	        for (int i = 1; i <= N; i++) {
	        	// 숫자가 사용되지 않았으면
				if(!used[i]) {
					//사용했다고 표시
					used[i] = true;
					// 수열에 추가
					sequence[depth] =i;
					// 다음 숫자 선택
					backtrack(depth+1);
					used[i] =false;
					
				}
			}
	}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        N = sc.nextInt();
	        M = sc.nextInt();
	        sequence = new int[M];  // 수열을 저장할 배열
	        used = new boolean[N + 1];  // 1부터 N까지 숫자를 사용할지 체크하는 배열

	        backtrack(0);  // 깊이 0에서 시작
	    }
	}