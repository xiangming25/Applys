package cn.apply.domain;

public class AgreeMoneySuggest {
	private Long id;
	private String suggestDate;			//审批时间
	private String content;				//审批的具体内容
	private ApplyMoney applyMoney;		//是哪一条审批金额的意见
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSuggestDate() {
		return suggestDate;
	}
	public void setSuggestDate(String suggestDate) {
		this.suggestDate = suggestDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ApplyMoney getApplyMoney() {
		return applyMoney;
	}
	public void setApplyMoney(ApplyMoney applyMoney) {
		this.applyMoney = applyMoney;
	}
	
	
	
}
