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
		int[] temp = new int[sa.length];
		int[] temp2 = new int[P.length];
		int tempInt = 0;
		int oneChecker = 0;


		for (int i = 0; i < sa.length; i++) {
			tempInt += (int)sa[i];
			tempInt -= 64;
			temp[i] = tempInt;
		}
		for(int i = 0; i < P.length; i++) {
			temp2[i] = temp[Q[i]] - temp[P[i]] + (int)sa[P[i]] - 64;
			tempInt = temp2[i]%20;

			if (tempInt == 0) {
				result[i] = 4;
			} else {
				tempInt = tempInt % 7;
				if (tempInt == 0) {
					result[i] = 3;
				} else {
					tempInt = tempInt % 3;
					if (tempInt == 0) {
						result[i] = 2;
					} else {
						result[i] = 1;
					}
				}
			}

		}



/*		for(int i = 0; i < P.length; i++) {
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
		}*/

		for (int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]);
		}
		System.out.println();

		return result;
	}
}