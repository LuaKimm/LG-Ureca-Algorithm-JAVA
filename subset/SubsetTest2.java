package subset;

import java.util.Arrays;

public class SubsetTest2 {
    static String[] input = "abcd".split("");
    static int N = input.length;
    static int[] subset = new int[N]; // subset 배열 초기화 추가

    public static void main(String[] args) {
        long stime = System.currentTimeMillis();

        for (int i = 0, size = 1 << N; i < size; i++) {
            for (int j = 0; j < N; j++) { // args.length -> N으로 변경
                if ((i & (1 << j)) != 0) { // j번째 비트가 1이면 원소 선택
                }
//                    subset[j] = (i>>j)&1; 이렇게 해도 됨
            }
            // 부분 집합이 완성됐으므로 부분 집합 이후 필요한 코드 작성
//            print();
            
            // 다음 부분 집합을 구하기 위해서 subset을 0으로 초기화
            Arrays.fill(subset, 0);
        }

        long etime = System.currentTimeMillis();
        System.out.printf("%dms\n", etime - stime);
    }

    public static void print() {
        System.out.print("[");
        for (int i = 0; i < N; i++) {
            if (subset[i] == 1)
                System.out.print(input[i] + " ");
        }
        System.out.println("]");
    }
}




