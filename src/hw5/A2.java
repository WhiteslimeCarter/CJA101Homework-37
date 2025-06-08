package hw5;

// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

public class A2 {

	public static void randAvg() {
		int[] r = new int[10];
		int sum = 0;
		int i = 0;
		double j;

		// 用迴圈，在迴圈裡宣告一個整數產生亂數，不重複再加入r陣列裡

//		產生亂數
		while (i < 10) {
			int x = (int) (Math.random() * 101);
			boolean judge = false; // 預設每次x未重複

//		但因無法完全確定是否重複，而判斷重複是否成立
			for (int i2 = 0; i2 < r.length; i2++) {
				if (r[i2] == x) { // 如果x和陣列裡數字重複了
					judge = true; // 設boolean為true(重複)，
					break; // 強制結束這次執行，進入下一次
				}
			}

			if (!judge) { // 如果不重複，加入陣列
				r[i] = x;
				sum += x;
				System.out.print(x + " ");
				i++;
			}
		}
		j = (double) sum / 10;
		System.out.println("\n亂數總和 = " + sum);
		System.out.println("亂數平均值 = " + j);
	}

	public static void main(String[] args) {
		System.out.print("取10個亂數為:");
		randAvg();

	}
}
