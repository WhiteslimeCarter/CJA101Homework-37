package hw5;

import java.util.Arrays;

// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳，如圖：
// 方法覆載機制
public class A3 {

	public int maxElement(int[][] x) {
		int y = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (x[i][j] > y) {
					y = x[i][j];
				}
			}
		}
		return y;
	}

	public double maxElement(double[][] x) {
		double y = 0.0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) { // x[i].length 判斷第i列元素個數.
				if (x[i][j] > y) {
					y = x[i][j];
				}
			}
		}
		return y;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		A3 m = new A3();
		System.out.println(m.maxElement(intArray));
		System.out.println(m.maxElement(doubleArray));
	}
}
