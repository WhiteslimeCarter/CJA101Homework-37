package hw1;

//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)

public class A2 {

	public static void main(String[] args) {
		int num1 = 200;
		System.out.println("200顆蛋一共是" + (num1 / 12) + "打，");
		System.out.println("剩餘" + (num1 % 12) + "顆");

	}
}
