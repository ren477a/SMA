import java.util.Scanner;

public class SMA {

	public static void main(String[] args) {
//		double[] x = {11,12,13,14,15,16,17,18,19,20};
//		double[] sma = simpleMovingAverage(x, 5);
//		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of values:");
		int numOfVals = sc.nextInt();
		double[] x = new double[numOfVals];
		System.out.println("Enter "+numOfVals+" values:");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		System.out.print("Enter n:");
		int n = sc.nextInt();
		double[] sma = simpleMovingAverage(x, n);
		
		System.out.println("Trend: ");
		for (int i = 0; i < sma.length; i++) {
			System.out.println(sma[i]);	
		}
		
	}
	
	public static double[] simpleMovingAverage(double[] data, int range) {
		double[] mm = new double[data.length-range];
		double sum = 0;
		for (int i = 0; i < range; i++) {
			sum+=data[i];
		}
		mm[0] = sum/range;
		
		for (int i = 1; i < mm.length; i++) {
			mm[i] = mm[i-1] + (data[range+i-1]/range) - (data[i-1]/range);
		}
		return mm;
	}

}
