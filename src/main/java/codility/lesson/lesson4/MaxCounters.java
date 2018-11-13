package codility.lesson.lesson4;

public class MaxCounters {

	public static void main(String[] args)
	{
		//int[] A = {1,6, 4,4,3, 3,4,4,6,1,4,4};
		//int[] A = {3,4,4,6,1,4,4};
		int[] A = {6,1,6,3,6,4,6,5,6,6};
		solution(5, A);
	}

	private static int[] solution(int N, int[] A) {
		int[] counter = new int[N];
		int tempCount = 0;
		int maxCount = 0;

		for (int i=0; i<N; i++) {
			counter[i] = 0;
		}

		for (int i = 0; i < A.length ; i++) {
			if ( A[i] > 0 && A[i] <= N ) {
				if (maxCount > counter[A[i]-1]) {
					counter[A[i]-1] = maxCount+1;
					tempCount = Math.max(counter[A[i]-1], tempCount);
				}else {
					counter[A[i]-1]++;
					tempCount = Math.max(counter[A[i]-1], tempCount);
				}
			} else if ( A[i] == (N+1)) {
				maxCount = Math.max(maxCount,tempCount);
				tempCount = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			if (maxCount > counter[i]) {
				counter[i] = maxCount;
			}
		}

		return counter;
	}

}
