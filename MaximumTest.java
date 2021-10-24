package Sample;


	public class MaximumTest<T extends Comparable<T>> {
		T  x, y, z;
		public MaximumTest (T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
		}
		public T maximum() {
		  return MaximumTest.maximum (x, y, z);
		}
		
		public static <T extends Comparable<T>> T maximum(T x, T y, T z)
		{
			T max=x;
			
		if(y.compareTo(x)>0) {
			max=y;
		}
		if(z.compareTo(y)>0) {
			max=z;
		}
		printMax(x, y, z,max);
		return max;
        }
		private static <T> void printMax(T x, T y, T z, T max) {
			System.out.printf("max of %s, %s, and %s is %s \n",x,y,z,max);
			
		}
	/*	public static String testMaximum(String x,String y,String z) {
			String max=x;
			if(y.compareTo(x)>0) {
				max=y;
			}
			 if(z.compareTo(y)>0) {
				max=z;
			}
			printMax(x, y, z,max);
			return max;
		}*/
		
}
		
		
		
		
		
		
		
		
		

