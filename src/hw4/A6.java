package hw4;

// 班上有8位同學，他們進行了6次考試結果如下：
// 請算出每位同學考最高分的次數
// (提示：二維陣列)

public class A6 {
	public static void main(String[] args) {
		// 二維陣列，6次考試，每次8位同學分數
		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 統計每位同學得最高分的次數
		int[] topCount = new int[8];

		for (int i = 0; i < scores.length; i++) {
			int max = scores[i][0];
			// 找出當次最高分
			for (int j = 1; j < scores[i].length; j++) {
				if (scores[i][j] > max) {
					max = scores[i][j];
				}
			}

			// 將得最高分的學生記一次
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] == max) {
					topCount[j]++;
				}
			}
		}

		// 輸出結果
		for (int i = 0; i < topCount.length; i++) {
			System.out.println((i + 1) + "號同學考最高分的次數：" + topCount[i]);
		}
	}
}
