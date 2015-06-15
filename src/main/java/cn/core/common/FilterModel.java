package cn.core.common;

import java.util.HashMap;
import java.util.Map;

//姝odel 鏄粎渚涘瓨鍌ㄨ繃婊ゆ潯浠剁殑鏁版嵁
public class FilterModel {
	// 鎺堜俊
	private String sponsors;// 璧勬柟
	private String memerid;// 浼氬憳鍗″彿
	private String idcard;// 韬唤璇佸彿
	private String bank_number;// 閾惰鍗″彿
	private String nickname;// 鏄电О
	private String telephone;// 鎵嬫満鍙�
	private String ordercode;// 璁㈠崟鍙�
	private String rerurncode;// 閫�揣鍗曞彿
	private String startDate;// 寮�鏃堕棿
	private String endDate;// 缁撴潫鏃堕棿

	// 閿�敭
	private String orderId;// 璁㈠崟缂栫爜
	private String membercode;// 浼氬憳鍙�
	private String saleStore;// 鍟嗗満
	private String orderNum;// 璁㈠崟鏁伴噺
	private String orderAmount;// 璁㈠崟閲戦
	private String orderTime;// 璁㈠崟鏃堕棿
	private String orderStatus;// 璁㈠崟鐘舵�
	private String payStatus;// 浠樻鐘舵�

	// 閫�揣
	private String returnId;// 閫�揣缂栧彿
	// 璁㈠崟缂栧彿 鍚岄攢鍞� //浼氬憳鍙�鍚岄攢鍞�
	private String returnStore; // 鍟嗗満
	private String returnNum;// 閫�揣鏁伴噺
	private String returnAmount;// 閫�揣閲戦
	private String returnTime;// 閫�揣鏃堕棿
	private String returnStatus;// 閫�揣鐘舵�

	// 鍒嗘湡
	// 浼氬憳鍙�
	private String brankCode;// 閾惰鍗″彿
	// 閿�敭娴佹按鍙�
	private String spendAmount;// 娑堣垂閲戦
	private String periods;// 鏈熸暟
	private String minimumAmount;// 鏈�綆棰濆害
	private String repayTime;// 杩樻鏃ユ湡

	// 杩樻
	// 杩樻鏃ユ湡
	// 閾惰鍗″彿
	// 浼氬憳鍙� //搴旇繕閲戦
	private String returnedAmount;// 宸茶繕閲戦

	public String getSponsors() {
		return sponsors;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("sponsors", sponsors);
		map.put("memerid", memerid);
		map.put("idcard", idcard);
		map.put("nickname", nickname);
		map.put("telephone", telephone);
		map.put("ordercode", ordercode);
		map.put("rerurncode", rerurncode);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("bank_number", bank_number);

		map.put("orderId", orderId);
		map.put("membercode", membercode);
		map.put("saleStore", saleStore);
		map.put("orderNum", orderNum);
		map.put("orderAmount", orderAmount);
		map.put("orderTime", orderTime);
		map.put("orderStatus", orderStatus);
		map.put("payStatus", payStatus);

		map.put("returnId", returnId);
		map.put("returnStore", returnStore);
		map.put("returnAmount", returnAmount);
		map.put("returnTime", returnTime);
		map.put("returnStatus", returnStatus);

		map.put("brankCode", brankCode);
		map.put("spendAmount", spendAmount);
		map.put("periods", periods);
		map.put("minimumAmount", minimumAmount);
		map.put("repayTime", repayTime);

		map.put("returnedAmount", returnedAmount);
		return map;

	}

	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}

	public String getMemerid() {
		return memerid;
	}

	public void setMemerid(String memerid) {
		this.memerid = memerid;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getRerurncode() {
		return rerurncode;
	}

	public void setRerurncode(String rerurncode) {
		this.rerurncode = rerurncode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getBank_number() {
		return bank_number;
	}

	public void setBank_number(String bank_number) {
		this.bank_number = bank_number;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMembercode() {
		return membercode;
	}

	public void setMembercode(String membercode) {
		this.membercode = membercode;
	}

	public String getSaleStore() {
		return saleStore;
	}

	public void setSaleStore(String saleStore) {
		this.saleStore = saleStore;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getReturnId() {
		return returnId;
	}

	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	public String getReturnStore() {
		return returnStore;
	}

	public void setReturnStore(String returnStore) {
		this.returnStore = returnStore;
	}

	public String getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(String returnNum) {
		this.returnNum = returnNum;
	}

	public String getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public String getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

	public String getBrankCode() {
		return brankCode;
	}

	public void setBrankCode(String brankCode) {
		this.brankCode = brankCode;
	}

	public String getSpendAmount() {
		return spendAmount;
	}

	public void setSpendAmount(String spendAmount) {
		this.spendAmount = spendAmount;
	}

	public String getPeriods() {
		return periods;
	}

	public void setPeriods(String periods) {
		this.periods = periods;
	}

	public String getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(String minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public String getRepayTime() {
		return repayTime;
	}

	public void setRepayTime(String repayTime) {
		this.repayTime = repayTime;
	}

	public String getReturnedAmount() {
		return returnedAmount;
	}

	public void setReturnedAmount(String returnedAmount) {
		this.returnedAmount = returnedAmount;
	}

}
