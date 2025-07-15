package hw7;

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        String fileName = "src/hw7/Data.txt"; // 建議放同樣src/hw7路徑底下
        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // 產生10個1~1000的亂數並寫入
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(1000) + 1; // nextInt(1000) 會產生0~999，+1變1~1000
                writer.write(String.valueOf(num));
                if (i < 9) {
                    writer.write(","); // 數字間用逗號分隔
                }
            }
            writer.newLine(); // 換行，方便每次寫入獨立一行
            System.out.println("已成功將10個亂數寫入 " + fileName);
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
