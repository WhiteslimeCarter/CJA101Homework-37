package hw8;

import java.util.*;

public class UniqueSortedTrainTest {
    public static void main(String[] args) {
        // 原始資料（包含重複的項目）
        List<Train> trainList = Arrays.asList(
            new Train(202, "普悠瑪", "樹林", "花蓮", 400),
            new Train(1254, "區間", "屏東", "基隆", 700),
            new Train(118, "自強", "高雄", "台北", 500),
            new Train(1288, "區間", "新竹", "基隆", 400),
            new Train(122, "自強", "台中", "花蓮", 600),
            new Train(1222, "區間", "樹林", "七堵", 300),
            new Train(1254, "區間", "屏東", "基隆", 700) // 重複
        );

        // 使用 Set 去除重複（equals + hashCode 生效）
        Set<Train> uniqueTrainSet = new HashSet<>(trainList);

        // 將 Set 轉回 List 以進行排序
        List<Train> sortedList = new ArrayList<>(uniqueTrainSet);

        // 按班次編號由大排到小
        sortedList.sort((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));

        // 輸出結果
        System.out.println("=== 不重複且依班次編號由大到小排列的列車清單 ===");
        for (Train train : sortedList) {
            train.displayInfo();
        }
    }
}
