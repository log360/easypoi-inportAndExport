package yto.excelmatch.entity;

import java.util.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
@ExcelTarget("yueJieEntity")
public class YueJieEntity  implements java.io.Serializable{
	private static final long serialVersionUID = 9096703828706L;
	@Excel(name = "生成状态", orderNum = "0", width = 20)
	private String genFlg;
	// 结算客户类型
	@Excel(name = "结算类型", orderNum = "1", width = 20)
	private String settleType;// 结算类型 0：寄付 1： 到付
	@Excel(name = "客户类型", orderNum = "2", width = 20)
	private String customerType;
	@Excel(name = "账单号码", orderNum = "3", width = 20)
	private String billNo;
	@Excel(name = "运单号码", orderNum = "4", width = 20)
	private String waybillNo;
	@Excel(name = "发件公司代码", orderNum = "5", width = 20)
	private String takingOrgCode;
	@Excel(name = "发件公司名称", orderNum = "6", width = 20)
	private String takingOrgName;
	
	// 员工 优先取取件 无则取揽收
	@Excel(name = "取件员工号", orderNum = "7", width = 20)
	private String empNo;
	@Excel(name = "取件员姓名", orderNum = "8", width = 20)
	private String empName;
	// 员工来源 0：取件 1揽收
	@Excel(name = "取件员来源", orderNum = "9", width = 20)
	private String empType;


	
	@Excel(name = "城市", orderNum = "10", width = 20)
	private String sendCityName;
	private String sendProvCode;
	@Excel(name = "省份", orderNum = "11", width = 20)
	private String sendProvName;
	
	private String subBillNo;

	@Excel(name = "客户编码", orderNum = "12", width = 20)
	private String customerCode;
	@Excel(name = "客户名称", orderNum = "13", width = 20)
	private String customerName;
	private String custOrgCode;
	private String custOrgName;
	@Excel(name = "结算客户编码", orderNum = "14", width = 20)
	private String settleCustomerCode;
	@Excel(name = "结算客户名称", orderNum = "15", width = 20)
	private String settleCustomerName;
	@Excel(name = "结算网点代码", orderNum = "16", width = 20)
	private String settleCustOrgCode;
	@Excel(name = "结算网点名称", orderNum = "17", width = 20)
	private String settleCustOrgName;

	// 实际重量
	@Excel(name = "实际重量", orderNum = "18", width = 20)
	private Double actualWeight;
	// 计费重量
	@Excel(name = "计费重量", orderNum = "19", width = 20)
	private Double chargeWeight;
	@Excel(name = "运费金额", orderNum = "20", width = 20)
	private Double transAmount;
	
	private String orderChanel;
	@Excel(name = "折扣类型", orderNum = "21", width = 20)
	private String rebateType;// 折扣类型
	@Excel(name = "折扣率", orderNum = "22", width = 20)
	private Double discountRate;// 折扣率
	@Excel(name = "折扣金额", orderNum = "23", width = 20)
	private Double rebateAmount;// 折扣金额
	
	
	private Double takingWeight;// 揽收重
	private Double receiveWeight;// 取件重
	@Excel(name = "结算金额", orderNum = "24", width = 20)
	private Double amount;

	
	@Excel(name = "代收货款手续费", orderNum = "26", width = 20)
	private Double codFeeAmount;
	// 手续费费率
	private Double codFeeRate;
	@Excel(name = "保价金额", orderNum = "25", width = 20)
	private Double keepAmount;// 保价金额

	@Excel(name = "总结算金额", orderNum = "27", width = 20)
	private Double balanceAmount;// 保价金额
	
	
	private Date modifyTime;
	
	@Excel(name = "揽收时间", orderNum = "28",format = "yyyy-MM-dd HH:mm:ss", width = 20)
	private Date takingTime;// 揽收时间
	
	@Excel(name = "揽收上传时间", orderNum = "29",format = "yyyy-MM-dd HH:mm:ss", width = 20)
	private Date takingUploadTime;
	
	@Excel(name = "取件时间", orderNum = "30", format = "yyyy-MM-dd HH:mm:ss",width = 20)
	private Date receiveTime;// 取件时间
	
