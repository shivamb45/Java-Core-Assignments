package arrayassignment;
import static arrayassignment.SingleDimensionalArrayFunction.*;

public class ArrayMainClass {

	public static void main(String[] args) {
		int xy[]={1,2,3,4,5,1,2,3,4,5,1,2,1,2,2,};
		System.out.println(" Maximum is " + max(xy));
		System.out.println(" Minimum is " + min(xy));
		sort(xy);
		frequency(xy);
	}

}
