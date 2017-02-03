package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;

public class ApplyMoney {
	private Long id;
	private String applyMoneyNum;		//申请金额
	private String applyDate;			//申请时间
	private String realUseNum;			//实用金额
	private String title;				//经费使用标题
	private String content;				//标题使用内容
	private String status;				//状态
	private RaceList raceList;			//属于哪个竞赛
	private String addStatus;			//添加信息状态
	private Set<AgreeMoneySuggest> agreeMoneySuggests = new HashSet<AgreeMoneySuggest>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApplyMoneyNum() {
		return applyMoneyNum;
	}
	public void setApplyMoneyNum(String applyMoneyNum) {
		this.applyMoneyNum = applyMoneyNum;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getRealUseNum() {
		return realUseNum;
	}
	public void setRealUseNum(String realUseNum) {
		this.realUseNum = realUseNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RaceList getRaceList() {
		return raceList;
	}
	public void setRaceList(RaceList raceList) {
		this.raceList = raceList;
	}
	public Set<AgreeMoneySuggest> getAgreeMoneySuggests() {
		return agreeMoneySuggests;
	}
	public void setAgreeMoneySuggests(Set<AgreeMoneySuggest> agreeMoneySuggests) {
		this.agreeMoneySuggests = agreeMoneySuggests;
	}
	public String getAddStatus() {
		return addStatus;
	}
	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}
	
	
}
