package hw7;

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A4 {
    public static void main(String[] args) {
        // 目標路徑
        String dirPath = "C:/data";
        String filePath = dirPath + "/Object.ser";

        // 1. 建立資料夾（若不存在）
        File dir = new File(dirPath);
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            if (created) {
                System.out.println("成功建立資料夾：" + dirPath);
            } else {
                System.err.println("資料夾建立失敗，請檢查權限！");
                return;
            }
        }

        // 2. 建立 Dog 與 Cat 物件
        Dog dog = new Dog("旺財");
        Cat cat = new Cat("咪咪");

        // 3. 寫入物件到檔案 (序列化)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(dog);
            oos.writeObject(cat);
            System.out.println("物件序列化寫入成功，路徑：" + filePath);
        } catch (IOException e) {
            System.err.println("寫入物件失敗：" + e.getMessage());
        }
    }
}

