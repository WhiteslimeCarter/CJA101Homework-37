package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("請輸入 x：");
            int x = sc.nextInt();
            System.out.print("請輸入 y：");
            int y = sc.nextInt();

            double result = calc.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方為：" + result);
        } catch (CalException e) {
            System.out.println("自訂例外發生：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("數學例外發生：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("其他錯誤：" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
