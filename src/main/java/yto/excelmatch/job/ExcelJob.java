package yto.excelmatch.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;

public class ExcelJob {
	public static final String filePath = "D:/excelC/";

	    public  <T> List<T> importExcel(String filePath, Integer titleRows, Integer headerRows, Class<T> pojoClass){
	        ImportParams params = new ImportParams();
	        params.setTitleRows(titleRows);
	        params.setHeadRows(headerRows);
	        InputStream inputStream;
	        List<T> list = null;
			try {
				inputStream = new FileInputStream(new File(filePath));
				list = ExcelImportUtil.importExcel( inputStream, pojoClass, params);
			} catch (Exception e) {
				System.out.println(e);
			}
	        return list;
	    }
	    
	    
	    
	    
	    public <T> List<T>  test2(String filePath, Integer titleRows, Integer headerRows, Class<T> pojoClass) {
	        ImportParams params = new ImportParams();
	        params.setTitleRows(1);
	        params.setHeadRows(1);
	        List<T> list = ExcelImportUtil.importExcel( new File(filePath),  pojoClass, params);
	        return list;
	    }
	    

		public <T>  void writeCompareResult(List<T> compareResult, Class<T> pojoClass)  {
			ExportParams exportParams = new ExportParams();
			 Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, compareResult);
			 OutputStream stream;
			try {
				stream = new FileOutputStream(new File(filePath + "比较结果.xls"));
				workbook.write(stream );
				ExcelExportUtil.closeExportBigExcel();
				stream.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			 
		}
		
	   
}
