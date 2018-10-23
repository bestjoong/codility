package codility.lesson.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args)
	{
		//int[] A = {-1000, -500, 500, 1000, 2000, 0, 2000, 2000, 2000, -2000, -2000};
//		int[] A = {-1000, 1000};
		int[] A = {-10, -20, -30, -40, 100};
//		int[] A = {0,-1000, 1000,0};
		//int[] A = {0,1000, 1000,0};
		//int[] A = {2000,2000,2000,2000,2000,2000};
		//int[] A = {-2000,-2000,-2000,2000,2000,-2000,-2000,-2000};
		solution(A);
	}

	private static int solution(int[] A) {
		int sum = 0;
		int min = 2000;
		int temp;
		int[] B = new int[A.length];
		int[] C = new int[A.length];


		for (int i =0 ; i < A.length ; i++) {
			sum = sum + A[i];
			B[i] = sum;
		}

		for (int i=0;i<A.length-1;i++) {
			C[i] = sum - B[i];
			temp = Math.abs(C[i] - B[i]);
			min = Math.min(min, temp);
		}

		System.out.println("min = "+min);

		return min;
	}
}
