package cn.apply.domain;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Role implements java.io.Serializable  {
	private Long id;
	private String name;
	private Set<User> users = new HashSet<User>();
	private String ename;			//英文名字
	private String description;
	
	/*public Role(String name,String ename,String description){
		this.name = name;
		this.ename = ename;
		this.description = description;
	}*/
	
	private Set<Privilege> privileges = new HashSet<Privilege>();
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
	
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	
	
	
}
