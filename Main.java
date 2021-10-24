package Sample;

public class Main {
	 public static void main(String[] args) {
		 Integer x=3,y=4,z=5;
		 Float xf=6.6f, yf=8.8f, zf=7.7f;
		 String xStr="A",yStr="B",zStr="C";
		// MaximumTest.testMaximum(xStr, yStr, zStr);
		 new MaximumTest(x,y,z).maximum();
		 new MaximumTest(xf,yf,zf).maximum();
		 new MaximumTest(xStr, yStr, zStr).maximum();
	 }
}
