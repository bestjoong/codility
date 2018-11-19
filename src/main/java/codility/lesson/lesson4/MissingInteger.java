package codility.lesson.lesson4;

public class MissingInteger {

	private static final int EXITS = 1;

	public static void main(String[] args)
	{
		int[] A = {1, 3, 6, 4, 1, 2};
		solution(A);
	}

	private static int solution(int[] A) {
		int[] counter = new int[A.length];

		for (int i = 0; i < A.length ; i++){
			if (A[i] > 0 && A[i] <= A.length){
				counter[A[i]-1] = EXITS;
			}
		}

		for (int i = 0; i < A.length ; i++){
			if (counter[i] != EXITS) {
				System.out.println(i+1);
				return i+1;
			}
		}

		System.out.println(A.length+1);

		return A.length+1;
	}

}
