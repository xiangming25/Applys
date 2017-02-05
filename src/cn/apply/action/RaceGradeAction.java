package cn.apply.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.apply.base.BaseAction;
import cn.apply.domain.RaceGrade;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class RaceGradeAction extends BaseAction<RaceGrade> {
	
	/**
	 * 竞赛基本信息列表
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		return "list";
	}
	
	/**
	 * 竞赛基本信息详情
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception {
		return "detail";
	}
	
	/**
	 * 竞赛基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		return "save";
	}
}
