package codility.lesson.lesson5;

public class GenomicRangeQuery {

	public static void main(String[] args)
	{
		String s = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		solution(s,P,Q);
	}

	private static int[] solution(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];
		char[] sa = S.toCharArray();
		char[][] saa = new char[sa.length][sa.length];

		for(int i = 0; i < P.length; i++) {
			for(int j = i; j < P.length; j++) {
				/*saa[i][j] =*/
			}
		}

		for (int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]);
		}
		System.out.println();

		return result;
	}
}