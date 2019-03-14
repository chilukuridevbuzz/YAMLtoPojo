package com.baeldung.snakeyaml;

import java.util.List;
import java.util.Map;

public class PayLoadData {
	
	private Map <String, String> condition;
	private List<DataDetails> dataList;
	
	public Map<String, String> getCondition() {
		return condition;
	}
	public void setCondition(Map<String, String> condition) {
		this.condition = condition;
	}
	public List<DataDetails> getDataList() {
		return dataList;
	}
	public void setDataList(List<DataDetails> dataList) {
		this.dataList = dataList;
	}

	
}
