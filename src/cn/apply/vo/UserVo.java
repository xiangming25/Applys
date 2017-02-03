package cn.apply.vo;

public class UserVo {
	private String YHM;			//用户名
	private String XM;			//姓名
	private String SZDW;		//所在部门
	private String MM;			//密码
	private String ZC;			//职称
	private String TEL;			//联系电话
	private String EMAIL;		//电子邮箱
	private String searchContent;		//搜索内容
	private Long roleId;			//角色ID
	private String roleIds;			//角色IDS
	private String headImageUrl;	//头像路径
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
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	public String getHeadImageUrl() {
		return headImageUrl;
	}
	public void setHeadImageUrl(String headImageUrl) {
		this.headImageUrl = headImageUrl;
	}
	
}
