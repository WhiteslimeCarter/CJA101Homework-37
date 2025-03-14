package hw2;

/*輸出九九乘法表
 * 1.使用for迴圈+while迴圈
 * 2.使用for迴圈+do while迴圈
 * 3.使用while迴圈+do while迴圈
 */

public class TestNineNine {
	public static void main(String[] args) {

//#1
		for (int i = 1; i <= 9;i++) {
			int j = 1;
			while(j <= 9) {
			System.out.print(i + "*" + j + "=" + i*j + "\t");
			j++;
			}
			System.out.println();
		}

//#2
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}

//#3
//		int i = 0;
//		while (i <= 8) {
//			i++;
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}
		
		
	}
}