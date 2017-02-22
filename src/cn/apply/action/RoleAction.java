package cn.apply.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.apply.base.BaseAction;
import cn.apply.domain.Role;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class RoleAction extends BaseAction<Role> {
	
	/**
	 * 角色列表
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		return "list";
	}
	
	/**
	 * 角色信息保存
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		return "save";
	}
	
	/**
	 * 角色信息详情
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception {
		return "detail";
	}
}
