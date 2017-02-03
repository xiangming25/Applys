package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;


/**权限*/
public class Privilege implements java.io.Serializable {
	private Long id;
	private String name;		//权限名称
	private String url;		//前端连接地址
	private String actionURL;		//返回保存地址
	private Set<Role> roles = new HashSet<Role>();
	private Privilege parentPrivilege;		//上级权限
	private Set<Privilege> childrenPrivileges = new HashSet<Privilege>();		//下级权限
	
	public Privilege() {}
	
	
	public Privilege(String name, String url,String actionURL, Privilege parent) {
		this.name = name;
		this.url = url;
		this.actionURL = actionURL;
		this.parentPrivilege = parent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Privilege getParentPrivilege() {
		return parentPrivilege;
	}


	public void setParentPrivilege(Privilege parentPrivilege) {
		this.parentPrivilege = parentPrivilege;
	}


	public Set<Privilege> getChildrenPrivileges() {
		return childrenPrivileges;
	}


	public void setChildrenPrivileges(Set<Privilege> childrenPrivileges) {
		this.childrenPrivileges = childrenPrivileges;
	}


	public String getActionURL() {
		return actionURL;
	}


	public void setActionURL(String actionURL) {
		this.actionURL = actionURL;
	}

	
	
}
