package hw4;

import java.util.Arrays;

// 有個一維陣列如下：
// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
// (提示：陣列，length屬性)

public class A1 {

	public static void main(String[] args) {
		int i;
		double j;
		int sum = 0;
		int arr[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(arr); // 排序

		for (i = 0; i < arr.length; i++) {
			sum += arr[i]; // 總和	
		}
		j = (sum / arr.length); // 平均
		System.out.println("平均值 = " + j);
		
		System.out.print("大於平均值的元素:");
		for (i = 0; i < arr.length; i++) {
			if(arr[i] > j) // if列出大於平均的元素
				System.out.print(arr[i] + " ");
		}
	}
}
