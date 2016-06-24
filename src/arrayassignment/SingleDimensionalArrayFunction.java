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
	static public void sort(int input[]){
		int copiedReference[]=java.util.Arrays.copyOf(input,input.length);
		java.util.Arrays.parallelSort(copiedReference);
		for(int i:copiedReference){
			System.out.println(" " + i);
		}
	}
	static public void frequency(int x[])
	{
		int copiedReference[]=java.util.Arrays.copyOf(x,x.length);
		java.util.Arrays.parallelSort(copiedReference);
		FrequencyStat tracker[]=new FrequencyStat[copiedReference.length];
		tracker[0].number=copiedReference[0];
		tracker[0].frequency=1;
		int totalTrackerItems=0;
		for(int i=1;i<copiedReference.length;i++)
		{
			if(tracker[totalTrackerItems].number==copiedReference[i])
			{
				tracker[totalTrackerItems].frequency++;
			}
			else{
				totalTrackerItems++;
				tracker[totalTrackerItems].number=copiedReference[i];
				tracker[totalTrackerItems].frequency=1;
			}
		}
		for(FrequencyStat a:tracker)
		{
			System.out.println(" The Number " + a.number + " Ocurred " + a.frequency + "times");
		}
		
	}
}

class FrequencyStat
{
	int number;
	int frequency;
	FrequencyStat(){
		number=0;
		frequency=0;
	}
}
