package permutation;
import java.util.Arrays;
// 중복 원소를 bitmask를 이용해서 체크하기
// 9P9   : 0.009	    (안전)
// 10P10 : 0.1초 컷		(약간 위험) 
public class Permutation2_nPr3_bit {
	static long tc;					//순열 개수
	static long count;				//반복 횟수 
	static int  R;					//뽑을 개수			
	static int  N;					//원소의 개수
	static int[] numbers;			//순열을 담은 배열
	static int[] input;				//입력된 데이타 
	/**
	 * @param depth 	뽑을 원소의 위치 
	 * @param flag 	뽑을 원소의 중복 체크를 위한 flas  (bitmask 활용) 
	 */
	public static void permutation(int depth, int flag) {
		//배열은 0부터 시작이므로 R-1개가 모두 뽑은 상황. idx가 R과 동일한 상황은 순열을 다 뽑은 상황 
		//스왑 순열을 R-2까지 스왑하면 순열이 결정된다.
		if(depth == R-1) { //순열이 완성됨
			tc++;
			//순열을 뽑은 이후의 task를 작성 
//			System.out.println(Arrays.toString(numbers));
			return ;
		}
		for (int i = depth; i < N; i++) {
			swap(i, depth);
			permutation(depth+1);
			//다음 순열을 만들기 위해서 원래대로 원복 하기 
			swap(i, depth);
//			swap(depth, i);
		}
	}
	private static void permutation(int i) {
		// TODO Auto-generated method stub
		
	}
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
		
	}
	public static void main(String[] args) {
		input = new int[] {1,2,3,4,5,6,7,8,9,10};
//		input = new int[] {1,2,3};
		N = input.length;
		R = input.length;
		numbers = new int[R];	
		long start = System.currentTimeMillis();
		permutation(0, 0);
		long end = System.currentTimeMillis();
		System.out.printf("tc: %d   count:%d   time:%dms%n", tc, count, end-start);
	}
}





