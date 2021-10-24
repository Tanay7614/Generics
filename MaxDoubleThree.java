package Sample;

public class MaxDoubleThree {
	public static void main(String[] args) {
		Double max1=maxofthree(6.1,4.4,3.2);
		System.out.println("Maximum="+max1);
		Double max2=maxofthree(4.4,6.1,3.2);
		System.out.println("Maximum="+max2);
		Double max3=maxofthree(4.4,3.1,6.1);
		System.out.println("Maximum="+max3);
	}

	private static Double maxofthree(Double i, Double j, Double k) {
		Double max=i;
		if(j.compareTo(i)>0) {
			max=j;
		}else if(k.compareTo(j)>0) {
			max=k;
		}
		return max;
	}
}
