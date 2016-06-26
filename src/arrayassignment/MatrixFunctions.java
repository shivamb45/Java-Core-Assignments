/**
 * 
 */
package arrayassignment;

/**
 * @author shivam
 *
 */
public class MatrixFunctions {
	static public int sumMatrix(int x[][]){
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum=sum+x[i][j];
			}
		}
		return sum;
	}
	static void addMatrix(int x[][],int y[][])
	{
		
	}

}
