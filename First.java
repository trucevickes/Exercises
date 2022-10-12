package exercises;

class First {
	
	Integer instanceVariable;
	static Integer staticVariable = 30;
	
	synchronized void nonStaticTest() {
		instanceVariable = 50;
		System.out.println("Non static method");
	}
	static void staticTest() {
		System.out.println(" static method");
	}
	public static void main(String[] args) {
		First firstObject1 = new First();
		firstObject1.instanceVariable = 40;
		First firstObject2 = new First();
		firstObject2.instanceVariable = 50;
		
		First.staticVariable = 100;
		
		System.out.println("Hello World!!!");
		firstObject1.nonStaticTest();
		staticTest();
	}

}
