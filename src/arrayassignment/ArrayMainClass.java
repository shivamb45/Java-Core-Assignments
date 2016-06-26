package arrayassignment;
import static arrayassignment.SingleDimensionalArrayFunction.*;
import static arrayassignment.MatrixFunctions.*;

public class ArrayMainClass {

	public static void main(String[] args) {
		int matVar[][];
		matVar=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int xy[]={1,2,3,4,5,1,2,3,4,5,1,2,1,2,2,1,6,9,6,6,3,5,2,6,21,9,23,654,32,6516,2,21,21,21,654,321,64,321,32,32,32,32,23,32,32,32,2};
		System.out.println(" Maximum is " + max(xy));
		System.out.println();
		System.out.println(" Minimum is " + min(xy));
		System.out.println();
		sort(xy);
		System.out.println();
		frequency(xy);
		System.out.println();
		System.out.println(" The sum of matrix elements is " + sumMatrix(matVar));
	}

}
