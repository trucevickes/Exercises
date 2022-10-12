package exercises;

public class Third {
	
	public static void main(String[] args) {
		int [] thirdOfIntegers = new int[] {5,6,7};
		int[] third = {2,4,6,8,10};
		int[][] multidimensionalThird = {
				{1,2},
				{3,4},
				{5,6}
		};
		System.out.println(third[0]);
		System.out.println(third[1]);
		System.out.println(third[4]);
		System.out.println(third[5]);
		System.out.println("size of first array in multidimensional array " +multidimensionalThird[0].length);
	}
}
