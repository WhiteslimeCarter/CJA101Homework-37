package hw7;

//請自行建立一個文字檔Sample.txt，內容如下：
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

import java.io.*;

public class A1 {
	public static void main(String[] args) {
		System.out.println("當前工作目錄：" + System.getProperty("user.dir"));
		String fileName = "src/hw7/Sample.txt";
		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("找不到檔案：" + fileName);
			return;
		}

		long byteCount = file.length();
		int charCount = 0;
		int lineCount = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				lineCount++;
				// 計算字元數，包含換行字元
				charCount += line.length() + System.lineSeparator().length();
			}
		} catch (IOException e) {
			System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
			return;
		}

		System.out.println(fileName + " 檔案共有 " + byteCount + " 個位元組，" + charCount + " 個字元，" + lineCount + " 列資料");
	}
}
