


package Sample;

public class MaxStringThree {
	public static void main(String[] args) {
		String max1=maxofthree("C","B","A");
		System.out.println("Maximum="+max1);
		String max2=maxofthree("B","C","A");
		System.out.println("Maximum="+max2);
		String max3=maxofthree("B","A","C");
		System.out.println("Maximum="+max3);
	}

	private static String maxofthree(String i,String j, String k) {
		String max=i;
		if(j.compareTo(i)>0) {
			max=j;
		}else if(k.compareTo(j)>0) {
			max=k;
		}
		return max;
	}
}
