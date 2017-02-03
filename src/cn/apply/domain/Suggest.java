package cn.apply.domain;

@SuppressWarnings("serial")
public class Suggest implements java.io.Serializable {
	private Long id;
	private String agreeOrNot;
	private String content;
	private String time;	
	private RaceList raceList;
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAgreeOrNot() {
		return agreeOrNot;
	}
	public void setAgreeOrNot(String agreeOrNot) {
		this.agreeOrNot = agreeOrNot;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public RaceList getRaceList() {
		return raceList;
	}
	public void setRaceList(RaceList raceList) {
		this.raceList = raceList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