	@Excel(name = "取件上传时间", orderNum = "31",format = "yyyy-MM-dd HH:mm:ss", width = 20)
	private Date receiveUploadTime;
	
	// 0 取件 1 揽收 2重计费 3签收
	@Excel(name = "计费节点", orderNum = "32", width = 20)
	private String chargeChannle;
	
	private String desProvCode;
	
	@Excel(name = "目的省份", orderNum = "33", width = 20)
	private String desProvName;
	private String desCityCode;
	@Excel(name = "目的城市", orderNum = "34", width = 20)
	private String desCityName;
	

	
	@Excel(name = "目的网点代码", orderNum = "35", width = 20)
	private String desOrgCode;
	@Excel(name = "目的网点名称", orderNum = "36", width = 20)
	private String desOrgName;
	@Excel(name = "产品时效", orderNum = "37", width = 20)
	private String effectiveTypeCode;
	private String effectiveTypeName;
	private int quantity;
	
	private Date auditTime;
	private String auditEmpNo;
	private String auditEmpName;
	private String auditOrgCode;
	private String auditOrgName;
	
	@Excel(name = "账单生成时间", orderNum = "38",format = "yyyy-MM-dd HH:mm:ss", width = 20)
	private Date billCreateTime;
	
	@Excel(name = "账单生成人员工号", orderNum = "39", width = 20)
	private String billCreateEmpNo;
	@Excel(name = "账单生成人员姓名", orderNum = "40", width = 20)
	private String billCreateEmpName;
	
	
	
	@Excel(name = "计费时间", orderNum = "41", format = "yyyy-MM-dd HH:mm:ss", width = 20)
	private Date createTime;
	
	private String billCreateOrgCode;
	private String billCreateOrgName;
	private String delKey;
	private String auditFlg;
	private Double diffAmount;
	
	
	private String diffFlag;
	private String sendCityCode;

	

	// 0正常，1转寄，2退回
	@Excel(name = "业务类型", orderNum = "42", width = 20)
	private String businessType; // 业务类型

	private String payType;// 支付类型 0：现金 1：代扣
	
	private Date payTime;// 支付时间
	private String payStatus;// 支付状态 0：未支付 1：已支付
	private String expressContentCode;// 快件内容
	
	private Date priceTime;

	// 代收货款金额
	private Double codAmount;
	// 代收货款手续费



	
	
	public boolean equals(YueJieEntity e) {
		if (this.amount != e.amount) {
			return false;
		}
		if(!this.settleCustomerCode.equals(e.settleCustomerCode))
		{
			return false;
		}
		return true;
	}
	
	
	
	
	
	public String getGenFlg() {
		return genFlg;
	}

	public void setGenFlg(String genFlg) {
		this.genFlg = genFlg;
	}

