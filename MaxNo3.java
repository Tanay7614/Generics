package Sample;

public class MaxNo3 {
	public static void main(String[] args) {
		Integer max=maxofthree(15,12,19);
		System.out.println("Maximum="+max);
	}

	private static Integer maxofthree(Integer i, Integer j, Integer k) 
	{
		Integer max=i;
		if(j.compareTo(i)>0)
		{
			max=j;
		}
		else if(k.compareTo(j)>0)
		{
			max=k;
		}
		return max;
	}
}
