package codility.lesson.lesson4;

public class PermCheck {

	private static final int EXITS = 1;

	public static void main(String[] args)
	{
		int[] A = {6,4,1,1,4};
		solution(A);
	}

	private static int solution(int[] A) {
		int[] B = new int[A.length];

		for (int i = 0 ; i<A.length; i++){
			if (A[i] > A.length) {
				return 0;
			}
			if (B[A[i] - 1] == EXITS) {
				return 0;
			} else {
				B[A[i] - 1] = EXITS;
			}
		}
		return 1;
	}
}
