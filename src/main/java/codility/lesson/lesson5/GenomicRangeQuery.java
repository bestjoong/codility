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
		char[] temp = new char[P.length];
		char[] sa = S.toCharArray();
		//char[][] saa = new char[sa.length][sa.length];
		char min = 'Z';
		//char temp;

		for(int i = 0; i < P.length; i++) {
			for(int j = P[i] ; j <= Q[i]; j++) {
				if (sa[j] == 'A') {
					min = sa[j];
					break;
				} else if (min > sa[j]) {
					min = sa[j];
				}
			}
			temp[i] = min;
			min = 'Z';
		}


//		for(int i = 0; i < sa.length; i++) {
//			min = sa[i];
//			for (int j = i; j < sa.length; j++) {
//				if (sa[j] < min) {
//					min = sa[j];
//				}
//				saa[i][j] = min;
//			}
//			min = 'Z';
//		}
//
		for(int i = 0; i < P.length; i++) {
			//temp = saa[P[i]][Q[i]];

			if (temp[i] == 'A') {
				result[i]=1;
			} else if (temp[i]=='C') {
				result[i]=2;
			} else if (temp[i]=='G') {
				result[i]=3;
			} else {
				result[i]=4;
			}
		}

		for (int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]);
		}
		System.out.println();

		return result;
	}
}