	public String getSettleType() {
		return settleType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getTakingOrgCode() {
		return takingOrgCode;
	}

	public void setTakingOrgCode(String takingOrgCode) {
		this.takingOrgCode = takingOrgCode;
	}

	public String getTakingOrgName() {
		return takingOrgName;
	}

	public void setTakingOrgName(String takingOrgName) {
		this.takingOrgName = takingOrgName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getSendCityName() {
		return sendCityName;
	}

	public void setSendCityName(String sendCityName) {
		this.sendCityName = sendCityName;
	}

	public String getSendProvCode() {
		return sendProvCode;
	}

	public void setSendProvCode(String sendProvCode) {
		this.sendProvCode = sendProvCode;
	}

	public String getSendProvName() {
		return sendProvName;
	}

	public void setSendProvName(String sendProvName) {
		this.sendProvName = sendProvName;
	}

	public String getSubBillNo() {
		return subBillNo;
	}

	public void setSubBillNo(String subBillNo) {
		this.subBillNo = subBillNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustOrgCode() {
		return custOrgCode;
	}

	public void setCustOrgCode(String custOrgCode) {
		this.custOrgCode = custOrgCode;
	}

	public String getCustOrgName() {
		return custOrgName;
	}

	public void setCustOrgName(String custOrgName) {
		this.custOrgName = custOrgName;
	}

	public String getSettleCustomerCode() {
		return settleCustomerCode;
	}

	public void setSettleCustomerCode(String settleCustomerCode) {
		this.settleCustomerCode = settleCustomerCode;
	}

	public String getSettleCustomerName() {
		return settleCustomerName;
	}

	public void setSettleCustomerName(String settleCustomerName) {
		this.settleCustomerName = settleCustomerName;
	}

	public String getSettleCustOrgCode() {
		return settleCustOrgCode;
	}

	public void setSettleCustOrgCode(String settleCustOrgCode) {
		this.settleCustOrgCode = settleCustOrgCode;
	}

	public String getSettleCustOrgName() {
		return settleCustOrgName;
	}

	public void setSettleCustOrgName(String settleCustOrgName) {
		this.settleCustOrgName = settleCustOrgName;
	}

	public Double getActualWeight() {
		return actualWeight;
	}

	public void setActualWeight(Double actualWeight) {
		this.actualWeight = actualWeight;
	}

	public Double getChargeWeight() {
		return chargeWeight;
	}

	public void setChargeWeight(Double chargeWeight) {
		this.chargeWeight = chargeWeight;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public String getOrderChanel() {
		return orderChanel;
	}

	public void setOrderChanel(String orderChanel) {
		this.orderChanel = orderChanel;
	}

	public String getRebateType() {
		return rebateType;
	}

	public void setRebateType(String rebateType) {
		this.rebateType = rebateType;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public Double getRebateAmount() {
		return rebateAmount;
	}

	public void setRebateAmount(Double rebateAmount) {
		this.rebateAmount = rebateAmount;
	}

	public Double getTakingWeight() {
		return takingWeight;
	}

	public void setTakingWeight(Double takingWeight) {
		this.takingWeight = takingWeight;
	}

	public Double getReceiveWeight() {
		return receiveWeight;
	}

	public void setReceiveWeight(Double receiveWeight) {
		this.receiveWeight = receiveWeight;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getCodFeeAmount() {
		return codFeeAmount;
	}

	public void setCodFeeAmount(Double codFeeAmount) {
		this.codFeeAmount = codFeeAmount;
	}

	public Double getCodFeeRate() {
		return codFeeRate;
	}

	public void setCodFeeRate(Double codFeeRate) {
		this.codFeeRate = codFeeRate;
	}

	public Double getKeepAmount() {
		return keepAmount;
	}

	public void setKeepAmount(Double keepAmount) {
		this.keepAmount = keepAmount;
	}

	public Double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getTakingTime() {
		return takingTime;
	}

	public void setTakingTime(Date takingTime) {
		this.takingTime = takingTime;
	}

	public Date getTakingUploadTime() {
		return takingUploadTime;
	}

	public void setTakingUploadTime(Date takingUploadTime) {
		this.takingUploadTime = takingUploadTime;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Date getReceiveUploadTime() {
		return receiveUploadTime;
	}

	public void setReceiveUploadTime(Date receiveUploadTime) {
		this.receiveUploadTime = receiveUploadTime;
	}

	public String getChargeChannle() {
		return chargeChannle;
	}

	public void setChargeChannle(String chargeChannle) {
		this.chargeChannle = chargeChannle;
	}

	public String getDesProvCode() {
		return desProvCode;
	}

	public void setDesProvCode(String desProvCode) {
		this.desProvCode = desProvCode;
	}

	public String getDesProvName() {
		return desProvName;
	}

	public void setDesProvName(String desProvName) {
		this.desProvName = desProvName;
	}

	public String getDesCityCode() {
		return desCityCode;
	}

	public void setDesCityCode(String desCityCode) {
		this.desCityCode = desCityCode;
	}

	public String getDesCityName() {
		return desCityName;
	}

	public void setDesCityName(String desCityName) {
		this.desCityName = desCityName;
	}

	public String getDesOrgCode() {
		return desOrgCode;
	}

	public void setDesOrgCode(String desOrgCode) {
		this.desOrgCode = desOrgCode;
	}

	public String getDesOrgName() {
		return desOrgName;
	}

	public void setDesOrgName(String desOrgName) {
		this.desOrgName = desOrgName;
	}

	public String getEffectiveTypeCode() {
		return effectiveTypeCode;
	}

	public void setEffectiveTypeCode(String effectiveTypeCode) {
		this.effectiveTypeCode = effectiveTypeCode;
	}

	public String getEffectiveTypeName() {
		return effectiveTypeName;
	}

	public void setEffectiveTypeName(String effectiveTypeName) {
		this.effectiveTypeName = effectiveTypeName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditEmpNo() {
		return auditEmpNo;
	}

	public void setAuditEmpNo(String auditEmpNo) {
		this.auditEmpNo = auditEmpNo;
	}

	public String getAuditEmpName() {
		return auditEmpName;
	}

	public void setAuditEmpName(String auditEmpName) {
		this.auditEmpName = auditEmpName;
	}

	public String getAuditOrgCode() {
		return auditOrgCode;
	}

	public void setAuditOrgCode(String auditOrgCode) {
		this.auditOrgCode = auditOrgCode;
	}

	public String getAuditOrgName() {
		return auditOrgName;
	}

	public void setAuditOrgName(String auditOrgName) {
		this.auditOrgName = auditOrgName;
	}

	public Date getBillCreateTime() {
		return billCreateTime;
	}

	public void setBillCreateTime(Date billCreateTime) {
		this.billCreateTime = billCreateTime;
	}

	public String getBillCreateEmpNo() {
		return billCreateEmpNo;
	}

	public void setBillCreateEmpNo(String billCreateEmpNo) {
		this.billCreateEmpNo = billCreateEmpNo;
	}

	public String getBillCreateEmpName() {
		return billCreateEmpName;
	}

	public void setBillCreateEmpName(String billCreateEmpName) {
		this.billCreateEmpName = billCreateEmpName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBillCreateOrgCode() {
		return billCreateOrgCode;
	}

	public void setBillCreateOrgCode(String billCreateOrgCode) {
		this.billCreateOrgCode = billCreateOrgCode;
	}

	public String getBillCreateOrgName() {
		return billCreateOrgName;
	}

	public void setBillCreateOrgName(String billCreateOrgName) {
		this.billCreateOrgName = billCreateOrgName;
	}

	public String getDelKey() {
		return delKey;
	}

	public void setDelKey(String delKey) {
		this.delKey = delKey;
	}

	public String getAuditFlg() {
		return auditFlg;
	}

	public void setAuditFlg(String auditFlg) {
		this.auditFlg = auditFlg;
	}

	public Double getDiffAmount() {
		return diffAmount;
	}

	public void setDiffAmount(Double diffAmount) {
		this.diffAmount = diffAmount;
	}

	public String getDiffFlag() {
		return diffFlag;
	}

	public void setDiffFlag(String diffFlag) {
		this.diffFlag = diffFlag;
	}

	public String getSendCityCode() {
		return sendCityCode;
	}

	public void setSendCityCode(String sendCityCode) {
		this.sendCityCode = sendCityCode;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getExpressContentCode() {
		return expressContentCode;
	}

	public void setExpressContentCode(String expressContentCode) {
		this.expressContentCode = expressContentCode;
	}

	public Date getPriceTime() {
		return priceTime;
	}

	public void setPriceTime(Date priceTime) {
		this.priceTime = priceTime;
	}

	public Double getCodAmount() {
		return codAmount;
	}

	public void setCodAmount(Double codAmount) {
		this.codAmount = codAmount;
	}

	public boolean equals(Object o) {
		if (o==null) {
			return false;
		}
		YueJieEntity y =(YueJieEntity)o;
		if (this.amount != y.getAmount()) {
			return false;
		}
		if (!this.settleCustomerCode.equals(y.getSettleCustomerCode())) {
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		return "YueJieEntity [genFlg=" + genFlg + ", settleType=" + settleType + ", customerType=" + customerType
				+ ", billNo=" + billNo + ", waybillNo=" + waybillNo + ", takingOrgCode=" + takingOrgCode
				+ ", takingOrgName=" + takingOrgName + "]";
	}
	
	
	
	
	

}
