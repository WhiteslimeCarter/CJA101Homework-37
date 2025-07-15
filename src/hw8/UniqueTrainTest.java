package hw8;

import java.util.*;

public class UniqueTrainTest {
	public static void main(String[] args) {
		List<Train> trainList = Arrays.asList(new Train(202, "普悠瑪", "樹林", "花蓮", 400),
				new Train(1254, "區間", "屏東", "基隆", 700), new Train(118, "自強", "高雄", "台北", 500),
				new Train(1288, "區間", "新竹", "基隆", 400), new Train(122, "自強", "台中", "花蓮", 600),
				new Train(1222, "區間", "樹林", "七堵", 300), new Train(1254, "區間", "屏東", "基隆", 700) // 重複
		);

		// 使用 LinkedHashSet 去除重複並保留順序
		Set<Train> uniqueTrains = new LinkedHashSet<>(trainList);

		System.out.println("=== 不重複的列車清單 ===");
		for (Train train : uniqueTrains) {
			train.displayInfo();
		}
	}
}
