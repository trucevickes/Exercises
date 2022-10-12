package exercises;

public class Second {
	
	public Integer add (Integer arg1, Integer arg2) {
		arg1 = 100;
		Integer result = arg1 + arg2;
		return result;
	}
	
	public Integer add (Integer arg1, Integer arg2, Integer arg3) {
		Integer result = arg1 + arg2 + arg3;
		return result;
	}
	
	public static void main(String[] args) {
		Second sec = new Second();
		int arg1 = 10;
		int arg2 = 30;
		int arg3 = 50;
		System.out.println("Printing arg1 before passing it by value " + arg1);
		Integer result = sec.add(arg1, arg2);
		System.out.println("Printing arg1 after passing it by value to add method " + arg1); 
		System.out.println("The result is " + result);
		
		Integer resultFromNewAddMethod = sec.add(arg1, arg2, arg3);
		System.out.println("Result from new Add method " + resultFromNewAddMethod);
	}

}
