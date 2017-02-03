package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;



public class RaceBaseInfo {
	
	private Long id;
	private String raceName;
	private String organization;		//主办单位
	private String raceTime;			//参赛时间
	private String grade;			//竞赛级别
	private String raceWay;			//竞赛方式
	private String range;			//参赛学生范围
	private String raceInfo;		//竞赛简介
	private String stuNumRange;		//参赛人数范围
	private String academy;		//竞赛所在学院
	private Set<RaceList> raceLists = new HashSet<RaceList>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRaceTime() {
		return raceTime;
	}
	public void setRaceTime(String raceTime) {
		this.raceTime = raceTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRaceWay() {
		return raceWay;
	}
	public void setRaceWay(String raceWay) {
		this.raceWay = raceWay;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getRaceInfo() {
		return raceInfo;
	}
	public void setRaceInfo(String raceInfo) {
		this.raceInfo = raceInfo;
	}
	public String getStuNumRange() {
		return stuNumRange;
	}
	public void setStuNumRange(String stuNumRange) {
		this.stuNumRange = stuNumRange;
	}
	
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public Set<RaceList> getRaceLists() {
		return raceLists;
	}
	public void setRaceLists(Set<RaceList> raceLists) {
		this.raceLists = raceLists;
	}
	
		
}
