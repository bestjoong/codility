package codility.lesson.lesson5;

public class PassingCars {

	public static void main(String[] args)
	{
		int[] A = {0,1,0,1,1};
		solution(A);
	}

	private static int solution(int[] A) {
		int zc = 0;
		int sum = 0;

		for (int i = 0; i < A.length ; i++){

			if (A[i]==0){
				zc++;
			}else if (A[i]==1){
				sum += zc;
			}

			if (sum > 1000000000){
				return -1;
			}
		}
		return sum;
	}
}