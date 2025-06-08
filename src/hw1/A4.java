package hw1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class A4 {
	public static void main(String[] args) {

		int r = 5;
		final double PI = 3.1415;
		double L = 2 * r * PI, A = r * r * PI;
		
//		System.out.println("圓面積為" + A + ",圓周長為" + L);
		System.out.printf("圓面積為 = %.2f" + "(取到小數點第2位)%n", A);
		System.out.printf("圓周長為 = %.2f" + "(取到小數點第2位)", L); // 取到小數點第2位;

	}
}