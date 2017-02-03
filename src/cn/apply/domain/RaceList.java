package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class RaceList implements java.io.Serializable {
	private Long id;	
	private User user;   		//负责人信息
	private RaceBaseInfo raceBaseInfo;	//竞赛基本信息
	private String planGoal;		//计划及目标
	private Set<Award> awards = new HashSet<Award>();	//获奖情况
	private Set<ApplyMoney> applyMoneys = new HashSet<ApplyMoney>();	//申请金额
	private String raceYear;		//第几届
	private String raceDate;			//参赛时间
	private String status;			//审核状态
	private String agreeMoneyStatus;	//审批金额状态
	private String stuNum;			//参赛学生人数
	private String academy;		//所在学院
	private String lastAgreeMoney;		//最后审批金额
	private Set<Suggest> suggests = new HashSet<Suggest>();
	
	private String raceName;		//竞赛名称
	private String organization;	//举办单位
	private String raceGrade;		//竞赛级别
	private String organAcademy;	//承办单位
	private String editUserId;		//填报人的工作号	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	public String getAgreeMoneyStatus() {
		return agreeMoneyStatus;
	}
	public void setAgreeMoneyStatus(String agreeMoneyStatus) {
		this.agreeMoneyStatus = agreeMoneyStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public RaceBaseInfo getRaceBaseInfo() {
		return raceBaseInfo;
	}
	public void setRaceBaseInfo(RaceBaseInfo raceBaseInfo) {
		this.raceBaseInfo = raceBaseInfo;
	}	
	
	public String getPlanGoal() {
		return planGoal;
	}
	public void setPlanGoal(String planGoal) {
		this.planGoal = planGoal;
	}
	public Set<Award> getAwards() {
		return awards;
	}
	public void setAwards(Set<Award> awards) {
		this.awards = awards;
	}
	public Set<ApplyMoney> getApplyMoneys() {
		return applyMoneys;
	}
	public void setApplyMoneys(Set<ApplyMoney> applyMoneys) {
		this.applyMoneys = applyMoneys;
	}
	public String getRaceYear() {
		return raceYear;
	}
	
	public String getRaceDate() {
		return raceDate;
	}
	public void setRaceDate(String raceDate) {
		this.raceDate = raceDate;
	}
	public void setRaceYear(String raceYear) {
		this.raceYear = raceYear;
	}
	public String getStatus() {	
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	
	
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getLastAgreeMoney() {
		return lastAgreeMoney;
	}
	public void setLastAgreeMoney(String lastAgreeMoney) {
		this.lastAgreeMoney = lastAgreeMoney;
	}
	public Set<Suggest> getSuggests() {
		return suggests;
	}
	public void setSuggests(Set<Suggest> suggests) {
		this.suggests = suggests;
	}
	public String getRaceName() {
		return raceName;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getRaceGrade() {
		return raceGrade;
	}
	public void setRaceGrade(String raceGrade) {
		this.raceGrade = raceGrade;
	}
	public String getOrganAcademy() {
		return organAcademy;
	}
	public void setOrganAcademy(String organAcademy) {
		this.organAcademy = organAcademy;
	}
	public String getEditUserId() {
		return editUserId;
	}
	public void setEditUserId(String editUserId) {
		this.editUserId = editUserId;
	}
	
	
	
	
	
}
