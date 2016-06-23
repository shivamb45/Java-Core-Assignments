package arrayassignment;
/*
 * Incomplete
 */
public class SingleDimensionalArrayFunction {
	static public int max(int x[])
	{
		int largest=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>largest)
				largest=x[i];
		}
		return largest;
	}
	static public int min(int x[])
	{
		int minimum=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]< minimum)
				minimum=x[i];
		}
		return minimum;
	}
	static public void frequency(int x[])
	{
		/*Incomplete
		 * 
		 */
	}
}
class FrequencyStat{
	int number;
	int frequency;
	/*incomplete
	 * 
	 */
}
