package hw7;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A3 {

    /**
     * 複製檔案內容，從 sourcePath 複製到 destPath
     * @param sourcePath 來源檔案路徑
     * @param destPath 目標檔案路徑
     * @throws IOException 若檔案讀寫發生錯誤會拋出例外
     */
    public static void copyFile(String sourcePath, String destPath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {
            
            byte[] buffer = new byte[8192]; // 8KB緩衝區
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String source = "src/hw7/Sample.txt";  // 來源檔案
        String dest = "src/hw7/Sample_copy.txt";  // 複製到的新檔案
        
        try {
            copyFile(source, dest);
            System.out.println("檔案複製完成: " + source + " -> " + dest);
        } catch (IOException e) {
            System.err.println("檔案複製失敗：" + e.getMessage());
        }
    }
}
