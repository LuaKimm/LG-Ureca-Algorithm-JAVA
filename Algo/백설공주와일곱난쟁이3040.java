package Algo;

import java.util.Scanner;

public class 백설공주와일곱난쟁이3040 {
    static int n = 9; // 9명의 난쟁이
    static int r = 7; // 7명을 선택
    static int[] numbers = new int[r];  // 선택된 난쟁이 저장 배열
    static int[] input = new int[n];    // 난쟁이 키 저장 배열

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 9명의 난쟁이 키 입력받기
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }

        // 조합 함수 실행
        combi(0, 0);
    }

    private static void combi(int depth, int start) {
        if (depth == r) {
            int sum = 0;
            for (int num : numbers) sum += num;

            if (sum == 100) { // 7명의 키 합이 100이면 출력
                for (int num : numbers) {
                    System.out.println(num);
                }
                System.exit(0); // ✅ 정답을 찾으면 프로그램 종료
            }
            return;
        }

        for (int i = start; i < n; i++) {
            numbers[depth] = input[i];
            combi(depth + 1, i + 1);
        }
    }
}

