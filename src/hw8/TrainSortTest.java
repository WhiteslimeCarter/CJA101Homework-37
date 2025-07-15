package hw8;

import java.util.*;

public class TrainSortTest {
    public static void main(String[] args) {
        List<Train> trainList = Arrays.asList(
            new Train(202, "普悠瑪", "樹林", "花蓮", 400),
            new Train(1254, "區間", "屏東", "基隆", 700),
            new Train(118, "自強", "高雄", "台北", 500),
            new Train(1288, "區間", "新竹", "基隆", 400),
            new Train(122, "自強", "台中", "花蓮", 600),
            new Train(1222, "區間", "樹林", "七堵", 300),
            new Train(1254, "區間", "屏東", "基隆", 700) // 重複沒關係，這題主要是排序
        );

        // 根據班次編號由大到小排序
        trainList.sort((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));

        System.out.println("=== 按班次編號由大到小排序後的列車資訊 ===");
        for (Train train : trainList) {
            train.displayInfo();
        }
    }
}
