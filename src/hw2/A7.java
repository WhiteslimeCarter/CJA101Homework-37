package hw2;

/*請設計一隻Java程式，輸出結果為以下：
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */

public class A7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1)
					System.out.print("A");
				else if (i == 2)
					System.out.print("B");
				else if (i == 3)
					System.out.print("C");
				else if (i == 4)
					System.out.print("D");
				else if (i == 5)
					System.out.print("E");
				else if (i == 6)
					System.out.print("F");
			}
			System.out.println();
		}
	}
}
