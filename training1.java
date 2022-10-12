package exercises;

public class training1 {
	double width;
	double height;
	double depth;
	
	training1(training1 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	training1(double w, double h, double d) {
		width =w;
		height =h;
		depth = d;
	}
	
	training1(double len){
		width = height = depth = len;
	}
}
