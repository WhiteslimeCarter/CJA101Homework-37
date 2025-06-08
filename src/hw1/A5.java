package hw1;

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
//複利公式:期末本利和＝期初本金×（1＋利率）期數次方。

public class A5 {

	public static void main(String[] args) {
		double num1 = 150, num2 = 1.02;
		for (int count = 1; count <= 10; count++) {
			num1 *= num2;
			// System.out.println("count = " + count);

		}
		// System.out.println("共有" + (num1) + "萬");
		System.out.printf("共有 = %.2f" + "萬%n", num1); // (取到小數點第二位)

	}
}
