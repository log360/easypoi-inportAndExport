package yto.excelmatch.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yto.excelmatch.entity.YueJieEntity;

public class YueJieCompare {
	public static void main(String[] args) {
		ExcelJob excelJob =new ExcelJob();
		String filePath1 = ExcelJob.filePath + "月结1.xlsx";
		Integer titleRows = 0;
		Integer headerRows = 1;
		List<YueJieEntity> yueJieList = excelJob.importExcel(filePath1, titleRows, headerRows, YueJieEntity.class);
		Map<String, YueJieEntity> map1 = setMap(yueJieList);
		String filePath2 = ExcelJob.filePath + "月结2.xlsx";
		List<YueJieEntity> yueJieList2 = excelJob.importExcel(filePath2, titleRows, headerRows, YueJieEntity.class);
		Map<String, YueJieEntity> map2 = setMap(yueJieList2);
		List<YueJieEntity> compareResult = compareResult(map1,map2);
		excelJob.writeCompareResult(compareResult,YueJieEntity.class);
	}


	private static List<YueJieEntity>  compareResult(Map<String, YueJieEntity> map1, Map<String, YueJieEntity> map2 ) {
		List<YueJieEntity> compareResult = new ArrayList<YueJieEntity>(); 
		for (Map.Entry<String,YueJieEntity> entry : map1.entrySet()) {
			
			YueJieEntity v1 = (YueJieEntity)entry.getValue();
			YueJieEntity v2 = (YueJieEntity) map2.get(entry.getKey());
			if(!v1.equals(v2))
			{
				compareResult.add(v1);
			}
			
		}
		System.out.println(compareResult);
		return compareResult;
		
	}

	private static Map<String, YueJieEntity> setMap(List<YueJieEntity> list) {
		Map<String, YueJieEntity> map = new HashMap<String, YueJieEntity>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getWaybillNo(),list.get(i));
		}
		return map;
	}
	
}
