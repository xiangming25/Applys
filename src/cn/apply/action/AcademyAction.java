package cn.apply.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.apply.base.BaseAction;
import cn.apply.domain.Academy;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class AcademyAction extends BaseAction<Academy> {
	
	/**
	 * 学院基本信息列表
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		return "list";
	}
	
	/**
	 * 学院基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		return "save";
	}
}
