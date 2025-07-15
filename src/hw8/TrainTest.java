package hw8;

import java.util.*;

public class TrainTest {
    // 主方法
    public static void main(String[] args) {
        // 建立集合
        ArrayList<Train> trainList = new ArrayList<>();

        // 加入七筆列車資料
        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複班次，用於測試

        // 列出所有列車資訊
        System.out.println("=== 所有列車資訊 ===");
        for (Train train : trainList) {
            train.displayInfo();
        }
    }
}
   