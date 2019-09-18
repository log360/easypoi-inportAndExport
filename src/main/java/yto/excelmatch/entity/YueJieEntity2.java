package yto.excelmatch.entity;

import java.util.Date;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
@ExcelTarget("yueJieEntity")
public class YueJieEntity2  implements java.io.Serializable{
	private static final long serialVersionUID = 90967034528706L;
	
	@Excel(name = "生成状态")
	private String genFlg;
	// 结算客户类型

	public String getGenFlg() {
		return genFlg;
	}

	public void setGenFlg(String genFlg) {
		this.genFlg = genFlg;
	}

	@Override
	public String toString() {
		return "genFlg=" + genFlg + "";
	}
	
	

}
