package hw2;

//請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)

public class A1 {
	public static void main(String[] args) {

		int j = 0;
		for (int i = 0; i <= 1000; i++) { // 執行1000次,代表1~1000
			if (i % 2 == 0)               // 如果i能被2整除
				j += i;                   // 才執行j+i
		}
		System.out.println("1～1000的偶數和 = " + j);
	}
}