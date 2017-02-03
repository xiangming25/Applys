package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class User implements java.io.Serializable {
	
	private Long id;
	private String YHM;			//用户名
	private String XM;			//姓名
	private String SZDW;		//所在部门
	private String MM;			//密码
	private String ZC;			//职称
	private String TEL;			//联系电话
	private String EMAIL;		//电子邮箱\
	private Set<Role> roles = new HashSet<Role>();			//角色
	private Set<RaceList> raceLists = new HashSet<RaceList>();
	private Set<Suggest> suggests = new HashSet<Suggest>();
	private String headImageUrl;
	
	/**
	 * 判断本用户是否有指定的权限
	 * @param name
	 * @return
	 */
	public boolean hasPrivilegeByName(String name){
		
		//超级管理员有所有的权限
		if(isAdmin()){
			return true;
		}
		
		//对于普通用户
		for(Role role:roles){
			for(Privilege priv:role.getPrivileges()){
				if(priv.getName().equals(name)){
					return true;
				}
			}
		}
		return false;
		
	}
	
	/**
	 * 判断本用户是不是管理员
	 */
	public boolean isAdmin(){
		return ("admin1025".equals(YHM));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYHM() {
		return YHM;
	}
	public void setYHM(String yHM) {
		YHM = yHM;
	}
	public String getXM() {
		return XM;
	}
	public void setXM(String xM) {
		XM = xM;
	}
	public String getSZDW() {
		return SZDW;
	}
	public void setSZDW(String sZDW) {
		SZDW = sZDW;
	}
	public String getMM() {
		return MM;
	}
	public void setMM(String mM) {
		MM = mM;
	}
	public String getZC() {
		return ZC;
	}
	public void setZC(String zC) {
		ZC = zC;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<RaceList> getRaceLists() {
		return raceLists;
	}

	public void setRaceLists(Set<RaceList> raceLists) {
		this.raceLists = raceLists;
	}

	public Set<Suggest> getSuggests() {
		return suggests;
	}

	public void setSuggests(Set<Suggest> suggests) {
		this.suggests = suggests;
	}

	public String getHeadImageUrl() {
		return headImageUrl;
	}

	public void setHeadImageUrl(String headImageUrl) {
		this.headImageUrl = headImageUrl;
	}

	
}
