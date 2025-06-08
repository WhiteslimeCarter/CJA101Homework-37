package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class A3 {
	
	public static void main(String[] args) {
		int t1 = 256559, t2 = t1 / 60, t3 = t2 / 60, t4 = t3 / 24;
		int t5 = t1 % (60 * 60 * 24);
		System.out.println("256559秒為" + t4 + "天," + t3 + "小時," + t2 + "分,剩餘" + t5 + "秒.");
		
	}
}
