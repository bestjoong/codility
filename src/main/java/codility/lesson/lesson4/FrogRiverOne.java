package codility.lesson.lesson4;

public class FrogRiverOne {

	private static final int EXITS = 1;

	public static void main(String[] args)
	{
		int[] A = {4,1,2,3,1,3,5,1,2};
		solution(5, A);
	}

	private static int solution(int X, int[] A) {
		int[] B = new int[X];
		int checker = 0;

		for (int i = 0 ; i<A.length; i++){
			if ( X >= A[i] && B[A[i]-1] != EXITS) {
				B[A[i]-1] = EXITS;
				checker++;
				if (checker == X) {
					System.out.println(i);
					return i;
				}
			}

		}
		return -1;
	}
}
