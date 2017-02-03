package cn.apply.domain;

public class Award {
	private Long id;
	private String awardTime;		//获奖时间
	private String awardInfo;		//获奖情况
	private String peopleNum;		//参赛人数
	private String teamName;		//团队名字
	private String awardGrade;		//获奖级别
	private String awardLevel;		//获奖等级
	private String awardAccessory;	//获奖附件
	private RaceList raceList;		//属于哪个竞赛的
	
	private String raceName;		//竞赛名称
	private String projectName;		//项目名称
	private String teacherId;		//老师信息
	private String teacherName;		//老师姓名
	private String studentName;		//学生 名字
	private String studentNum;		//学号
	private String academy;			//所在学院
	private String status;			//状态
	private String reason;			//学院审批的理由
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAwardTime() {
		return awardTime;
	}
	public void setAwardTime(String awardTime) {
		this.awardTime = awardTime;
	}
	public String getAwardInfo() {
		return awardInfo;
	}
	public void setAwardInfo(String awardInfo) {
		this.awardInfo = awardInfo;
	}
	public String getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(String peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getAwardGrade() {
		return awardGrade;
	}
	public void setAwardGrade(String awardGrade) {
		this.awardGrade = awardGrade;
	}
	public String getAwardAccessory() {
		return awardAccessory;
	}
	public void setAwardAccessory(String awardAccessory) {
		this.awardAccessory = awardAccessory;
	}
	public RaceList getRaceList() {
		return raceList;
	}
	public void setRaceList(RaceList raceList) {
		this.raceList = raceList;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getAwardLevel() {
		return awardLevel;
	}
	public void setAwardLevel(String awardLevel) {
		this.awardLevel = awardLevel;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getRaceName() {
		return raceName;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
}
