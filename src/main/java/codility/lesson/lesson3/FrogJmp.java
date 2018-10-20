package codility.lesson.lesson3;

public class FrogJmp {

	public static void main(String[] args) {
		solution(10, 1000000000, 30);
	}

	private static int solution(int X, int Y, int D) {

		int distance = Y - X;
		int num = distance/D;

		return distance%D == 0 ? num: num+1;
	}
}
